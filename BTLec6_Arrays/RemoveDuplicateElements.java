
package BTLec6_Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cnt = new int[1000001];
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
            cnt[arr[i]] = 1;
        }
       for (int i = 0;i < n;i++){
           if (cnt[arr[i]] != 0){
               System.out.print(arr[i]+" ");
               cnt[arr[i]] = 0;
           }
       }
    }
}
