package Topic_1_Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_RotateArrayByOnePosition {
    public static void leftRotateByOne(int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++){
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
    public static void rightRotateByOne(int[] arr){
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Fill the elements in array :");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));
        leftRotateByOne(arr);
        System.out.println("After left rotation by one position, the array is : " + Arrays.toString(arr));
        rightRotateByOne(arr);
        System.out.println("After right rotation by one position, the array is : " + Arrays.toString(arr));
    }
}
