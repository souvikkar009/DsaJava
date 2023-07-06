package Topic01_Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q11_NumberAppearsOne {
    public static int numberOne1(int[] arr){
        int num = Integer.MIN_VALUE;
        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (k == i) {
                    count++;
                }
            }
            if (count == 1) {
                num = k;
                break;
            }
        }
        return num;
    }
    public static int numberOne2(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int num = Integer.MIN_VALUE;
        for (int x : arr){
            if (!map.containsKey(x)){
                map.put(x, 1);
            }else {
                map.put(x, 2);
            }
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()){
            if (it.getValue() == 1) {
                num = it.getKey();
                break;
            }
        }
        return num;
    }
    public static int numberOne3(int[] arr){
        int xor = 0;
        for (int x : arr){
            xor = xor ^ x;
        }
        return xor;
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
        System.out.println("Number that appear only one time : " + numberOne3(arr));
    }
}
