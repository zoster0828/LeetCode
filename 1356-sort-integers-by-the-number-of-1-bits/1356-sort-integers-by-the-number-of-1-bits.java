class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int po = 0;
        int set = 0;
        boolean[] point = new boolean[arr.length];
        for(int is = 0 ; is < 15 ; is++) {
            if(set == arr.length) break;
            
            for(int i = 0 ; i < arr.length ; i++) {
                if(point[i]) {
                    continue;
                }

                int count = get1Count(arr[i]);
                if(count == is) {
                    result[po] = arr[i];                    
                    po++;
                    set++;
                    point[i] = true;
                }
            }
        }
        
        return result;
    }
    
    public int get1Count(int a) {
        String binaryString = Integer.toBinaryString(a);
        int count = 0;
        char[] chars = binaryString.toCharArray();
        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] == '1') {
                count++;
            }
        }
        
        return count;
    }
}