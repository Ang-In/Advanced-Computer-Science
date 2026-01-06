public class Unit2ExercisesTester {
    public static void main(String[] args) {
        // Testing alarmClock
        System.out.println("== Testing alarmClock() ==");
        System.out.println(
                Utils.testerLabel("alarmClock", "1, false") + Unit2Exercises.alarmClock(1, false));
        System.out.println(
                Utils.testerLabel("alarmClock", "5, false") + Unit2Exercises.alarmClock(5, false));
        System.out.println(
                Utils.testerLabel("alarmClock", "0, false") + Unit2Exercises.alarmClock(0, false));
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
        System.out
                .println(Utils.testerLabel("fizzString", "fig") + Unit2Exercises.fizzString("fig"));
        System.out
                .println(Utils.testerLabel("fizzString", "dib") + Unit2Exercises.fizzString("dib"));
        System.out
                .println(Utils.testerLabel("fizzString", "fib") + Unit2Exercises.fizzString("fib"));
        System.out.println(
                Utils.testerLabel("fizzString", "build") + Unit2Exercises.fizzString("build"));
        // should be build
        System.out.println("");


        // Testing doubleChar()
        System.out.println("== Testing doubleChar() ==");
        System.out
                .println(Utils.testerLabel("doubleChar", "The") + Unit2Exercises.doubleChar("The"));
        System.out.println(
                Utils.testerLabel("doubleChar", "AAbb") + Unit2Exercises.doubleChar("AAbb"));
        System.out.println(Utils.testerLabel("doubleChar", "Hi-There")
                + Unit2Exercises.doubleChar("Hi-There"));
        System.out
                .println(Utils.testerLabel("doubleChar", "null") + Unit2Exercises.doubleChar(null));
        // should be ""
        System.out.println("");


        // Testing countHi()
        System.out.println("== Testing countHi() ==");
        System.out.println(
                Utils.testerLabel("countHi", "abc hi ho") + Unit2Exercises.countHi("abc hi ho"));
        System.out.println(
                Utils.testerLabel("countHi", "ABChi hi") + Unit2Exercises.countHi("ABChi hi"));
        System.out.println(Utils.testerLabel("countHi", "hihi") + Unit2Exercises.countHi("hihi"));
        System.out.println(Utils.testerLabel("countHi", "null") + Unit2Exercises.countHi(null));
        // should be 0
        System.out.println("");

        // Testing catDog()
        System.out.println("== Testing catDog() ==");
        System.out.println(Utils.testerLabel("catDog", "catdog") + Unit2Exercises.catDog("catdog"));
        System.out.println(Utils.testerLabel("catDog", "catcat") + Unit2Exercises.catDog("catcat"));
        System.out.println(Utils.testerLabel("catDog", "1cat1cadodog")
                + Unit2Exercises.catDog("1cat1cadodog"));
        System.out.println(Utils.testerLabel("catDog", "null") + Unit2Exercises.catDog(null));
        // should be false
        System.out.println("");


        // Testing mixString()
        System.out.println("== Testing mixString() ==");
        System.out.println(Utils.testerLabel("mixString", "abc, xyz")
                + Unit2Exercises.mixString("abc", "xyz"));
        System.out.println(Utils.testerLabel("mixString", "Hi, There")
                + Unit2Exercises.mixString("Hi", "There"));
        System.out.println(Utils.testerLabel("mixString", "xxxx, There")
                + Unit2Exercises.mixString("xxxx", "There"));
        System.out.println(
                Utils.testerLabel("mixString", "Hi, null") + Unit2Exercises.mixString("Hi", null));
        // should be hi
        System.out.println("");

        // Testing repeatEnd()
        System.out.println("== Testing repeatEnd() ==");
        System.out.println(
                Utils.testerLabel("repeatEnd", "Hello, 3") + Unit2Exercises.repeatEnd("Hello", 3));
        System.out.println(
                Utils.testerLabel("repeatEnd", "Hello, 2") + Unit2Exercises.repeatEnd("Hello", 2));
        System.out.println(
                Utils.testerLabel("repeatEnd", "Hello, 1") + Unit2Exercises.repeatEnd("Hello", 1));
        System.out.println(
                Utils.testerLabel("repeatEnd", "null, 5") + Unit2Exercises.repeatEnd(null, 5));
        // should be ""
        System.out.println("");

        // Testing endOther()
        Unit2Exercises.endOther("Hiabc", "abc");
        System.out.println("== Testing endOther() ==");
        System.out.println(Utils.testerLabel("endOther", "Hiabc, abc")
                + Unit2Exercises.endOther("Hiabc", "abc"));
        System.out.println(Utils.testerLabel("endOther", "AbC, HiaBc")
                + Unit2Exercises.endOther("AbC", "HiaBc"));
        System.out.println(Utils.testerLabel("endOther", "abc, abXabc")
                + Unit2Exercises.endOther("abc", "abXabc"));
        System.out.println(
                Utils.testerLabel("endOther", "null, abc") + Unit2Exercises.endOther(null, "abc"));
        // should be false
        System.out.println("");

        // Testing countCode()
        System.out.println("== Testing countCode() ==");
        System.out.println(Utils.testerLabel("countCode", "aaacodebbb")
                + Unit2Exercises.countCode("aaacodebbb"));
        System.out.println(Utils.testerLabel("countCode", "codexxcode")
                + Unit2Exercises.countCode("codexxcode"));
        System.out.println(Utils.testerLabel("countCode", "cozexxcope")
                + Unit2Exercises.countCode("cozexxcope"));
        System.out.println(Utils.testerLabel("countCode", "null") + Unit2Exercises.countCode(null));
        // should be 0
        System.out.println("");

        // Testing countEvens()
        System.out.println("== Testing countEvens() ==");
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        System.out.println(Utils.testerLabel("countEvens", "[2, 1, 2, 3, 4]")
                + Unit2Exercises.countEvens(arr1));
        System.out.println(
                Utils.testerLabel("countEvens", "[2, 2, 0]") + Unit2Exercises.countEvens(arr2));
        System.out.println(
                Utils.testerLabel("countEvens", "[1, 3, 5]") + Unit2Exercises.countEvens(arr3));
        System.out
                .println(Utils.testerLabel("countEvens", "null") + Unit2Exercises.countEvens(null));
        // should be 0
        System.out.println("");

        // Testing bigDiff()
        int[] arr01 = {10, 3, 5, 6};
        int[] arr02 = {7, 2, 10, 9};
        int[] arr03 = {2, 10, 7, 2};
        System.out.println("== Testing bigDiff() ==");
        System.out.println(
                Utils.testerLabel("bigDiff", "[10, 3, 5, 6]") + Unit2Exercises.bigDiff(arr01));
        System.out.println(
                Utils.testerLabel("bigDiff", "[7, 2, 10, 9]") + Unit2Exercises.bigDiff(arr02));
        System.out.println(
                Utils.testerLabel("bigDiff", "[2, 10, 7, 2]") + Unit2Exercises.bigDiff(arr03));
        System.out.println(Utils.testerLabel("bigDiff", "null") + Unit2Exercises.bigDiff(null));
        // should be -1
        System.out.println("");

        // Testing sum13()
        int[] sumArray1 = {1, 2, 2, 1};
        int[] sumArray2 = {1, 1};
        int[] sumArray3 = {1, 2, 2, 1, 13};
        int[] sumArrayEmpty = new int[0];
        System.out.println("== Testing sum13() ==");
        System.out.println(
                Utils.testerLabel("sum13", "[1, 2, 2, 1]") + Unit2Exercises.sum13(sumArray1));
        System.out.println(Utils.testerLabel("sum13", "[1, 1]") + Unit2Exercises.sum13(sumArray2));
        System.out.println(
                Utils.testerLabel("sum13", "[1, 2, 2, 1, 13]") + Unit2Exercises.sum13(sumArray3));
        System.out.println(Utils.testerLabel("sum13", "[]") + Unit2Exercises.sum13(sumArrayEmpty));
        // should be 0
        System.out.println("");

        // Testing fizzArray()
        System.out.println("== Testing fizzArray() ==");
        System.out.println(Utils.testerLabel("fizzArray", "4") + Unit2Exercises.fizzArray(4));
        System.out.println(Utils.testerLabel("fizzArray", "1") + Unit2Exercises.fizzArray(1));
        System.out.println(Utils.testerLabel("fizzArray", "10") + Unit2Exercises.fizzArray(10));
        System.out.println(Utils.testerLabel("fizzArray", "-1") + Unit2Exercises.fizzArray(-1));
        // should be []
        System.out.println("");
    }
}
