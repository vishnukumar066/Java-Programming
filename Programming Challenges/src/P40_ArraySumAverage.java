import java.util.Scanner;

public class P40_ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");
        int[] numArray = inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + avg);
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;

    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        if (numArray.length == 0) {
            return 0.0;
        }
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
