import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] room = new int[1450];  // 하루 23시 59분 + 청소시간 10분
        
        
        for(int i=0 ; i<book_time.length ; i++) {
            String in = book_time[i][0];
            String out = book_time[i][1];
            
            room[ToMinute(in)] += 1;
            room[ToMinute(out)+10] += -1;  // 청소기간 10분
        }
        
        for(int i=1 ; i<room.length ; i++) {
            room[i] += room[i-1]; // 누적합
            answer = Math.max(answer, room[i]);
        }
        
        return answer;
    }
    
    public static int ToMinute(String time) {
        String[] tmp = time.split(":");
        int hour = Integer.parseInt(tmp[0]);
        int minute = Integer.parseInt(tmp[1]);
        
        return hour*60 + minute;
    }
}