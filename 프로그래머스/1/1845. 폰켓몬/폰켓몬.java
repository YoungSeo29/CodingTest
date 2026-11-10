import java.util.*;

class Solution {
    public int solution(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0 ; i< nums.length ; i++) {
            map.put(nums[i], 1);
        }
        
        int types = map.size();  // 종류 수
        int pick = nums.length/2; // 가져갈 수 있는 마리 수
        
        return Math.min(types, pick);
    }
}