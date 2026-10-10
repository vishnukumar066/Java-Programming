public class P43_IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Check post\n");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int[] numArr = new int[scanner.nextInt()];
        System.out.println("Enter the elements:");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = scanner.nextInt();
        }
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if (isInc || isDec) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
        scanner.close();
    }

    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] < numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
