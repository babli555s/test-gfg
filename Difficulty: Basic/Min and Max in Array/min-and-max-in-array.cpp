// User function Template for C++
class Solution {
  public:
  
    int getmin(const vector<int>&arr){
        int n=arr.size();
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=min(res,arr[i]);
        }
        return res;
    }
    int getmax(const vector<int>&arr){
         int n=arr.size();
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=max(res,arr[i]);
        }
        return res;
    }
    pair<int, int> getMinMax(vector<int> arr) {
        // code here
        int minimum=getmin(arr);
        int maximum=getmax(arr);
        return{minimum,maximum};
        
       
    }
};