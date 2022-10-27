package programmingchallenge11_3;
import java.util.Scanner;

public class ProgrammingChallenge11_3 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("\nEnter item description: ");
        String desc = key.nextLine();

        System.out.println("\nEnter # of units on hand: ");
        int units = key.nextInt();

        System.out.print("\nEnter item price: " + "\n$");
        double price = key.nextDouble();

        do {
            try {
                RetailItem reTry = new RetailItem(desc, units, price);
            }
            catch (NegativeValue e) {
                System.out.println(e.getMessage());
                System.out.println("\nPlease use positive value:");
                units = key.nextInt();
            }
            catch (NegativePrice e) {
                System.out.println(e.getMessage());
                System.out.print("\nPlease use positive value:" + "\n$");
                price = key.nextDouble();
            }
        } while (units < 0 || price < 0);
        
        RetailItem cereal = new RetailItem();
        cereal.setDesc(desc);
        cereal.setUnits(units);
        cereal.setPrice(price);
        System.out.println("\nItem information");
        System.out.println("Description: " + cereal.getDesc());
        System.out.println("Units on hand: " + cereal.getUnits());
        System.out.println("Price: $" + cereal.getPrice());
    }

}
