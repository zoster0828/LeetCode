class Solution {
public:
    int eliminateMaximum(vector<int>& d, vector<int>& s) {
       for(int i=0; i<d.size(); i++){
           d[i]=((d[i]-1)/s[i]); }
       sort(d.begin(),d.end());
       for(int i=0; i<d.size(); i++){
         if(i>d[i]) return i;  
         }      
       return d.size();
    }
};