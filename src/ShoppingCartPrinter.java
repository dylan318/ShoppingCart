import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Item 1");
        ShoppingCart item1 = new ShoppingCart();
        System.out.print("Enter the item name: ");
        item1.setName(scanner.nextLine());
        System.out.print("Enter the item price: ");
        item1.setPrice(scanner.nextInt());
        System.out.print("Enter the item quantity: ");
        item1.setQuantity(scanner.nextInt());

        
        scanner.nextLine();

        
        System.out.println("\nItem 2");
        ShoppingCart item2 = new ShoppingCart();
        System.out.print("Enter the item name: ");
        item2.setName(scanner.nextLine());
        System.out.print("Enter the item price: ");
        item2.setPrice(scanner.nextInt());
        System.out.print("Enter the item quantity: ");
        item2.setQuantity(scanner.nextInt());

        
        int totalCost1 = item1.getPrice() * item1.getQuantity();
        int totalCost2 = item2.getPrice() * item2.getQuantity();
        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + totalCost1);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + totalCost2);

        
        int grandTotal = totalCost1 + totalCost2;
        System.out.println("\nGrand Total: $" + grandTotal);
    }
}
