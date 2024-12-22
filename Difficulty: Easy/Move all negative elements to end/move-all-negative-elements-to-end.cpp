//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

#include <vector>
using namespace std;

class Solution {
public:
    void segregateElements(vector<int>& arr) {
        int n = arr.size();
        
        // Step 1: Collect positive and negative numbers
        vector<int> positive;
        vector<int> negative;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive.push_back(arr[i]);
            } else {
                negative.push_back(arr[i]);
            }
        }
        
        // Step 2: Merge the arrays back into arr
        int idx = 0;
        // Add all positive numbers back
        for (int i = 0; i < positive.size(); i++) {
            arr[idx++] = positive[i];
        }
        // Add all negative numbers back
        for (int i = 0; i < negative.size(); i++) {
            arr[idx++] = negative[i];
        }
    }
};

    

//{ Driver Code Starts.

int main() {
    string ts;
    getline(cin, ts);
    int t = stoi(ts);

    while (t--) {
        string line;
        getline(cin, line);
        stringstream ss(line);
        vector<int> nums;
        int num;
        while (ss >> num) {
            nums.push_back(num);
        }
        Solution ob;
        ob.segregateElements(nums);

        for (int x : nums)
            cout << x << " ";
        cout << "\n~\n";
    }
}
// } Driver Code Ends