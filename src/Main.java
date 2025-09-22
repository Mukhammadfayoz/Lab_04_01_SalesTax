public class Main {
    public static void main(String[] args) {
        double price = 79.99;    // change if desired
        double taxRate = 0.05;   // 5%
        double tax = price * taxRate;
        double total = price + tax;

        System.out.println("Price: $" + price);
        System.out.println("Sales tax (5%): $" + tax);
        System.out.println("Total: $" + total);
    }
}
