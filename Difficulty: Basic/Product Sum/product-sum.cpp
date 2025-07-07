// User function Template for C++
class Solution {
  public:
    long long int countDigits(long long int a, long long int b) {
        // code here
       long long int result=a*b;
        int count=0;
        if (result==0) return 1;
        while(result!=0){
            
            count++;
            result/=10;
        }
        return count;
    }
};