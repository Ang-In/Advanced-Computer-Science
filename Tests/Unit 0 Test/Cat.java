public class Cat {
	// 1. made public lowercase, 2. changed class name to Cat to match file name
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;

	// 2-Parameter Constructor
	public Cat(String name, String breed) {
		// 3. Capitalized constructor to match class name, 4. added parameter String breed
		this.name = name; // 5. used this.name
		this.breed = breed; // 6. used this.breed
		this.isHungry = true; // 7. changed yes to true
		livesRemaining = 9;
	}

	public String getName() {
		// 8. changed to String method
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsHungry() {
		// 9. changed to Boolean method, 10. changed name to camelCase
		return isHungry;
	}

	// 11. added getBreed and setBreed
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void feed() {
		// 12. changed to void function
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		// 13. swapped == for .equals()
		return this.name.equals(other.name) && this.breed.equals(other.breed)
				&& this.livesRemaining == other.livesRemaining;
		// 14. swapped to == as a comparison
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
		// 15. changed to return string instead of sout
	}
}
