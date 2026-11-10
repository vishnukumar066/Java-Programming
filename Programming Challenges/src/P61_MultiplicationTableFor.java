import java.util.Scanner;

class P61_MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing tables\n");
        System.out.print("Please enter the number you want to print table of: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}