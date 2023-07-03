package Topic_1_Array.Easy;

import java.util.*;

public class Q14_SubArrayProductLessThanK {
    public static int countSubArrayProductLessThanK(int[] arr, int n, long k) {
        int product = 1;
        int i = 0, j = 0;
        int nSub = 0;
        while(i < n){
            product *= arr[i];
            while(j <= i && product >= k){
                product /= arr[j];
                j++;
            }
            nSub += i - j + 1;
            i++;
        }
        return nSub;
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
        System.out.println("Enter the product k value : ");
        int k = input.nextInt();
        System.out.println("Number of sub arrays : " + countSubArrayProductLessThanK(arr, n, k));
    }
}
