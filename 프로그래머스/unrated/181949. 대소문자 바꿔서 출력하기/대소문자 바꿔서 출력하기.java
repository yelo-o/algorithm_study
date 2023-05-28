import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split(""); // 문자열을 한 글자씩 쪼개서 배열에 넣기
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals(arr[i].toUpperCase())) {
                arr[i] = arr[i].toLowerCase();
            }else{
                arr[i] = arr[i].toUpperCase();
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
            
    }
}