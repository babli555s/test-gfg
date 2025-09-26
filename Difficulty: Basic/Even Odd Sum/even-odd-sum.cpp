class Solution {
  public:
 
    vector<int> EvenOddSum(int N, int Arr[]) {
        // code here
        int sum=0;
        int evenindex=0;
        int oddindex=0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                evenindex+=Arr[i];
            }
            else{
                oddindex+=Arr[i];
            }
        }
        return {evenindex,oddindex};
    }
};