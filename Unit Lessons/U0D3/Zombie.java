public class Zombie {
    // instance variables (attributes)

    // green
    String skinColor = "green";

    // rot and dead
    boolean isDead = true;

    // humans eaten count
    int humansEaten = 0;

    // main

    public static void main(String[] args) {
        Zombie phillip = new Zombie();

        phillip.growl();
        System.out.println(phillip.growl());
        System.out.println("Phillip ate " + phillip.getHumansEaten() + " humans.");

        Zombie brian = new Zombie();

        System.out.println(brian.growl());

        System.out.println(brian.humansEaten);
        brian.eatHuman();
        System.out.println(brian.humansEaten);
        brian.feast(14);
        System.out.println(brian.humansEaten);

    }

    // methods (behaviors)

    // growl
    public String growl() {
        return "grrrsssaaaaajlhhhhh...";
    }

    // Challenge: make a new method that returns the number of humans eaten

    public int getHumansEaten() {
        return humansEaten;
    }

    public void eatHuman() {
        humansEaten++;
    }

    public void feast(int humanCount) {
        humansEaten += humanCount;
    }
}
