public class CatTester {
    public static void main(String[] args) {
        // testing constructors + toString()
        Cat kitty1 = new Cat();
        System.out.println("kitty1 (base constructor):\n" + kitty1.toString());
        System.out.println();

        // testing setters
        kitty1.setName("Cotton");
        kitty1.setOwnerName("CC");
        kitty1.setCatId("1"); // edge case
        kitty1.setCatChar('a'); // edge case
        kitty1.setMoodLevel(88); // edge case
        kitty1.setHungry(false);
        System.out.println("kitty1 (after setters):\n" + kitty1.toString());
        System.out.println();

        // testing equals()
        Cat kitty2 = new Cat("Cotton", "CC", 10, kitty1.getCatId());
        kitty2.setCatChar('a'); // matching kitty1
        kitty2.setHungry(false); // matching kitty1
        System.out.println("Are kitty1 and kitty2 equal: " + kitty1.equals(kitty2)); // true
        System.out.println();

        // testing bootUp()
        System.out.println("bootUp(kitty1):");
        PurrfectUtils.bootUp(kitty1);
        System.out.println();

        // testing pet()
        System.out.println("pet(kitty1):");
        PurrfectUtils.pet(kitty1);
        System.out.println();

        // testing trimClaws()
        System.out.println("trimClaws(kitty1):");
        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(kitty1);
        }
        System.out.println();

        // testing cleanLitterBox()
        System.out.println("cleanLitterBox(kitty1):");
        PurrfectUtils.cleanLitterBox(kitty1);
        System.out.println();

        // testing feed()
        System.out.println("feed(kitty1):");
        PurrfectUtils.feed(kitty1);
        System.out.println();
    }
}
