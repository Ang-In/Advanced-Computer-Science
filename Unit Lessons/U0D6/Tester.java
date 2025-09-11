public class Tester {
    public static void main(String[] args) {

        // PEMDAS (PBMEMDMASRCB)

        // 1. Parentheses, Brackets, Member Access (Methods)
        String demo = "Hello";
        System.out.println(5 * demo.length());

        // 2. Exponents
        Math.pow(2, 4); // Technically level 1 due to method

        // 3. Multiplication, Division, Modular Arithmatic
        System.out.println(5 * 4 + (5 / 6) + 7 % 1);

        // 4. Addition + Subtraction
        System.out.println(5 - 6 + 9);

        // 5. Relational Operators (<, >, <=, >=)
        System.out.println(6 < 7);

        // 6. Comparison Operators (==, !=)
        System.out.println(8 == 9);

        // 7. Boolean Operators (||, &&)
        System.out.println(8 == 9 || 8 != 9);


        System.out.println((3 + Integer.parseInt("123")) * 9 / 8 + 7 >= 5);
        // Challenge: Give me the 7 operations in order
        // 1. Integer.parseInt("123") = 123
        // 2. 3 + 123 (Parentheses) = 126
        // 3. 126 * 9 = 1134
        // 4. 1134/8 = 141 (truncated)
        // 5. 141 + 7 = 148
        // 6. 148 >= 5 = true
        // 7. System.out.println(true)
    }
}
