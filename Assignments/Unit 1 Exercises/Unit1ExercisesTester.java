public class Unit1ExercisesTester {
    public static void main(String[] args) {
        // Testing helloName
        System.out.println("== Testing helloName() ==");
        System.out.println(Utils.testerLabel("helloName", "Bob") + Unit1Exercises.helloName("Bob"));
        System.out.println(
                Utils.testerLabel("helloName", "Alice") + Unit1Exercises.helloName("Alice"));
        System.out.println(Utils.testerLabel("helloName", "X") + Unit1Exercises.helloName("X"));
        System.out.println("");

        // Testing makeOutWord()
        System.out.println("== Testing makeOutWord() ==");
        System.out.println(Utils.testerLabel("makeOutWord", "<<>> + Yay")
                + Unit1Exercises.makeOutWord("<<>>", "Yay"));
        System.out.println(Utils.testerLabel("makeOutWord", "<<>> + WooHoo")
                + Unit1Exercises.makeOutWord("<<>>", "WooHoo"));
        System.out.println(Utils.testerLabel("makeOutWord", "[[]] + Yay")
                + Unit1Exercises.makeOutWord("[[]]", "Yay"));
        System.out.println("");

        // Testing withoutEnd()
        System.out.println("== Testing withoutEnd() ==");
        System.out.println(
                Utils.testerLabel("withoutEnd", "Hello") + Unit1Exercises.withoutEnd("Hello"));
        System.out.println(
                Utils.testerLabel("withoutEnd", "java") + Unit1Exercises.withoutEnd("java"));
        System.out.println(
                Utils.testerLabel("withoutEnd", "coding") + Unit1Exercises.withoutEnd("coding"));
        System.out.println(Utils.testerLabel("withoutEnd", "an") + Unit1Exercises.withoutEnd("an"));
        System.out.println("");


        // Testing comboString()
        System.out.println("== Testing comboString() ==");
        System.out.println(Utils.testerLabel("comboString", "Hello, hi")
                + Unit1Exercises.comboString("Hello", "hi"));
        System.out.println(Utils.testerLabel("comboString", "hi, Hello")
                + Unit1Exercises.comboString("hi", "Hello"));
        System.out.println(Utils.testerLabel("comboString", "aaa, b")
                + Unit1Exercises.comboString("aaa", "b"));
        System.out.println("");

        // Testing left2()
        System.out.println("== Testing left2() ==");
        System.out.println(Utils.testerLabel("left2", "Hello") + Unit1Exercises.left2("Hello"));
        System.out.println(Utils.testerLabel("left2", "java") + Unit1Exercises.left2("java"));
        System.out.println(Utils.testerLabel("left2", "Hi") + Unit1Exercises.left2("Hi"));
        System.out.println("");

        // Testing middleThree()
        System.out.println("== Testing middleThree() ==");
        System.out.println(
                Utils.testerLabel("middleThree", "Candy") + Unit1Exercises.middleThree("Candy"));
        System.out.println(
                Utils.testerLabel("middleThree", "and") + Unit1Exercises.middleThree("and"));
        System.out.println(Utils.testerLabel("middleThree", "solving")
                + Unit1Exercises.middleThree("solving"));
        System.out.println("");


        // Testing withoutEnd2()
        System.out.println("== Testing withoutEnd2() ==");
        System.out.println(
                Utils.testerLabel("withoutEnd2", "Hello") + Unit1Exercises.withoutEnd2("Hello"));
        System.out.println(
                Utils.testerLabel("withoutEnd2", "abc") + Unit1Exercises.withoutEnd2("abc"));
        System.out
                .println(Utils.testerLabel("withoutEnd2", "ab") + Unit1Exercises.withoutEnd2("ab"));
        System.out.println("");

        // Testing stringEnds()
        System.out.println("== Testing stringEnds() ==");
        System.out.println(Utils.testerLabel("stringEnds", "Hello, 2")
                + Unit1Exercises.stringEnds("Hello", 2));
        System.out.println(Utils.testerLabel("stringEnds", "Chocolate, 3")
                + Unit1Exercises.stringEnds("Chocolate", 3));
        System.out.println(Utils.testerLabel("stringEnds", "Chocolate, 1")
                + Unit1Exercises.stringEnds("Chocolate", 1));
        System.out.println("");

        // Testing hasBad()
        System.out.println("== Testing hasBad() ==");
        System.out
                .println(Utils.testerLabel("hasBad", "badxxxx") + Unit1Exercises.hasBad("badxxxx"));
        System.out
                .println(Utils.testerLabel("hasBad", "xbadxxx") + Unit1Exercises.hasBad("xbadxxx"));
        System.out
                .println(Utils.testerLabel("hasBad", "xxbadxx") + Unit1Exercises.hasBad("xxbadxx"));
        System.out.println("");

        // Testing countVowels()
        System.out.println("== Testing countVowels() ==");
        System.out.println(
                Utils.testerLabel("countVowels", "Hello") + Unit1Exercises.countVowels("Hello"));
        System.out.println(
                Utils.testerLabel("countVowels", "abc") + Unit1Exercises.countVowels("abc"));
        System.out.println(Utils.testerLabel("countVowels", "") + Unit1Exercises.countVowels(""));
        System.out.println("");

        // Testing countCode()
        System.out.println("== Testing countCode() ==");
        System.out.println(Utils.testerLabel("countCode", "aaacodebbb")
                + Unit1Exercises.countCode("aaacodebbb"));
        System.out.println(Utils.testerLabel("countCode", "codexxcode")
                + Unit1Exercises.countCode("codexxcode"));
        System.out.println(Utils.testerLabel("countCode", "cozexxcope")
                + Unit1Exercises.countCode("cozexxcope"));
        System.out.println("");
    }
}
