package Topic_1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_RotateArrayByKPosition {
    public static void leftRotateByK1(int[] arr, int k){
        int n = arr.length;
        if(k > n) return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++){
            arr[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++){
            arr[n - k + i] = temp[i];
        }
    }
    public static void rightRotateByK1(int[] arr, int k){
        int n = arr.length;
        if (k > n) return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++){
            temp[i] = arr[n - k + i];
        }
        for (int i = n - 1; i >= k; i--){
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++){
            arr[i] = temp[i];
        }
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
        System.out.print("Enter the value of k : ");
        int k = input.nextInt();
        leftRotateByK1(arr, k);
        System.out.println("Array after left rotating by " + k + " position " + Arrays.toString(arr));
    }
}
