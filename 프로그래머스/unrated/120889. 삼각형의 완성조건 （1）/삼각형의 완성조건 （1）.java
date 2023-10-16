class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i=0; i<sides.length; i++) {
            for(int j=(i+1)%3; j<sides.length; j++) {
                int tmp = 0;
                if (sides[i] < sides[j]) {
                    tmp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = tmp;
                }
            }
        }
        for (int i=0; i<sides.length; i++) { //오름차순 정렬 테스트
            System.out.print(sides[i] + " ");
        }
        
        if (sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else {
            answer = 2;    
        }        
        return answer;
    }
}