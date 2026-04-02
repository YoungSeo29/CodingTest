import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0 ; i<commands.length ; i++) {
            // 새 배열 할당
            int[] arr = new int[commands[i][1] - commands[i][0]+1];
            
            for(int j=0 ; j<commands[i][1] - commands[i][0]+1 ; j++) {
                arr[j] = array[j+commands[i][0]-1];
                System.out.print(arr[j]);
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        
        
        return answer;
    }
}