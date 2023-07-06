package Topic01_Array.Medium;

import java.util.*;

public class Q02_SortArrayOf0s1s2s {
    public static void sortArray(int[] arr){
        int n = arr.length;
        int i = 0, j = n - 1;
        int k = 0;
        while(k <= j){
            if(arr[k] == 2){
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j--] = temp;
                // k++; no k++ bcz arr[k] can be 0/1
            } else if (arr[k] == 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i++] = temp;
                k++;
            }else {
                k++;
            }
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
        sortArray(arr);
        System.out.println("Sorted Array is : " + Arrays.toString(arr));
    }
}
