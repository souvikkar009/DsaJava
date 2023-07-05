package Topic_1_Array.Medium;

import java.util.*;

public class Q05_StockBuyAndSell2 {
    public static int maxProfit(int[] arr){
        int n = arr.length;
        int maxP = 0;
        int buy = arr[0];
        int sell;
        for (int i = 1; i < n; i++){
            sell = arr[i];
            if (buy <= sell){
                maxP += sell - buy;
            }
            buy = sell;
        }
        return maxP;
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
        System.out.println("Max profit : " + maxProfit(arr));
    }
}
