class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] controls = control.split("");
        for(int i = 0; i< controls.length; i++){
            switch(controls[i]){
                case "w":
                    n += 1;
                    break;
                case "s":
                    n -= 1;
                    break;
                case "d":
                    n += 10;
                    break;
                case "a":
                    n -= 10;
                    break;
            }            
        }
        answer = n;

        
        return answer;
    }
}