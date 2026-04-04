import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int count = 0;
        
        ArrayList<Integer> stack = new ArrayList<>();
        
        // 8번 반복
        for(int i = 0 ; i< moves.length ; i++) {
            int line = 0;
            line = moves[i]-1;
            
            for(int j = 0 ; j < board.length ; j++) {
                
                // 인형이 있으면
                if(board[j][line] > 0 ) {
                    
                    int doll = board[j][line]; 
                    board[j][line] = 0;  // 꺼냇으니 0으로
                    
                    if(stack.size() > 0 && stack.get(stack.size()-1) == doll) { 
                        stack.remove(stack.size()-1);
                        count += 2;
                    } else {
                        stack.add(doll);
                    }
                        
                    break;
                }
                
            }
        }
        
        
        return count;
    }
}