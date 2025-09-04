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

        brian.growl();
        System.out.println(brian.growl());


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

    // Challenge Completed
}
