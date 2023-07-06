package Topic01_Array.Easy;

import java.util.*;

public class Q13_LongestSubArrayOfSumKPosNeg {
    public static int longestSub(int[] arr, int k){
        int n = arr.length;
        int maxSubArray = 0;
        int idxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            idxSum += arr[i];
            if(idxSum == k){
                maxSubArray = Math.max(maxSubArray, i + 1);
            }
            int restSum = idxSum - k;
            if(map.containsKey(restSum)){
                maxSubArray = Math.max(maxSubArray, i - map.get(restSum));
            }
            if (!map.containsKey(idxSum)){
                map.put(idxSum, i);
            }
        }
        return maxSubArray;
    }
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Fill the elements in array :");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.println("Enter the sum value K : ");
        int k = input.nextInt();
        System.out.println("SubArray size is : " + longestSub(arr, k));
    }
}
