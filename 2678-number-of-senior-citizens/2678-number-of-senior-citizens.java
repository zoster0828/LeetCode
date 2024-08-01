class Solution {
    public int countSeniors(String[] details) {
        int result = 0;
        for(int i = 0 ; i < details.length ; i++) {
            if(details[i].charAt(11) >'6') {
                result++;
            }

            if(details[i].charAt(11) =='6' && details[i].charAt(12) >= '1') {
                result++;
            }
        }

        return result;
    }
}