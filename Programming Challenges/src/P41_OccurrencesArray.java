import java.util.Scanner;

class P41_OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numArr = new int[size];
        for (int i = 0; i < numArr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numArr[i] = input.nextInt();
        }
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr, num);
        System.out.println("Your element was found " + occurrences + " times in the array");
        input.close();

    }

    public static int noOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}