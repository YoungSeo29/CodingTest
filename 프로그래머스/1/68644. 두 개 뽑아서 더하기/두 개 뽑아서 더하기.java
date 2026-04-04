import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0 ; i<numbers.length-1 ; i++) {
            
            for(int j=i+1 ; j<numbers.length ; j++) {
                
                int sum = numbers[i] + numbers[j]; 
                map.put(sum, map.getOrDefault(sum, 0) + 1) ;
                
            }
            
        }
        
        int[] answer = new int[map.size()];
        int idx = 0;
        for(int key : map.keySet()){
            answer[idx++] = key;
        }
        
        Arrays.sort(answer);
    
        return answer;
    }
}