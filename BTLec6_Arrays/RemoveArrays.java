
package BTLec6_Arrays;

import java.util.Scanner;

public class RemoveArrays {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0;i < n;i++){
            if (a[i] < 50){
                System.out.print(a[i]+" ");
            }
        }
    }
}
