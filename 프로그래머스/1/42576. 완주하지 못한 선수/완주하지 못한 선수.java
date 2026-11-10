import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> parti = new HashMap<>();
        
        // 참가했으면 +1
        for(int i=0 ; i<participant.length ; i++) {
            parti.put(participant[i], parti.getOrDefault(participant[i], 0) + 1);
        }
        
        // 완주했으면 -1
        for(int i=0 ; i<completion.length ; i++) {
            parti.put(completion[i], parti.get(completion[i]) - 1);
        }
        
        for(String key : parti.keySet()){
            if(parti.get(key)>0) {
                return key;
            }
        }
        
        return "";
    }
}