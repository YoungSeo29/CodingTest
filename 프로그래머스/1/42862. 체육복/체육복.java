class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = 0;
        int[] cnt = new int [n+2];
        for(int i=1 ; i <= n ; i++) cnt[i] = 1;  // 모두 1벌씩 있다고 가정
        // 도난당한 애들 빼기
        for(int x : lost) cnt[x]--;
        
        // 여분 있는 애들 원상복구
        for(int x: reserve) cnt[x]++;
        
        for(int i=1 ; i<= n ; i++){
            
            if(cnt[i] ==0) {
                if(cnt[i-1]==2) {
                    cnt[i-1]--;
                    cnt[i]++;
                } else if(cnt[i+1]==2){
                    cnt[i+1]--;
                    cnt[i]++;
                }
            }
        }
        
        for(int i=1 ; i <=n ; i++) {
            if(cnt[i] >= 1) answer++;
        }
        return answer;
    }
}