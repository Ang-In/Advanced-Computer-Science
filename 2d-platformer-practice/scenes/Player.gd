class_name Player
extends CharacterBody2D

# Public, designer-tunable surface (visible in the Inspector).
@export var speed: float = 220.0
@export var jump_velocity: float = -420.0

# Internal state (not in the Inspector).
var score: int = 0

func _ready() -> void:
	print("Player ready: ", name)
	print("Starting position: ", position)
	print("Speed: ", speed, ", Jump velocity: ", jump_velocity)
