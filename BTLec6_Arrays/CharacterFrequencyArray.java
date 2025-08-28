
package BTLec6_Arrays;

import java.util.Scanner;

public class CharacterFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[26];
        for (char c : s.toCharArray()){
            if (c >= 'a' && c <= 'z')
                a[c - 'a']++;
        }
        for (int i = 0;i < 26;i++){
            if (a[i] != 0){
                System.out.println((char)(i+'a')+" "+a[i]);
                a[i] = 0;
            }
        }
    }
}
