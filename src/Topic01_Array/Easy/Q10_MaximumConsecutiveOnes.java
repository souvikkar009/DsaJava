package Topic_1_Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_MaximumConsecutiveOnes {
    public static int maxOnes(int[] arr){
        int n = arr.length;
        int sum = 0, maxSum = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] == 1){
                sum++;
            }else {
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }
        }
        return Math.max(maxSum, sum);
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
        System.out.println("Maximum consecutive ones in the array : " + maxOnes(arr));
    }
}
