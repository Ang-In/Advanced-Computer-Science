public abstract class Animal {
    private double age;
    private String name;
    private boolean isAlive;
    protected double hunger;
    private double weight;
    private int speed;

    public abstract void feed();

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void die() {
        System.out.println(name + " died.");
        isAlive = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract String toString();

}
