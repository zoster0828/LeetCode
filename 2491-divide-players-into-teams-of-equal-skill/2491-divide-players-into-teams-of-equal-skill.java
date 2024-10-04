class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int num = skill[0] + skill[skill.length - 1];
        long result = skill[0] * skill[skill.length - 1];
        for(int i = 1 ; i < skill.length / 2 ; i++) {
            if(num == skill[i] + skill[skill.length - i - 1]) {
                result += skill[i] * skill[skill.length - i - 1];
            }else {
                return -1;
            }
        }

        return result;
    }
}