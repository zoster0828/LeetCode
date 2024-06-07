class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        List<String> newDict = mergeDictionary(dictionary);

        String splitted[] = sentence.split("\\s+");
        for(String str : newDict) {            
            for(int i = 0 ; i < splitted.length ; i++) {

                if(splitted[i].startsWith(str)) {
                    splitted[i] = str;
                }
            }
        }

        return String.join(" ", splitted);
    }

    public List<String> mergeDictionary(List<String> words) {
        List<String> sortedWords = words.stream()
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        for (int i = 0; i < sortedWords.size(); i++) {
            String currentWord = sortedWords.get(i);
            boolean isPrefix = false;

            for (int j = 0; j < sortedWords.size(); j++) {
                if (i != j && sortedWords.get(j).startsWith(currentWord)) {
                    isPrefix = true;
                    break;
                }
            }

            if (!isPrefix) {
                result.add(currentWord);
            }
        }

        return result;
    }
}