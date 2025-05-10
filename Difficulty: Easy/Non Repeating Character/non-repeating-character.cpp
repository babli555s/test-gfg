//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    char nonRepeatingChar(string &s) {
        // Your code here
         unordered_map<char, int> m;
        
        // Count occurrences
        for (char c : s) {
            m[c]++;
        }

        // Traverse original string to maintain order
        for (char c : s) {
            if (m[c] == 1) {
                return c;
            }
        }

        return '$'; // Indicates no non-repeating character found
    }
};


//{ Driver Code Starts.

int main() {

    int T;
    cin >> T;

    while (T--) {

        string S;
        cin >> S;
        Solution obj;
        char ans = obj.nonRepeatingChar(S);

        if (ans != '$')
            cout << ans;
        else
            cout << "-1";

        cout << endl;

        cout << "~"
             << "\n";
    }

    return 0;
}

// } Driver Code Ends