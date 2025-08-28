
package BTLec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        while(true){
            int x = sc.nextInt();
            if (x == -1){
                break;
            } else {
            arr.add(x);
            sum += x;
            }
        }
        System.out.print("Numbers entered: ");
        for (int i = 0;i < arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.print(", the sum is: "+ sum);
    }
}
