import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n ; i++) {
            int j = 1;
            while(j <= i+1) {
                System.out.print("*");
                j++;
            }
            if(i < n-1) {
                System.out.println();
            }
        }
        

        // System.out.println(n);
    }
}