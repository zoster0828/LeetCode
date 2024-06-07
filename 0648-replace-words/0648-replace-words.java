class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        String splitted[] = sentence.split("\\s+");
        boolean[] replaced = new boolean[splitted.length];
        for(String str : dictionary) {            
            for(int i = 0 ; i < splitted.length ; i++) {

                if((str.length() < splitted[i].length() || !replaced[i]) && splitted[i].startsWith(str)) {
                    splitted[i] = str;
                    replaced[i] = true;
                }
            }
        }

        return String.join(" ", splitted);
    }
}