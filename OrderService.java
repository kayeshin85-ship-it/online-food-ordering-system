public class OrderService {

    public static void main(String[] args) {
        String customerName = "Ali";
        String restaurantName = "Kuala Penyu Chicken Rice";
        String menuItem = "Chicken Rice";
        int quantity = 2;
        double price = 8.50;
        double totalAmount = quantity * price;

        System.out.println("Online Food Ordering System");
        System.out.println("Customer: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Menu Item: " + menuItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: RM" + totalAmount);
        System.out.println("Order Status: Confirmed");
    }
}
