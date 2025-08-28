
package BTLec6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0;i < a.length;i++){
            a[i] = sc.nextInt();           
        }
        Arrays.sort(a);
        System.out.print("Output after sorting:");
        for (int x : a){
            System.out.print(x+ " ");
        }
        System.out.println("");
        System.out.print("Number to find: ");
        int value = sc.nextInt();
        for (int i = 0;i < a.length;i++){
            if (a[i] == value){
                System.out.println("The number "+value+" was found at index "+i);
            } 
        }
    }
}
