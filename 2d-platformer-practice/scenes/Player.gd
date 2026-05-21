class_name Player
extends CharacterBody2D

@export var speed: float = 220.0
@export var jump_velocity: float = -520.0
@export var bullet_scene: PackedScene

@onready var sprite: AnimatedSprite2D = $AnimatedSprite2D
@onready var muzzle: Marker2D = $Muzzle
@onready var jump_sound = preload("res://assets/audio/jump.ogg")

var score: int = 0
var facing: int = 1

func _ready() -> void:
	print("Player ready: ", name)
	add_to_group("player")

func _physics_process(delta: float) -> void:
	# Gravity (only while in the air)
	if not is_on_floor():
		velocity += get_gravity() * delta

	# Jump (only from the floor)
	if Input.is_action_just_pressed("jump") and is_on_floor():
		velocity.y = jump_velocity
	
	# Horizontal movement
	var dir := Input.get_axis("move_left", "move_right")
	velocity.x = move_toward(velocity.x, dir * speed, speed * 0.5)
	
	if dir < 0 or dir > 0:
		sprite.play("run")
	else:
		sprite.play("idle")

	# Face the direction of movement
	if dir != 0.0:
		facing = int(sign(dir))
		sprite.flip_h = facing < 0
		muzzle.position.x = abs(muzzle.position.x) * facing

	if Input.is_action_just_pressed("shoot"):
		_shoot()

	move_and_slide()

func _shoot() -> void:
	if bullet_scene == null: return
	var b: Node = bullet_scene.instantiate()
	b.global_position = muzzle.global_position
	b.direction = facing
	get_tree().current_scene.add_child(b)
