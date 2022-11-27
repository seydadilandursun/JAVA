/*VAT Amount Calculator Program
Write a program in Java that calculates the VAT price and VAT amount of the money value received from the user and prints it on the screen.
(Note : Take the VAT amount as 18%)
Price without VAT = 10;
Price with VAT = 11.8;
VAT amount = 1.8;
Project:
If the amount entered is between 0 and 1000 TL, the VAT rate is 18%, if the amount is greater than 1000 TL, write the program that calculates the VAT amount as 8
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        double vat_rate;
        double vat;
        double total_price_with_vat;
        System.out.println("Please, write price amount:");
        price = input.nextDouble();
        vat_rate = price > 1000 ? 0.08 : 0.18;
        vat= price*vat_rate;
        total_price_with_vat=vat+price;
        System.out.println("VAT:" + vat);
        System.out.println("Total Price with VAT rate:" + total_price_with_vat);
    }
}
