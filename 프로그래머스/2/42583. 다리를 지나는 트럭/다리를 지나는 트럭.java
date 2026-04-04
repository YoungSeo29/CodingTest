import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int current_weight = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i=0 ; i<bridge_length ; i++) {
            bridge.add(0);
        }
        
        for(int i=0 ; i<truck_weights.length ; i++) {
            
            // 맨 앞 트럭 빠져나감
            current_weight -= bridge.poll();
            
            // 다음 트럭 올라갈 수 있으면
            if(current_weight + truck_weights[i] <= weight) {
                bridge.add(truck_weights[i]);
                current_weight += truck_weights[i];
            } else {  // 못올라감
                bridge.add(0);
                i--;
            }
            
            answer++;
        }
            answer += bridge_length;
            return answer;
        
    }
}