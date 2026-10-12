import java.util.Scanner;

class P45_ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");
        int[] numArr = inputArray();
        reverse(numArr);
        System.out.println("Your reversed array is");
        displayArray(numArr);
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}