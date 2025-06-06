class Solution {
  public:
    // Please change the array in-place
    void insertionSort(vector<int>& arr) {
        // code here
         int n=arr.size();
       
        for(int i=0;i<n;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
             arr[j+1]=key;
        }
       
    
    }
};