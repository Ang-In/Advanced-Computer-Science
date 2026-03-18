public class Chimera extends Monster {
    // constructors
    public Chimera(String name) {
        super(name, ElementType.FIRE, 50, 50, 30, 120, "Pepper Breath", "Deathly Scream",
                ElementType.FIRE, ElementType.AIR);
    }

    public Chimera() {
        super("Chimera", ElementType.FIRE, 50, 50, 30, 120, "Pepper Breath", "Deathly Scream",
                ElementType.FIRE, ElementType.AIR);
    }

    // methods
    public String victoryNoise() {
        return name + " screeches in glee!";
    }
}
