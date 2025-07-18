class Solution {
  public:
    int findKRotation(vector<int> &arr) {
        // Code Here
        int n=arr.size();
        int minindex=0,min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
        }
        return minindex;
        
        // int n=arr.size();
    //  int min = arr[0], min_index = 0;
    // for (int i = 0; i < n; i++) {
    //     if (min > arr[i]) {
    //         min = arr[i];
    //         min_index = i;
    //     }
    // }
    // return min_index;
    }
};
        
   