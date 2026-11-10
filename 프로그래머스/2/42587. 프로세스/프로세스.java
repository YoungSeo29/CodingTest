import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            q.add(i);
        }

        int order = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            boolean hasBigger = false;
            for (int idx : q) {  // 큐 안에 더 급한 게 있나 확인만
                if (priorities[idx] > priorities[cur]) {
                    hasBigger = true;
                    break;
                }
            }

            if (hasBigger) {
                q.add(cur);
            } else {
                order++;
                if (cur == location) return order;
            }
        }
        return order;
    }
}