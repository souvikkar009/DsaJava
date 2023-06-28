package Topic_1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_IsArraySorted {
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        int flag = 1;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]) {
                flag = 0;
                break;
            }
        }
        return (flag == 1);
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
        System.out.println("Array is sorted : " + isSorted(arr));
    }
}
