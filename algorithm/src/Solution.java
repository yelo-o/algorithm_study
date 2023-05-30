import java.util.Scanner;

public class Solution {
	public static boolean isStringUppercase(String str) {
		if(str.equals(str.toUpperCase())) { //대문자면 true 반환
			return true;
		}
		return false;
	}
	public static String[] changeCase(String[] s) {
		return null;
	}
	public static String[] makeArr(String str) {
		return str.split("");
	}
	public static void print(String[] arr) {
		for(String i :arr) {
        	System.out.println(i);
        }
	}
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
        String str = "aBCd";
        System.out.println(str.charAt(0));
//        System.out.println(makeArr(str));
        for(String i :makeArr(str)) {
        	System.out.println(i);
        }
//        System.out.println(isStringUppercase(str));
    }
}