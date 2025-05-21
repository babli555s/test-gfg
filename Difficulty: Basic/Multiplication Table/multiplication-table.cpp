// User function Template for C++
class Solution {
  public:
    vector<int> getTable(int n) {
        // Write Your Code here
        vector<int>temp;
        for(int i=1;i<=10;i++){
           temp.push_back(n*i);
            
        }
        return temp;
    }
};