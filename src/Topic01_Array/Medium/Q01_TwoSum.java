package Topic01_Array.Medium;

import java.util.*;

public class Q01_TwoSum {
    public static int[] twoSum1(int[] arr, int k){
        int[] res = new int[2];
        for (int i : arr) {
            for (int j : arr) {
                if (i + j == k) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
    public static int[] twoSum2(int[] arr, int k){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr){
            if(map.containsKey(k - x)){
                res[0] = x;
                res[1] = k - x;
            }
            map.put(x, 1);
        }
        return res;
    }
    public static int[] twoSum3(int[] arr, int k){
        int[] res = new int[2];
        int i = 0, j = arr.length - 1;
        Arrays.sort(arr);
        while (i <= j){
            int sum = arr[i] + arr[j];
            if(sum > k) j--;
            else if (sum < k) i++;
            else {
                res[0] = arr[i];
                res[1] = arr[j];
                i++;
                j--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Fill the elements in array :");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.println("Enter the sum value : ");
        int k = input.nextInt();
        System.out.println("Two elements are : " + Arrays.toString(twoSum3(arr, k)));
    }
}
