import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
	// write your code here
            int products, i, quantity, x, z;
            Scanner input = new Scanner(System.in);
            String[] productArray = new String[4];
            productArray[0] = "shed";
            productArray[1] = "baguette";
            productArray[2] = "snail";
            productArray[3] = "tractor";

            for (i=0; i<=productArray.length - 1; i++)
            {
                System.out.println((i+1)+". "+productArray[i]);
            }

            System.out.println("What would you like to buy?");
            products = input.nextInt();
            input.nextLine();

            System.out.print("How many would you like to order?  ");

            quantity = input.nextInt();
            input.nextLine();

            String[] addressArray = new String[quantity];
                for (x=0; x<quantity; x++)
                {
                    System.out.println("Enter address for " + (x+1));
                    addressArray[x] = input.nextLine();
                }
            System.out.println("Thanks! Sending " + quantity + " " + productArray[products] + "s to the following addresses: ");
                for (z=0; z<=addressArray.length-1; z++)
                {
                System.out.println((z+1)  +". "+ addressArray[z]);
                }
    }
}
