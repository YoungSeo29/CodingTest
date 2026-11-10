import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int min_cor = 0;  // 제일 적게 맞춘 문제 수
        int max_cor = 0;  // 제일 많이 맞춘 문제 수
        int zero = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0 ; i<lottos.length ; i++) {
            for(int j=0 ; j<win_nums.length ; j++){
                if(lottos[i] == win_nums[j]){
                    map.put(win_nums[j], map.getOrDefault(win_nums[j],0) + 1);
                }
                
            }
            if(lottos[i] == 0) zero++;
        }
        
        System.out.println("zero : " + zero);
        System.out.println("min_cor : " + min_cor);
        min_cor = map.size();
        max_cor = map.size() + zero;
        
        answer[0] = 7-max_cor;
        answer[1] = 7-min_cor;
        if(answer[1] > 6) answer[1] = 6;
        if(answer[0] > 6) answer[0] = 6;
        
        
        System.out.println(map);
        
        
        return answer;
    }
}