package Topic_1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_LongestSubArrayOfSumK {
    // n^3 time complexity
    public static int subArraySize1(int[] arr, int k){
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int sum = 0;
                for (int l = i; l <= j; l++){
                    sum += arr[l];
                }
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    // n^2 time complexity
    public static int subArraySize2(int[] arr, int k){
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                if (sum == k) len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }
    public static int subArraySize3(int[] arr, int k){
        int n = arr.length;
        int i = 0, j = 0;
        int sum = arr[0], len = 0;
        while (i < n){
            while (j <= i && sum > k){
                sum -= arr[j];
                j++;
            }
            if(sum == k) {
                len = Math.max(len, i - j + 1);
            }
            i++;
            if(i < n){
                sum += arr[i];
            }
        }
        return len;
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
        System.out.println("Enter the k value : ");
        int k = input.nextInt();
        System.out.println("Longest SubArray with k sum length : " + subArraySize3(arr, k));
    }
}
