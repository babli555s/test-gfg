//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    int nthFibonacci(int n) {
        // code here
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        int fibo;
        int f0=0;
        int f1=1;
        for(int i=2;i<=n;i++){
            
            fibo=f0+f1;
            f0=f1;
            f1=fibo;
            
        }
        return fibo;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        cout << ob.nthFibonacci(n) << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}

// } Driver Code Ends