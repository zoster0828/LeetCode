class Solution {
    public String largestGoodInteger(String num) {
        String result = "";
        int con = 0;
        char pre = 'A';
        for(char c : num.toCharArray()) {
            if(pre == c) {
                con++;
            } else {
                pre = c;
                con = 1;
            }
            
            if(con == 3) {
                StringBuilder builder = new StringBuilder();
                builder.append(pre);builder.append(pre);builder.append(pre);
                if(result == "") {
                    result = builder.toString();
                }else{                
                    int cand = Integer.parseInt(builder.toString());
                    if(cand > Integer.parseInt(result)) {
                        result = builder.toString();
                    }
                    pre = 'A';
                    con = 0;
                }
            }
        }
        
        return result;
    }
}