class Solution {
  public:
    vector<int> findUnion(vector<int> &a, vector<int> &b) {
        // code here
          set<int> s; // automatically keeps elements unique and sorted
        
        for (int x : a) s.insert(x);
        for (int x : b) s.insert(x);
        
        vector<int> result(s.begin(), s.end()); // convert set to vector
        return result;
    }
};