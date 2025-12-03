public class Unit2ExercisesTester {
    public static void main(String[] args) {
        // Testing alarmClock
        System.out.println("== Testing alarmClock() ==");
        System.out.println(
                Utils.testerLabel("alarmClock", "1, false") + Unit2Exercises.alarmClock(1, false));
        System.out.println(
                Utils.testerLabel("alarmClock", "5, false") + Unit2Exercises.alarmClock(5, false));
        System.out.println(Utils.testerLabel("alarmClock", "0, false") + Unit2Exercises.alarmClock(0, false));
        System.out.println("");

        // Testing love6()
        System.out.println("== Testing love6() ==");
        System.out.println(Utils.testerLabel("love6", "6, 4") + Unit2Exercises.love6(6, 4));
        System.out.println(Utils.testerLabel("love6", "4, 5") + Unit2Exercises.love6(4, 5));
        System.out.println(Utils.testerLabel("love6", "1, 5") + Unit2Exercises.love6(1, 5));
        System.out.println("");

        // Testing redTicket()
        System.out.println("== Testing redTicket() ==");
        System.out.println(
                Utils.testerLabel("redTicket", "2, 2, 2") + Unit2Exercises.redTicket(2, 2, 2));
        System.out.println(
                Utils.testerLabel("redTicket", "2, 2, 1") + Unit2Exercises.redTicket(2, 2, 1));
        System.out.println(
                Utils.testerLabel("redTicket", "0, 0, 0") + Unit2Exercises.redTicket(0, 0, 0));
        System.out.println(
                Utils.testerLabel("redTicket", "0, 1, 2") + Unit2Exercises.redTicket(0, 1, 2));
        // should be 1
        System.out.println("");


        // Testing fizzString()
        System.out.println("== Testing fizzString() ==");
        System.out.println(Utils.testerLabel("fizzString", "fig") + Unit2Exercises.fizzString("fig"));
        System.out.println(Utils.testerLabel("fizzString", "dib") + Unit2Exercises.fizzString("dib"));
        System.out.println(Utils.testerLabel("fizzString", "fib") + Unit2Exercises.fizzString("fib"));
        System.out.println(Utils.testerLabel("fizzString", "build") + Unit2Exercises.fizzString("build"));
        // should be build
        System.out.println("");

         
        // Testing doubleChar()
        System.out.println("== Testing doubleChar() ==");
        System.out.println(Utils.testerLabel("doubleChar", "The") + Unit2Exercises.doubleChar("The"));
        System.out.println(Utils.testerLabel("doubleChar", "AAbb") + Unit2Exercises.doubleChar("AAbb"));
        System.out.println(Utils.testerLabel("doubleChar", "Hi-There") + Unit2Exercises.doubleChar("Hi-There"));
        System.out.println(Utils.testerLabel("doubleChar", "null") + Unit2Exercises.doubleChar(null)); 
        // should be empty
        System.out.println("");

         
        // Testing countHi()
        System.out.println("== Testing countHi() ==");
        System.out.println(Utils.testerLabel("countHi", "abc hi ho") + Unit2Exercises.countHi("abc hi ho"));
        System.out.println(Utils.testerLabel("countHi", "ABChi hi") + Unit2Exercises.countHi("ABChi hi"));
        System.out.println(Utils.testerLabel("countHi", "hihi") + Unit2Exercises.countHi("hihi"));
        System.out.println(Utils.testerLabel("countHi", "null") + Unit2Exercises.countHi(null));
        // should be 0
        System.out.println("");

        // Testing withoutEnd2()
        System.out.println("== Testing withoutEnd2() ==");
        System.out.println(
                Utils.testerLabel("withoutEnd2", "The") + Unit2Exercises.withoutEnd2("The"));
        System.out.println(
                Utils.testerLabel("withoutEnd2", "abc") + Unit2Exercises.withoutEnd2("abc"));
        System.out
                .println(Utils.testerLabel("withoutEnd2", "ab") + Unit2Exercises.withoutEnd2("ab"));
        System.out.println("");

        /* */
        // Testing stringEnds()
        System.out.println("== Testing stringEnds() ==");
        System.out.println(Utils.testerLabel("stringEnds", "The, 2")
                + Unit2Exercises.stringEnds("The", 2));
        System.out.println(Utils.testerLabel("stringEnds", "Chocolate, 3")
                + Unit2Exercises.stringEnds("Chocolate", 3));
        System.out.println(Utils.testerLabel("stringEnds", "Chocolate, 1")
                + Unit2Exercises.stringEnds("Chocolate", 1));
        System.out.println("");

        // Testing hasBad()
        System.out.println("== Testing hasBad() ==");
        System.out
                .println(Utils.testerLabel("hasBad", "badxxxx") + Unit2Exercises.hasBad("badxxxx"));
        System.out
                .println(Utils.testerLabel("hasBad", "xbadxxx") + Unit2Exercises.hasBad("xbadxxx"));
        System.out
                .println(Utils.testerLabel("hasBad", "xxbadxx") + Unit2Exercises.hasBad("xxbadxx"));
        System.out.println("");

        // Testing countVowels()
        System.out.println("== Testing countVowels() ==");
        System.out.println(
                Utils.testerLabel("countVowels", "The") + Unit2Exercises.countVowels("The"));
        System.out.println(
                Utils.testerLabel("countVowels", "abc") + Unit2Exercises.countVowels("abc"));
        System.out.println(Utils.testerLabel("countVowels", "") + Unit2Exercises.countVowels(""));
        System.out.println("");

        // Testing countCode()
        System.out.println("== Testing countCode() ==");
        System.out.println(Utils.testerLabel("countCode", "aaacodebbb")
                + Unit2Exercises.countCode("aaacodebbb"));
        System.out.println(Utils.testerLabel("countCode", "codexxcode")
                + Unit2Exercises.countCode("codexxcode"));
        System.out.println(Utils.testerLabel("countCode", "cozexxcope")
                + Unit2Exercises.countCode("cozexxcope"));
        System.out.println("");*/
    }
}
