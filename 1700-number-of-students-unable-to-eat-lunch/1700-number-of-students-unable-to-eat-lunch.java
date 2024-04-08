class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i = 0;
        int len = students.length;
        int sandpo = 0;
        int start = 0;
        int eat = 0;
        while(true) {
            if(students[(i) % len] == sandwiches[sandpo]) {
                sandpo++;   
                students[(i) % len] = -1;
                eat++;
                start = (i) % len;
            }
            
            i++;
            
            if(start == (i) % len) {break;}
            if(sandpo == sandwiches.length) return 0;
        }
        
        return len - eat;
    }
}