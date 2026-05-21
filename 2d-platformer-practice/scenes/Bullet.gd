
class_name Bullet
extends Area2D

@export var speed: float = 600.0
@export var direction: int = 1
@export var damage: int = 1

func _ready() -> void:
	body_entered.connect(_on_body_entered)
	$Timer.timeout.connect(queue_free)

func _physics_process(delta: float) -> void:
	position.x += direction * speed * delta

func _on_body_entered(body: Node) -> void:
	if body.is_in_group("player"):
		return  # Ignore the shooter so the bullet does not die on spawn.
	if body.is_in_group("enemies"):
		body.take_damage(damage)
	queue_free()
