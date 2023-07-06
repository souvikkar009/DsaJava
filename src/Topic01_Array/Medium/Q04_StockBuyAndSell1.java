package Topic01_Array.Medium;

import java.util.*;

public class Q04_StockBuyAndSell1 {
    public static int maxProfit1(int[] arr){
        int n = arr.length;
        int maxP = 0;
        int buy = arr[0];
        int sell;
        for (int i = 1; i < n; i++){
            sell = arr[i];
            if(sell >= buy){
                maxP = Math.max(maxP, sell - buy);
            }else {
                buy = sell;
            }
        }
        return maxP;
    }
    public static int maxProfit2(int[] arr){
        int maxProfit = 0;
        int minPrice = arr[0];
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int money = arr[i] - minPrice;
            maxProfit = Math.max(maxProfit, money);
            minPrice = Math.min(minPrice, arr[i]);
        }
        return maxProfit;
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
        System.out.println("Max Profit : " + maxProfit1(arr));
        System.out.println("Max Profit : " + maxProfit2(arr));
    }
}
