package Topic_1_Array.Medium;

import java.util.*;

public class Q03_MaxIndex {
     static int maxIndexDiff(int[] arr, int n) {
        // code here
        int[] LMin = new int[n];
        int[] RMax = new int[n];
        LMin[0] = arr[0];
        RMax[n - 1] = arr[n - 1];
        int maxD = 0;
        for(int i = 1; i < n; i++){
            LMin[i] = Math.min(LMin[i - 1], arr[i]);
        }
        for(int j = n - 2; j >= 0; j--){
            RMax[j] = Math.max(RMax[j + 1], arr[j]);
        }
        int i = 0, j = 0;
        while(i < n && j < n){
            if(LMin[i] <= RMax[j]){
                maxD = Math.max(maxD, j - i);
                j++;
            }else{
                i++;
            }
        }
        return maxD;

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
        System.out.println(maxIndexDiff(arr, n));
    }
}
