public class Player {
    private int health;
    private String name;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Player() {
        this("Alex", 100);
    }

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    // OVERLOADING:
    // happens when there are two methods with the same name but different parameters
    public void eat(Food food) {
        System.out.println(
                name + " ate some " + food.getName() + " and gained " + food.getQuality() + " HP!");
        health += food.getQuality();
    }

    public void eat(Rock rock) {
        System.out.println(name + " ate rocks. Yeowch!");
        health -= 100;
    }



    public static void main(String[] args) {
        Player player = new Player("Matthew", 100);
        Food sushi = new Food("Sushi", 20);
        player.eat(sushi);

        Food pizza = new Food("Pizza", 15);
        player.eat(pizza);
    }
}
