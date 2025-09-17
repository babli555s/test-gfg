// User function Template for C++

class Solution {
  public:
  bool isPrime(int n){
      if(n<=1) return false;
      for(int i=2;i*i<=n;i++){
          if(n%i==0) return false;
      }
      return true;
  }
    vector<int> primeRange(int M, int N) {
        // code here
        vector<int>result;
        for(int i=M;i<=N;i++){
            if(isPrime(i)){
                result.push_back(i);
            }
        }
        return result;
    }
};