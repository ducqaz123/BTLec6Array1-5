
package BTLec6_Arrays;

import java.util.Scanner;

public class SwapOfArray {
    public static void Swap(int a[],int index1, int index2){
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
        for (int x : a){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("index1: ");
        int index1 = sc.nextInt();
        System.out.print("index2: ");
        int index2 = sc.nextInt();
        System.out.print("Arrays after swap: ");
        Swap(a,index1,index2);
    }
}
