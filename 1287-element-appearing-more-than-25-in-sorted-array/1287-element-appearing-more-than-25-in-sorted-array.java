class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = arr.length;
        int pre = -1;
        
        int flag = 0;
        for(int i = 0 ; i < max ; i ++) {
            if(arr[i] == pre) {
                flag ++;
            }else {
                pre = arr[i];
                flag = 0;
            }
            
            if(flag >= max /4) {
                return pre;
            }
        }
        
        return -1;
    }
}