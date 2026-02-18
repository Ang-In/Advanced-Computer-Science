public class Caterpillar extends Animal {
    // instance variables
    boolean pupating;

    // constructors
    public Caterpillar(String name, String species, int age, int hunger) {
        validateSpecies(species);
        validateAge(age);
        validateHunger(hunger);

        this.species = species;
        this.age = age;
        this.hunger = hunger;
        isAlive = true;
        pupating = false;
    }

    // inherited methods
    public boolean equals(Caterpillar other) {
        if (!(this.species.equals(other.species))) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.hunger != other.hunger) {
            return false;
        }

        return false;
    }

    public String toString() {
        String data = "== Caterpillar " + name + "==\n";
        data += "Species: " + species + "\n";
        data += "Age: " + age + "\n";
        data += "Hunger: " + hunger + "\n";
        if (isAlive) {
            data += "Status: Alive";
        } else {
            data += "Status: Deceased";
        }

        return data;
    }

    // methods
    public void pupate() {
        if (!(this.isAlive)) {
            throw new IllegalArgumentException("A dead caterpillar cannot pupate!");
        }
        if (hunger == 0 && age > 3) {
            pupating = true;
        }
    }

    public Butterfly metamorphose() {
        if (!(this.isAlive)) {
            throw new IllegalArgumentException("A dead caterpillar cannot metamorphose!");
        }
        if (!pupating) {
            throw new IllegalArgumentException(
                    "This caterpillar hasn't pupated yet - cannot metamorphose!");
        }

        System.out.println(name + "has metamorphosed into a butterfly!");
        Butterfly metamorphosed = new Butterfly(name, species, age, 50);
        return metamorphosed;
    }

    public void feed() {
        if (!(this.isAlive)) {
            throw new IllegalArgumentException("A dead caterpillar cannot pupate!");
        }
        if (pupating) {
            throw new IllegalArgumentException("This caterpillar is pupating - it cannot feed!");
        }

        System.out.println(name + " has fed!");
        hunger -= 10;
        validateHunger(hunger);
    }
}
