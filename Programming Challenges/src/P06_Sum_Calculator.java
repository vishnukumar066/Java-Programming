import java.util.Scanner;

public class P06_Sum_Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to My Sum Calculator");
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter second number: ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("Sum of your number is: " + sum);

    }
}
