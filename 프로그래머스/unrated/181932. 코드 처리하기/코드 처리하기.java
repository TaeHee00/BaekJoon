class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            
            if (code.charAt(i) == '1') {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
                continue;
            }
            
            if (mode == 0 && (i % 2 == 0 || i == 0)) {
                answer = answer.concat(String.valueOf(code.charAt(i)));
            } else if (mode == 1 && i % 2 == 1) {
                answer = answer.concat(String.valueOf(code.charAt(i)));
            }
        }
        
        if (answer.isEmpty()){
            return "EMPTY";
        } else {
            return answer;
        }
    }
}