import java.util.*; 

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer =new int[id_list.length];
        
        // 1) 중복 신고 제거
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < report.length; i++) {
            set.add(report[i]);
        }
        
        // 2) 신고당한 횟수 세기
        HashMap<String, Integer> report_num = new HashMap<>();
        
        for(String r : set) {
            String[] parts = r.split(" ");
            report_num.put(parts[1], report_num.getOrDefault(parts[1], 0) + 1);
        }
        
        // 3) 신고자의 인덱스 저장 (이름 -> answer 위치)
        HashMap<String, Integer> index = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            index.put(id_list[i], i);
        }
        
        // 4) 대상이 k번 이상 신고당했으면 신고자에게 메일 +1
        for(String r : set) {
            String[] parts = r.split(" ");
            if(report_num.get(parts[1]) >= k) {
                answer[index.get(parts[0])]++;
            }
        }
        
        return answer;
    }
}