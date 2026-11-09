class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1 ; i< 1501 ; i++) {
            if(n % i == 0 && i <= n/i ){
                if( i == n/i) answer += i;
                else answer += + i + n/i;
                
            }
        }
        return answer;
    }
}