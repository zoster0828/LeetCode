class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        List<String> sortedDict = dictionary.stream()
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());
        String splitted[] = sentence.split("\\s+");
        for(String str : sortedDict) {            
            for(int i = 0 ; i < splitted.length ; i++) {

                if(splitted[i].startsWith(str)) {
                    splitted[i] = str;
                }
            }
        }

        return String.join(" ", splitted);
    }
}