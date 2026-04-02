class Solution {
    public int solution(String my_string, String target) {
        boolean ans;
        ans = my_string.contains(target);
        
        return ans ? 1:0;
    }
}