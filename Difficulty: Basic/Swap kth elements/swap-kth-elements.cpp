
class Solution {
  public:
    void swapKth(vector<int> &arr, int k) {
        // code here
        int n=arr.size();
      if(k<=n){
          int temp=arr[k-1];
          arr[k-1]=arr[n-k];
          arr[n-k]=temp;
      }
    }
};
