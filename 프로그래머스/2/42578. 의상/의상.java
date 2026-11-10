import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0 ; i<clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) +1);
        }
        
        for(int i=0 ; i<map.size() ; i++){
            
        }
        for(String key : map.keySet()) {
            System.out.println(map.get(key)+1);
            answer = (map.get(key)+1) * answer;
        }
        
        System.out.println(map);
        
        return answer-1;
    }
}