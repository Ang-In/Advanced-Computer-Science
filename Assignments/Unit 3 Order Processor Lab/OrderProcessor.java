public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();

            // Calculate item total
            double itemTotal = price * quantity;
            subtotal += itemTotal;


        }

        // Trim premium items to exact size
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }

        // Calculate tax and total
        double tax;
        double total;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
        } else {
            tax = 0;
            total = 0;
        }

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    public static expensiveItemsSorting(Item[] items){
        
        for(int i = 0; i < items.length; i++){
            // Check if expensive
            if (price > 50.0) {
                expensiveItemsTemp[premiumCount] = name;
                premiumCount += 1;
                System.out.println(name + " is a premium item at $" + price);
            } else {
                System.out.println(name + " is a regular item at $" + price);
            }
        }
        
    }

    public static int getPremiumCount(int premiumCount) {
        return premiumCount;
    }

}
