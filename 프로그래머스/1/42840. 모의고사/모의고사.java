import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        int p1_cnt = 0;
        int p2_cnt = 0;
        int p3_cnt = 0;
        
        for(int i=0 ; i<answers.length ; i++) {
            if(p1[i % p1.length] == answers[i]) p1_cnt++;
            if(p2[i % p2.length] == answers[i]) p2_cnt++;
            if(p3[i % p3.length] == answers[i]) p3_cnt++;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(p1_cnt, Math.max(p2_cnt, p3_cnt));
        System.out.println(max);
        if(p1_cnt == max) list.add(1);
        if(p2_cnt == max) list.add(2);
        if(p3_cnt == max) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}