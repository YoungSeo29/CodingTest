import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int[] rest = new int[progresses.length];
        int count = 0;
        int standard = 0;
        
        for(int i=0 ; i<rest.length; i++) {
            rest[i] = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]) ;   
        }
        
        
        // 7 3 9
        for(int i=0 ; i<rest.length ; i++) {
            
            if(rest[i] > standard) {
                standard = rest[i];
                count++;
                answer[count-1] = 1;
            } else {
                answer[count-1]++;
            }
            
        }
        
        
        return Arrays.copyOf(answer, count);
    }
}