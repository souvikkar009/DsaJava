package Topic_1_Array;

import java.util.*;

public class Q09_MissingNumber {
    public static int missingNum1(int[] arr){
        int n = arr.length;
        int num = 0;
        for (int i = 1; i <= n + 1; i++){
            int flag = 0;
            for (int j : arr) {
                if (i == j) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                num = i;
                break;
            }
        }
        return num;
    }
    public static int missingNum2(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr){
            map.put(x, 1);
        }
        for (int i = 1; i < n + 1; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
    public static int missingNum3(int[] arr){
        int n = arr.length;
        int m = n + 1;
        int expectedSum = (m * (m + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        return expectedSum - sum;
    }
    public static int missingNum4(int[] arr){
        int n = arr.length;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n; i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        xor2 = xor2 ^ (n + 1);
        return xor1 ^ xor2;
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
        System.out.println("Missing number in array : " + missingNum4(arr));
    }
}
