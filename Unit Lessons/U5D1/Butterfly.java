public class Butterfly extends Animal {
    // constructors
    public Butterfly(String name, String species, int age, int hunger) {
        validateSpecies(species);
        validateAge(age);
        validateHunger(hunger);

        this.name = name;
        this.species = species;
        this.age = age;
        this.hunger = hunger;
        isAlive = true;
    }

    // inherited methods
    public boolean equals(Butterfly other) {
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
        String data = "== Butterfly " + name + "==\n";
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
    public void mate(Butterfly other) {
        if (!(this.isAlive) || !(other.isAlive)) {
            throw new IllegalArgumentException("Cannot mate with a dead butterfly!");
        }
        if (!(this.species.equals(other.species))) {
            throw new IllegalArgumentException(
                    "Cannot mate with a butterfly of a different species!");
        }
    }

    public void feed() {
        if (!(this.isAlive)) {
            throw new IllegalArgumentException("A dead butterfly cannot feed!");
        }

        System.out.println(name + " has fed!");
        hunger -= 10;
        validateHunger(hunger);
    }
}
