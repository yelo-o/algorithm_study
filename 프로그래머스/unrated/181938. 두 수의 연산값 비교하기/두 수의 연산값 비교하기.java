class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a) + String.valueOf(b);
        int abInt = Integer.parseInt(ab);
        int ab2 = 2* a * b;
        if(abInt >= ab2){
            answer = abInt;
        }else{
            answer = ab2;
        }
        return answer;
    }
}