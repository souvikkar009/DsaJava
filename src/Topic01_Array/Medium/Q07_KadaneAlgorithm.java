package Topic01_Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q07_KadaneAlgorithm {
    public static ArrayList<Integer> subArrayOfMaxSum(int[] arr){
        ArrayList<Integer> subArray = new ArrayList<>();
        int n = arr.length;
        int j = 0;
        int subArrayStart = -1;
        int subArrayEnd = -1;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if(sum == 0) j = i;
            sum += arr[i];
            if (sum >= maxSum){
                maxSum = sum;
                subArrayStart = j;
                subArrayEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        if(subArrayStart == subArrayEnd){
            subArray.add(arr[subArrayEnd]);
        }else {
            while (subArrayStart <= subArrayEnd){
                subArray.add(arr[subArrayStart]);
                subArrayStart++;
            }
        }
        return subArray;
    }
    public static int maxSumSubArray(int[] arr){
        int n = arr.length;
        int maxSum = arr[0];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if(sum < 0) sum = 0;
        }
        return maxSum;
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
        System.out.println(subArrayOfMaxSum(arr));
    }
}
