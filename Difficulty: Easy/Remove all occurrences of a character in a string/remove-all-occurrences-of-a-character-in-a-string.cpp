// User function Template for C++
class Solution {
  public:
    // Function to remove all occurrences of the character from the string
    void removeCharacter(string &s, char c) {
        // code here
        string ans="";
        int n=s.length();
        for(char ch:s){
            if(ch!=c){
                ans.push_back(ch);
            }
        }
        s=ans;
    }
};