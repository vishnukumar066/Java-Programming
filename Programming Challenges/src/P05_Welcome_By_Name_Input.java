import java.util.Scanner;

public class P05_Welcome_By_Name_Input {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to my home.");

        System.out.print(name + ", Also tell me your age: ");
        int age = input.nextInt();
        System.out.println(name + ", your age is " + age);
    }
}
