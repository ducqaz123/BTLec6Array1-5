
package BTLec6_Arrays;

import java.util.Scanner;

public class FindSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int maximum = 0;
        int secondMax = 0;
        for (int i = 0;i < n;i++){
            if (a[i] > maximum){
                secondMax = maximum;
                maximum = a[i];
            } else if (a[i] < maximum && secondMax < a[i]){
                secondMax = a[i];
            }
        }
        System.out.println("The second-largest element is: "+secondMax);
    }
}
