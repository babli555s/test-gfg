class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[n-i-1];
            arr[n-i-1]=arr[i];
            arr[i]=temp;
        }
    }
}