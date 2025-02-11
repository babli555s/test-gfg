//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    // Function to find largest rectangular area possible in a given histogram.
    int getMaxArea(vector<int> &arr) {
        // Your code here
       int n = arr.size();
    stack<int> s;
    vector<int> left(n), right(n);

    // Finding the nearest smaller to the left
    for (int i = 0; i < n; i++) {
        while (!s.empty() && arr[s.top()] >= arr[i]) {
            s.pop();
        }
        left[i] = (s.empty()) ? 0 : s.top() + 1; // If no smaller element, set index 0
        s.push(i);
    }

    // Clearing stack for next computation
    while (!s.empty()) s.pop();

    // Finding the nearest smaller to the right
    for (int i = n - 1; i >= 0; i--) {
        while (!s.empty() && arr[s.top()] >= arr[i]) {
            s.pop();
        }
        right[i] = (s.empty()) ? n - 1 : s.top() - 1; // If no smaller element, set index n-1
        s.push(i);
    }

    // Compute the maximum area
    int maxArea = 0;
    for (int i = 0; i < n; i++) {
        maxArea = max(maxArea, arr[i] * (right[i] - left[i] + 1));
    }

    return maxArea;
}
};

//{ Driver Code Starts.

int main() {
    string ts;
    getline(cin, ts);
    int t = stoi(ts);
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        Solution obj;
        int res = obj.getMaxArea(arr);
        cout << res << endl;
        cout << "~" << endl;
        // string tl;
        // getline(cin, tl);
    }
    return 0;
}

// } Driver Code Ends