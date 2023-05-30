class Solution {
    public String solution(String code) {
		String answer = "";
		int mode = 0;
		String[] codes = code.split(""); //String code -> String[] codes

		for(int i=0;i<codes.length;i++){
			switch(mode) {
			case 0:
				if(!codes[i].equals("1") && i%2 == 0) {
					answer = answer + codes[i];
				}else if(!codes[i].equals("1") && 1%2 != 0) {
					continue;
				}else {
					mode = 1;
				}
				break;
			case 1:
				if(!codes[i].equals("1") && i%2 != 0) {
					answer = answer + codes[i];
				}else if(!codes[i].equals("1") && i%2 == 0) {
					continue;
				}else {
					mode = 0;
				}
				break;
			}
		}
        if(answer==""){
            return "EMPTY";
        }else{
            return answer;    
        }
	}
}