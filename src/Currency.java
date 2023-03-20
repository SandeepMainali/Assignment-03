import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Nepali Currency for Converting to USD");
        double Nep = input.nextDouble();
        double USD = Nep/135.03;
        System.out.println("The USD for your Nepali rupees is"+ USD);
    }
}
