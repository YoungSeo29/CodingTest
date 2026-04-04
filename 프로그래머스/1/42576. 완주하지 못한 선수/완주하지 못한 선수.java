import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참여자 map에 넣기
        for(String p : participant) {
            map.put(p, map.getOrDefault(p,0) + 1);
        }
        
        // 완주자 map에서 빼기
        for(String c : completion) {
            map.put(c, map.get(c) -1);
        }
        
        for(String key : map.keySet()) {
            if(map.get(key) > 0) return key;
        }
        
        return "";
    }
}