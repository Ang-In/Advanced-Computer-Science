public class AnimalTester {
    // this tester's a bit different style from my other ones
    // i wanted to experiment with how to simplify my testers
    // balance thoroughness with practicality schedule-wise
    // other than that everything's normal
    public static void main(String[] args) {

        System.out.println("=== Testing Bald Eagle ===");
        testBaldEagle();
        System.out.println();

        System.out.println("=== Testing Menelaus Blue Morpho Butterfly ===");
        testBlueMorpho();
        System.out.println();

        System.out.println("=== Testing Menelaus Caterpillar ===");
        testCaterpillar();
        System.out.println();
    }

    public static void testBaldEagle() {

        try {
            BaldEagle eagle = new BaldEagle("Liberty", 5, true, 60, 6.3, 120, 210, false);

            System.out.println("Constructor created BaldEagle successfully");

            // getters
            System.out.println("Name: " + eagle.getName());
            System.out.println("Age: " + eagle.getAge());
            System.out.println("Weight: " + eagle.getWeight());
            System.out.println("Hunger: " + eagle.getHunger());
            System.out.println("Wingspan: " + eagle.getWingspan());

            // setters
            eagle.setHunger(40);
            eagle.setWingspan(215);
            eagle.setNesting(true);

            System.out.println("After setters:");
            System.out.println("Hunger: " + eagle.getHunger());
            System.out.println("Wingspan: " + eagle.getWingspan());
            System.out.println("Nesting: " + eagle.isNesting());

            // methods
            eagle.feed();
            eagle.hunt();
            eagle.nest();

            // toString
            System.out.println("\n--- toString Output ---");
            System.out.println(eagle.toString());

        } catch (Exception e) {
            System.out.println("Unexpected exception!");
            System.out.println(e);
        }
    }

    public static void testBlueMorpho() {

        try {
            MenelausBlueMorpho morpho1 =
                    new MenelausBlueMorpho("Azure", 70, true, 40, 0.4, 5, 14, false);

            MenelausBlueMorpho morpho2 =
                    new MenelausBlueMorpho("Cobalt", 65, true, 50, 0.4, 6, 15, false);

            System.out.println("Constructor created BlueMorpho successfully");

            // getters
            System.out.println("Name: " + morpho1.getName());
            System.out.println("Age: " + morpho1.getAge());
            System.out.println("Wingspan: " + morpho1.getWingspan());
            System.out.println("Hunger: " + morpho1.getHunger());

            // setters
            morpho1.setHunger(30);
            morpho1.setWingspan(16);
            morpho1.setCamoflaged(true);

            System.out.println("After setters:");
            System.out.println("Hunger: " + morpho1.getHunger());
            System.out.println("Wingspan: " + morpho1.getWingspan());
            System.out.println("Camouflaged: " + morpho1.isCamouflaged());

            // methods
            morpho1.feed();
            morpho1.camoflage();
            morpho1.mate(morpho2);

            // toString
            System.out.println("\n--- toString Output ---");
            System.out.println(morpho1.toString());

        } catch (Exception e) {
            System.out.println("Unexpected exception!");
            System.out.println(e);
        }
    }

    public static void testCaterpillar() {

        try {

            MenelausCaterpillar caterpillar =
                    new MenelausCaterpillar("Leafy", 60, true, 0, 0.2, 1, 0, false);

            System.out.println("Constructor created Caterpillar successfully");

            // getters
            System.out.println("Name: " + caterpillar.getName());
            System.out.println("Age: " + caterpillar.getAge());
            System.out.println("Hunger: " + caterpillar.getHunger());
            System.out.println("Pupating: " + caterpillar.isPupating());

            // setters
            caterpillar.setHunger(20);
            caterpillar.setPupating(false);

            System.out.println("After setters:");
            System.out.println("Hunger: " + caterpillar.getHunger());
            System.out.println("Pupating: " + caterpillar.isPupating());

            // methods
            caterpillar.feed();

            caterpillar.setHunger(0);
            caterpillar.setAge(60);
            caterpillar.pupate();

            System.out.println("After pupate(): " + caterpillar.isPupating());

            MenelausBlueMorpho butterfly = caterpillar.metamorphose();

            System.out.println("Metamorphosis successful!");

            // print butterfly
            System.out.println("\n--- Butterfly Created ---");
            System.out.println(butterfly.toString());

            // toString
            System.out.println("\n--- Caterpillar toString Output ---");
            System.out.println(caterpillar.toString());

        } catch (Exception e) {
            System.out.println("Unexpected exception!");
            System.out.println(e);
        }
    }
}
