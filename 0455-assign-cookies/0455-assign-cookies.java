class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0) return 0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        int chpo = 0;
        int coopo = 0;
        int result = 0;
        
        while(true) {
            if(g[chpo] <= s[coopo]) {
                result++;
                chpo++;                
            } 
            
            coopo++;
            
            if(chpo == g.length || coopo == s.length) break;
        }        
        
        
        return result;
    }
}