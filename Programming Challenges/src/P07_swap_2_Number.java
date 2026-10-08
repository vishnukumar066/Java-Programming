import java.util.Scanner;

public class P07_swap_2_Number {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Swapping Station.");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping Done...");
        System.out.println("Now, Value of A: " + a);
        System.out.println("Now, Value of B: " + b);
        input.close();
    }
}
