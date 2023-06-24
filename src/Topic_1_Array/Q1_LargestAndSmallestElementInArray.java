package Topic_1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_LargestAndSmallestElementInArray {
    public static int maxEle1(int[] arr){
        int maxEle = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
    public static int maxEle2(int[] arr){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        return temp[temp.length - 1];
    }
    public static int minEle1(int[] arr){
        int minEle = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++){
            if(arr[i] < minEle){
                minEle = arr[i];
            }
        }
        return minEle;
    }
    public static int minEle2(int[] arr){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        return temp[0];
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
        System.out.println("Max Element : " + maxEle1(arr));
        System.out.println("Max Element : " + maxEle2(arr));
        System.out.println("Min Element : " + minEle1(arr));
        System.out.println("Min Element : " + minEle2(arr));
        System.out.println("Array is : " + Arrays.toString(arr));
    }
}
