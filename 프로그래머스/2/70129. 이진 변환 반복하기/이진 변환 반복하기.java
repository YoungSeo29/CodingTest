class Solution {
    public int[] solution(String s) {
        
        int count = 0;  // 변환 횟수
        int zero = 0; // 제거된 0 갯수
        
        while(!s.equals("1")) {
            
            // 0 갯수 세기
            for(int i=0 ; i<s.length() ; i++) {
                if(s.charAt(i) == '0') zero++;
            }
            
            // 0 제거
            s = s.replace("0","");
            
            // 2진수 변환
            s = Integer.toBinaryString(s.length());
            
            // 변환 횟수 증가
            count++;
            
        }
        
        
        return new int[] {count, zero};
    }
}