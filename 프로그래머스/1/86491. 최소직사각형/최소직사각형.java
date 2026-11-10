class Solution {
    public int solution(int[][] sizes) {
        int maxBig = 0;     // 큰 변들 중 최대
        int maxSmall = 0;   // 작은 변들 중 최대

        for(int i = 0; i < sizes.length; i++) {
            int big = Math.max(sizes[i][0], sizes[i][1]);
            int small = Math.min(sizes[i][0], sizes[i][1]);

            maxBig = Math.max(maxBig, big);
            maxSmall = Math.max(maxSmall, small);
        }
        return maxBig * maxSmall;
    }
}