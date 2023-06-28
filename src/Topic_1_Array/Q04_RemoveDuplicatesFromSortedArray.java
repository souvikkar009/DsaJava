package Topic_1_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q04_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates1(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int ele : arr){
            set.add(ele);
        }
        int setSz = set.size();
        Integer[] temp = new Integer[setSz];
        temp = set.toArray(temp);
        for (int i = 0; i < setSz; i++){
            arr[i] = temp[i];
        }
        return setSz;
    }
    public static int removeDuplicates2(int[] arr){
        int j = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++){
            if(arr[i] != arr[j]){
                arr[++j] = arr[i];
            }
        }
        return j + 1;
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
        int idxTillUniqueEle = removeDuplicates2(arr);
        System.out.println("Array without duplicate element : ");
        for (int i = 0; i < idxTillUniqueEle; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
