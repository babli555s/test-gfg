class Solution {
  public:
    int findMean(vector<int>& arr) {
        // code here
        int n=arr.size();
        int sum=0;
        int mean=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum/n;
    }
};