import java.util.Scanner;

public class Fibocancci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate Fibocancci Series");
        int n = sc.nextInt();

        int a= 0, b=1;
        System.out.println("Fibocancci series up to"+ n + "numbers");
        for(int i= 0; i <n ; i++)
        {
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
