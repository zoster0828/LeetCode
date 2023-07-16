class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder result = new StringBuilder();
        String before = "";
        int continuity = 0;
        while(a != b) {
            if(a > b) {
                if(before == "a"){
                    if(continuity != 2) {                    
                        result.append("a");
                        a--;
                        continuity++;
                    } else {
                        result.append("b");
                        b--;
                        continuity = 0;
                        before = "b";
                    }
                } else {
                    result.append("a");
                    before = "a";
                    a--;
                    continuity++;
                }
            } else {
                if(before == "b"){
                    if(continuity != 2) {                    
                        result.append("b");
                        b--;
                        continuity++;
                    } else {
                        result.append("a");
                        a--;
                        continuity = 0;
                        before = "a";
                    }
                } else {
                    result.append("b");
                    before = "b";
                    b--;
                    continuity++;
                }
            }
        }
        
        if(a==b) {
            result.append(one(a, before));
        }
        
        return result.toString();
    }
    
    String one(int count, String start) {
        String result = "";
        String add = "";
        if(start == "a") {
            add = "ba";
        } else {
            add = "ab";
        }
        for(int i = 0 ; i < count ; i++) {
            result += add;
        }
        
        return result;
    }
}