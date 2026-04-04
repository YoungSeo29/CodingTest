class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    void dfs(int[] numbers, int target, int index, int sum) {
        // 끝까지 도달했을 때
        if(index == numbers.length) {
            if(sum == target) answer++;
            return;
        }
        
        // 더하거나 빼거나
        dfs(numbers, target, index+1, sum + numbers[index]);
        dfs(numbers, target, index+1, sum - numbers[index]);
    }
}