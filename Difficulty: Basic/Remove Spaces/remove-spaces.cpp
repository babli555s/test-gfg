class Solution {
  public:
    string modify(string& s) {
        // code here.
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s[i]!=' '){
                s[count++]=s[i];
            }
        }
        s.resize(count);
        return s;
        
    }
};