
package BTLec6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of arrays 1: ");
        int n = sc.nextInt();
        System.out.print("Enter arrays 1: ");
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number of arrays 2: ");
        int m = sc.nextInt();
        System.out.print("Enter arrays 2: ");
        int[] b = new int[m];
        for (int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }
        int length = n + m;
        int[] newArrays = new int[length];
        int pos = 0;
        for (int x : a){
            newArrays[pos] = x;
            pos++;
        }
        for (int y : b){
            newArrays[pos] = y;
            pos++;
        }
        Arrays.sort(newArrays);
        System.out.print("New Arrays: ");
        for (int x : newArrays){
            System.out.print(x+" ");
        }
    }
}
