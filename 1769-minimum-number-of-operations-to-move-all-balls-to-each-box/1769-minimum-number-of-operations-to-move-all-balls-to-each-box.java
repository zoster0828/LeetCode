class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> po = new ArrayList();
        int n = boxes.length();
        char[] chars = boxes.toCharArray();
        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] == '1') {
                po.add(i);
            }
        }

        int[] result = new int[n];
        for(int i = 0 ; i < chars.length ; i++) {
            for(int p : po) {
                result[i] += Math.abs(p-i);
            }
        }

        return result;
    }
}