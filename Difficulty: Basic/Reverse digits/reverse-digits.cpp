class Solution {
  public:
    int reverseDigits(int n) {
        // Code here
        int reversed=0;
        while(n>0){
         int remainder=n%10;
            reversed=reversed*10+remainder;
            n/=10;
        }
        return reversed;
        
    }
};