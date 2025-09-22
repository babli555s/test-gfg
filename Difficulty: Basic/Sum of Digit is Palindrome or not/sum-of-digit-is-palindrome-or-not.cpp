// User function Template for C++

class Solution {
  public:
  bool ispallindrome(int num){
      int original=num;
      int rev=0;
      while(num>0){
          rev=rev*10+(num%10);
          num/=10;
      }
      return rev==original;
  }
    bool isDigitSumPalindrome(int n) {
        // code here
        int result=0;
        while(n>0){
          result+=n%10;
          n=n/10;
        }
        return ispallindrome(result);
    }
};