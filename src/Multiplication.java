import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for a multiplication");
        int mul = input.nextInt();

        for (int i=0; i<=10; i++){
            int result = mul*i;
            System.out.println(mul + "x"+ i+ "="+ result);
        }
    }
}
