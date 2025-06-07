class Solution {
    public String clearStars(String s) {
        Map<Character, Stack<Integer>> m = new HashMap();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '*') {
                for(char ch = 'a'; ch <= 'z'; ch++) {
                    if(m.get(ch) != null && !m.get(ch).isEmpty()){
                        m.get(ch).pop();
                        break;
                    }
                }
            } else {
                if(!m.containsKey(c))
                    m.put(c, new Stack());
                m.get(c).push(i);
            }
        }
        char[] ans = new char[s.length()];
        for(Map.Entry<Character, Stack<Integer>> e : m.entrySet()) {
            while(!e.getValue().isEmpty())
                ans[e.getValue().pop()] = e.getKey();
        }
        return new String(ans).replaceAll("\0", "");
    }
}