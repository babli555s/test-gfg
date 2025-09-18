// User function Template for C++

class Solution {
  public:
    vector<int> removeDuplicate(vector<int>& arr) {
        // code here
        vector<int>result;
        unordered_map<int,bool>mp;
        int n=arr.size();
       for(int i=0;i<n;i++){
           if(mp.find(arr[i])==mp.end()){
              result.push_back(arr[i]);
              mp[arr[i]]=true;
           }
       }
       return result;
    }
};