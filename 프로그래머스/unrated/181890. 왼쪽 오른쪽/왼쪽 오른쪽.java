import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        // String[] answer = {};
        List<String> tmp = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for (String s : str_list) {
            tmp.add(s);
        }
        int r = tmp.indexOf("r");
        int l = tmp.indexOf("l");
        if (l!=-1 && r!=-1) { 
            if (l < r) {
                for (int i=0; i<l; i++) {
                    list.add(str_list[i]);
                }
            } else if (r < l) {
                for (int i=r+1; i< str_list.length; i++) {
                    list.add(str_list[i]);
                }
            }
        } else if (l == -1 && r != -1) {
            for (int i=r+1; i< str_list.length; i++) {
                list.add(str_list[i]);
            }
        } else if (r == -1 && l != -1) {
            for (int i=0; i<l; i++) {
                list.add(str_list[i]);
            }
        } else {
            list.clear();
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}