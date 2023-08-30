
//1)write a program to find maximum element in an array using recursion

public class Main {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxInRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxInRest);
    }

    public static void main(String[] args) {
        int[] array = { 5, 9, 2, 6, 3, 8, 7 };
        int max = findMax(array, 0);
        System.out.println("Maximum element in the array is: " + max);
    }
}

