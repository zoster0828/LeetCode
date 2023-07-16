class Solution {
    public String strWithout3a3b(int a, int b) {
        String result = "";
        String before = "";
        int continuity = 0;
        while(a != b) {
            if(a > b) {
                if(before == "a"){
                    if(continuity != 2) {                    
                        result += "a";
                        a--;
                        continuity++;
                    } else {
                        result += "b";
                        b--;
                        continuity = 0;
                        before = "b";
                    }
                } else {
                    result += "a";
                    before = "a";
                    a--;
                    continuity++;
                }
            } else {
                if(before == "b"){
                    if(continuity != 2) {                    
                        result += "b";
                        b--;
                        continuity++;
                    } else {
                        result += "a";
                        a--;
                        continuity = 0;
                        before = "a";
                    }
                } else {
                    result += "b";
                    before = "b";
                    b--;
                    continuity++;
                }
            }
        }
        
        if(a==b) {
            result += one(a, before);
        }
        
        return result;
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