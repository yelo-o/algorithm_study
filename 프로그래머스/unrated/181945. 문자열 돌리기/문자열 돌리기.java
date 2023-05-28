import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] a_spl;
        a_spl = a.split("");
        for(String i : a_spl){
            System.out.println(i);
        }
    }
}