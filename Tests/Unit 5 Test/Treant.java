public class Treant extends Monster {
    // constructors
    public Treant(String name) {
        super(name, ElementType.EARTH, 100, 40, 50, 60, "Vine Whip", "Air Slash", ElementType.EARTH,
                ElementType.AIR);
    }

    public Treant() {
        super("Treant", ElementType.EARTH, 100, 40, 50, 60, "Vine Whip", "Air Slash",
                ElementType.EARTH, ElementType.AIR);
    }

    // methods
    public String victoryNoise() {
        return name + " rumbles with joy!";
    }
}
