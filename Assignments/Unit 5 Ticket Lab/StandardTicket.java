import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StandardTicket extends Ticket {
    // constructors
    public StandardTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    // inherited methods


    // methods
    protected double generateTotalPrice(int ticketCount){
        if(ticketCount <= 0){
            return 0.0;
        }
        
        double tax = getTax();

    }
}
