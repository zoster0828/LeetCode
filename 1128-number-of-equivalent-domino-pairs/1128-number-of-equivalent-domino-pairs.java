class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int result = 0;

        for (int[] d : dominoes) {
            // 정렬된 형태로 key 통일 (작은 수가 앞)
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int key = a * 10 + b;

            result += count[key]; // 기존 동일 도미노 수만큼 pair 추가
            count[key]++;         // 자기 자신 카운트 증가
        }

        return result;
    }
}
