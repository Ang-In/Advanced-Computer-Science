public class UniversalTester {
    public static void main(String[] args) {
        System.out.println("-- Testing Assignment Class -- \n");
        testAssignmentClass();
        System.out.println(); // readability space

        System.out.println("-- Testing Student Class -- \n");
        testStudentClass();

        System.out.println("Testing Hub Class:");
        testHubClass();
    }

    public static void testAssignmentClass() {
        String testName = null;

        // Test Case - Edge Case: Null name
        try {
            Assignment testAssignment = new Assignment(testName, "");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the name was null, as intended");
        }
    }

    public static void testStudentClass() {
        Utils.printTestingHeader("Student");
        testStudent();
        System.out.println();

        Utils.printTestingHeader("changeName");
        testChangeName();
        System.out.println();

        Utils.printTestingHeader("resetPassword");
        testResetPassword();
        System.out.println();
    }

    public static void testStudent() {
        System.out.println("Testing Name Exceptions:");
        testStudentName();
        System.out.println();

        System.out.println("Testing Password Exceptions:");
        testStudentPassword();
        System.out.println();

        System.out.println("Testing Email Exceptions:");
        testStudentEmail();
    }

    public static void testStudentName() {
        String testName = null;

        // Test Case - Edge Case: Null name
        try {
            Student testStudent = new Student(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the name was null, as intended");
        }

        // Test Case - Edge Case: Empty name
        try {
            testName = "";
            Student testStudent = new Student(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the name was empty, as intended");
        }

        // Test Case - Edge Case: Invalid name (contains @)
        try {
            testName = "@CC";
            Student testStudent = new Student(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the name had an '@', as intended");
        }

        // Test Case - Edge Case: Duplicate Name
        try {
            testName = "CC";
            Student otherStudent = new Student(testName, "tester", "cc201@gmail.com");
            Student testStudent = new Student(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the name already existed, as intended");
        }
    }

    public static void testStudentPassword() {
        String testPassword = null;

        // Test Case - Edge Case: Null password

        try {
            Student testStudent = new Student("CC", testPassword, "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the password was null, as intended");
        }

        // Test Case - Edge Case: Empty password
        try {
            testPassword = "";
            Student testStudent = new Student("CC", testPassword, "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the password was empty, as intended");
        }
    }

    public static void testStudentEmail() {

        String testEmail = null;
        // Test Case - Edge Case: Null email
        try {
            Student testStudent = new Student("CC", "tester", testEmail);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the email was null, as intended");
        }

        // Test Case - Edge Case: Empty email
        try {
            testEmail = "";
            Student testStudent = new Student("CC", "tester", testEmail);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the email was empty, as intended");
        }

        // Test Case - Edge Case: Invalid email
        try {
            testEmail = "cc101";
            Student testStudent = new Student("CC", "tester", testEmail);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the email was invalid, as intended");
        }
    }

    public static void testChangeName() {
        Student testStudent = new Student("MC", "tester", "mc102@gmail.com");
        String testName = "@MC";
        // Test Case - Edge Case: Invalid name (contains @)
        try {
            testStudent.changeName(testName);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the name had an '@', as intended");
        }

        // Test Case - Edge Case: Duplicate Name
        try {
            testName = "CC";
            testStudent.changeName(testName);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the name already existed, as intended");
        }
    }

    public static void testResetPassword() {
        Student testStudent = new Student("Anna", "tester", "ah103@gmail.com");

        // Test Case - Edge Case: Missing Name
        try {
            testStudent.name = "";
            testStudent.resetPassword();
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the name was missing', as intended");
        }
    }

    public static void testHubClass() {
        Utils.printTestingHeader("registerStudent");
        testRegisterStudent();
        System.out.println();

        Utils.printTestingHeader("loginStudent");
        testLoginStudent();
        System.out.println();
    }

    public static void testRegisterStudent() {
        System.out.println("Testing Student Name Exceptions:");
        testRegisterName();
        System.out.println();
    }

    public static void testLoginStudent() {
        Hub testHub = new Hub();
        String testName = "admin";
        String testPassword = "newTester";
        Student testStudent = testHub.registerStudent(testName, testPassword, "admin01@gmail.com");

        // Test Case - Edge Case: Null name
        try {
            testName = null;
            testHub.loginStudent(testName, testPassword);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the given name was null, as intended");
        }

        // Test Case - Edge Case: Empty name
        try {
            testName = "";
            testHub.loginStudent(testName, testPassword);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the given name was empty, as intended");
        }

        // Test Case - Edge Case: Wrong name
        try {
            testName = "MC";
            testHub.loginStudent(testName, testPassword);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the given name was not registered, as intended");
        }

        // Test Case - Edge Case: Null password

        try {
            testName = "admin";
            testPassword = null;
            testHub.loginStudent(testName, testPassword);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the password was null, as intended");
        }

        // Test Case - Edge Case: Empty password
        try {
            testPassword = "";
            testHub.loginStudent(testName, testPassword);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the password was empty, as intended");
        }

        // Test Case - Edge Case: Wrong password
        try {
            testPassword = "hello world";
            testHub.loginStudent(testName, testPassword);
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the password was incorrect, as intended");
        }
    }

    public static void testRegisterName() {
        Hub testHub = new Hub();
        String testName = null;

        // Test Case - Edge Case: Null name
        try {
            testHub.registerStudent(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the student's name was null, as intended");
        }

        // Test Case - Edge Case: Empty name
        try {
            testName = "";
            testHub.registerStudent(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the student's name was empty, as intended");
        }

        // Test Case - Edge Case: Invalid name (contains @)
        try {
            testName = "@CC";
            testHub.registerStudent(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the student's name had an '@', as intended");
        }

        // Test Case - Edge Case: Duplicate Name
        try {
            testName = "CC";
            testHub.registerStudent(testName, "tester", "cc201@gmail.com"); // other, dupe student
            testHub.registerStudent(testName, "tester", "cc101@gmail.com");
            System.out.println("Expected exception!");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the student's name already exists, as intended");
        }
    }

}
