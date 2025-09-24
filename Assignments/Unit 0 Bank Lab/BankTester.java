public class BankTester {
    public static void main(String[] args) {
        Bank bank1 = new Bank(3, 5); // instantiate a new Bank object

        Bank bank2 = new Bank(4, 5); // instantiate a new Bank object

        System.out.println("Total employees at Bank 1: " + bank1.computeTotalEmployees());
        // should print 8

        bank2.setNumberOfLoanOfficers(3);
        // bank2 now has 3 loan officers

        System.out.println("Total number of tellers at Bank 1: " + bank1.getNumberOfTellers());
        // should print 5

        System.out.println("Is Bank1 the same as Bank 2: " + bank1.equals(bank2));
        // should print true

        System.out.println(bank2);
        // prints "This bank has 3 loan officers and 5 tellers."

        System.out.println("Employee Ratio in Bank 1 (Loan Officers over Tellers): "
                + bank1.getEmployeeRatio());

        System.out
                .println("Total salary of all workers in Bank 1: " + bank1.calculateTotalSalary());


    }
}
