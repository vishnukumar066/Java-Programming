import java.util.Scanner;

class P44_DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = inputArray(input);
        System.out.print("Now, enter then number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        displayArray(newArr);
    }

    private static int[] inputArray(Scanner input) {
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return array;
    }

    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = 0;
        for (int number : numArr) {
            if (number == numToDelete) {
                occ++;
            }
        }
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}