import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double priceWithoutTax,priceWithTax,priceTax;

        System.out.print("Your amount: ");
        priceWithoutTax = input.nextDouble();

        priceWithTax = priceWithoutTax + ((priceWithoutTax * 18) /100) ;
        System.out.println("Amount with Tax: " + priceWithTax);

        priceTax = (priceWithoutTax * 18) / 100;
        System.out.print("Tax Amount: " + priceTax);
    }
}