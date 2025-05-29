// User function Template for C++

class Solution {
  public:
  int pallin(string s){
      int n=s.size();
    
      for(int i=0;i<n/2;i++){
         if(s[i]!=s[n-1-i]){
             return false;
         }
      }
         return true;
  }
    bool isPalindrome(int n) {
        // Code here.
        string s=to_string(n);
        return pallin(s);
    }
};