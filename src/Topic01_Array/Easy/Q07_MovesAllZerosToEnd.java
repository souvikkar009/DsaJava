package Topic_1_Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Q07_MovesAllZerosToEnd {
    public static void moveAllZeros1(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for(int x : arr){
            if(x != 0){
                temp[j] = x;
                j++;
            }
        }
        for (int i = 0; i < n; i++){
            if(i <= j){
                arr[i] = temp[i];
            }else {
                arr[i] = 0;
            }
        }
    }
    public static void moveAllZeros2(int[] arr){
        int n = arr.length;
        int i = 0, j = 0;
        while (arr[i] != 0){
            i++;
        }
        j = i;
        i++;
        while(i < n){
            if(arr[i] != 0){
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
            i++;
        }
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
        moveAllZeros2(arr);
        System.out.println("Array with zeros at end : " + Arrays.toString(arr));
    }
}
