package Topic_1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_SecondLargestElementInArray {
    public static int secondLargestEle1(int[] arr){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int flag = 0;
        int n = temp.length;
        for (int i = 0; i < n - 1; i++){
            if (temp[i] != temp[i + 1]) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) return Integer.MIN_VALUE;
        else return temp[n - 2];
    }
    public static int secondLargestEle2(int[] arr){
        int largestEle = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] > largestEle) largestEle = arr[i];
        }
        int secondLargestEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if(arr[i] > secondLargestEle && arr[i] != largestEle){
                secondLargestEle = arr[i];
            }
        }
        return secondLargestEle;
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
        System.out.println("Second Largest Element is : " + secondLargestEle1(arr));
        System.out.println("Second Largest Element is : " + secondLargestEle2(arr));
    }
}
