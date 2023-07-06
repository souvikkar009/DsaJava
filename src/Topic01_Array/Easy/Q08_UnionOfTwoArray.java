package Topic_1_Array.Easy;

import java.util.*;

public class Q08_UnionOfTwoArray {
    public static ArrayList<Integer> union1(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int n1 = arr1.length, n2 = arr2.length;
        for (int i = 0; i < n1; i++){
            map1.put(arr1[i], i);
        }
        for (int i = 0; i < n2; i++){
            map1.put(arr2[i], i);
        }
        return new ArrayList<>(map1.keySet());
    }
    public static ArrayList<Integer> union2(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int n1 = arr1.length, n2 = arr2.length;
        for (int x1 : arr1){
            set.add(x1);
        }
        for (int x2 : arr2){
            set.add(x2);
        }
        return new ArrayList<>(set);
    }
    public static ArrayList<Integer> union3(int[] arr1, int[] arr2){
        ArrayList<Integer> res = new ArrayList<>();
        int n1 = arr1.length, n2 = arr2.length;
        int i = 0, j= 0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(res.size() == 0 || res.get(res.size() - 1) != arr1[i]){
                    res.add(arr1[i]);
                }
                i++;
            }else {
                if(res.size() == 0 || res.get(res.size() - 1) != arr2[j]){
                    res.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < n1){
            if(res.get(res.size() - 1) != arr1[i]){
                res.add(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if(res.get(res.size() - 1) != arr2[j]){
                res.add(arr2[j]);
            }
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array 1 : ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Fill the elements in array 1 :");
        for (int i = 0; i < n1; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the size of array 2 : ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Fill the elements in array 2 :");
        for (int i = 0; i < n2; i++){
            arr2[i] = input.nextInt();
        }
        System.out.println("Array 1 is : " + Arrays.toString(arr1));
        System.out.println("Array 2 is : " + Arrays.toString(arr2));
        System.out.println("Union of array 1 & 2 : " + union3(arr1, arr2));
    }
}
