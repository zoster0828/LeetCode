class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        
        String splitted[] = sentence.split("\\s+");
        boolean[] replaced = new boolean[splitted.length];
        for(String str : dictionary) {            
            for(int i = 0 ; i < splitted.length ; i++) {
                if(!replaced[i] && splitted[i].startsWith(str)) {
                    splitted[i] = str;
                    replaced[i] = true;
                }
            }
        }

        return String.join(" ", splitted);
    }
}