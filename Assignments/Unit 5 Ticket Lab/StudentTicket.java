import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StudentTicket extends StandardTicket {
    // instance variables
    private static final double STUDENT_DISCOUNT = 0.50;

    // constructors
    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    // inherited methods
    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }

    // methods
    protected double generateTotalPrice() {
        if (ticketCount <= 0) {
            return 0.0;
        }

        double tax = getTax() * getBasePrice();
        double taxedPrice = tax + getBasePrice();
        double totalPrice = ticketCount * (taxedPrice * (1 - STUDENT_DISCOUNT));
        return totalPrice;
    }
}
