package Topic01_Array.Medium;

import java.util.*;

public class Q06_MajorityElementInArray {
    public static int majorityEle1(int[] arr){
        int n = arr.length;
        int element = -1;
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > n / 2){
                element = arr[i];
                break;
            }
        }
        return element;
    }
    public static int majorityEle2(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            int occurrence = map.getOrDefault(arr[i], 0);
            map.put(arr[i], occurrence + 1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()){
            if (it.getValue() > (n / 2)){
                return it.getKey();
            }
        }
        return -1;
    }

    // moore's voting algorithm
    public static int majorityEle3(int[] arr){
        int n = arr.length;
        int ele = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++){
            if(count == 0){
                ele = arr[i];
                count = 1;
            }else if(ele == arr[i]){
                count++;
            }else {
                count--;
            }
        }
        count = 0;
        for (int j : arr) {
            if (j == ele) {
                count++;
            }
        }
        return (count > n / 2) ? ele : -1;
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
        System.out.println("Majority Element : " + majorityEle1(arr));
        System.out.println("Majority Element : " + majorityEle2(arr));
        System.out.println("Majority Element : " + majorityEle3(arr));
    }
}
