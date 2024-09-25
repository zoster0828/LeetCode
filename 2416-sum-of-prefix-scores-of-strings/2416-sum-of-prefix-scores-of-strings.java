class Solution {
    public int[] sumPrefixScores(String[] words) {
        Map<String, Integer> map = new HashMap();
        int tot[] = new int[words.length];
        int po = 0;
        for(String str:words) {
            String[] sub = getSubStrings(str);
            int result = 0;
            for(int i = 0 ; i < sub.length ; i++) {
                if(map.containsKey(sub)) result += map.get(sub);
                else {
                    int temp = 0;
                    for(int j = 0 ; j < words.length ; j++) {
                        if(words[j].startsWith(sub[i])) temp++;                    
                    }

                    result += temp;
                    map.put(sub[i], temp);
                }
            }
            tot[po] = result;
            po++;
        }

        return tot;
    }

    public String[] getSubStrings(String str) {
        String[] strings = new String[str.length()];
        strings[0] = ""+str.charAt(0);
        for(int i = 1 ; i< strings.length ; i++) {
            strings[i] = strings[i-1] + str.charAt(i);
        }

        return strings;
    }
}