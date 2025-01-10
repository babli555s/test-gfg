//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    string oddEven(string s) {
        // code here
        int n=s.size();
        int temp[26];
        int x=0;
        int y=0;
        memset(temp,0,sizeof temp);
        for(int i=0;i<n;i++)
       temp[s[i]-'a']++;
        for(int i=0;i<26;i++){
            if((i+1)%2){
                if(temp[i]%2)y++;
            }
            else{
                if(temp[i]%2==0 and temp[i]) x++;
            }
        }
        return (x+y)%2==1?"ODD":"EVEN";
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d ", &t);
    while (t--) {

        string s;
        getline(cin, s);

        Solution obj;
        string res = obj.oddEven(s);

        cout << res << "\n";
        cout << "~\n";
    }
}

// } Driver Code Ends