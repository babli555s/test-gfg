class Solution {
  public:
    // Function to find transpose of a matrix.
    void transpose(vector<vector<int>>& mat, int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                swap(mat[i][j],mat[j][i]);
            }
        }
        
        
    }
};