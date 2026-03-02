import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class MemberTicket extends Ticket {
    // instance variables
    private static final double MEMBER_DISCOUNT = 0.25;
    private double totalPrice;

    // constructors
    public MemberTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    // inherited methods
    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Member");
    }

    @Override
    public void printPrice() {
        double totalPrice = generateTotalPrice();
        BigDecimal decimalFormatter = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue());
    }

    @Override
    public void printCancellationPolicy() {
        super.printCancellationPolicy();
        System.out.print(
                "Can be canceled within 24 hours before the event. No cancellation fee applies.\n");
        // use print(), not println() to keep everything on one line
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printMemberBenefits();
        printCancellationPolicy();
    }

    // methods
    public void printMemberBenefits() {
        System.out.println("Includes access to special discounts and complimentary refreshments.");
    }

    protected double generateTotalPrice() {
        if (ticketCount <= 0) {
            return 0.0;
        }

        double tax = getTax() * getBasePrice();
        double taxedPrice = tax + getBasePrice();
        double totalPrice = ticketCount * (taxedPrice * (1 - MEMBER_DISCOUNT));
        return totalPrice;
    }
}
