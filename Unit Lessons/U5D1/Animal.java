public abstract class Animal {
    // instance variables
    protected String name;
    protected String superfamily;
    protected String species;
    protected int age;
    protected int hunger;
    protected boolean isAlive;

    // constructors
    // to-do: edit this to function properly for subclasses/children
    /*public Animal(String name, String superfamily, String species, int age, int hunger) {
        validateSpecies(species);
        validateAge(age);
        validateHunger(hunger);

        this.name = name;
        this.superfamily = superfamily;
        this.species = species;
        this.age = age;
        this.hunger = hunger;
        isAlive = true;
    }*/

    // getters
    public String getName() {
        return name;
    }

    public String getSuperfamily() {
        return superfamily;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getHunger() {
        return hunger;
    }

    // setters
    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public void setSuperfamily(String superfamily) {
        validateSuperfamily(superfamily);
        this.superfamily = superfamily;
    }

    public void setSpecies(String species) {
        validateSpecies(species);
        this.species = species;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public void setHunger(int hunger) {
        validateHunger(hunger);
        this.hunger = hunger;
    }

    // methods
    public abstract void feed();

    public void die() {
        System.out.println(name + " has died!");
        isAlive = false;
    }

    protected void validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Cannot use a nonexistent name!");
        }
    }

    protected void validateSuperfamily(String superfamily) {
        if (superfamily == null) {
            throw new IllegalArgumentException("Cannot use a nonexistent superfamily!");
        }
    }

    protected void validateSpecies(String species) {
        if (species == null) {
            throw new IllegalArgumentException("Cannot document a speciesless animal!");
        }
    }

    protected void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("No animal is negative years old!");
        }
    }

    protected void validateHunger(int hunger) {
        if (hunger < 0) {
            hunger = 0;
        }
        if (hunger > 100) {
            this.die();
            hunger = 100;
        }
    }
}
