//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++
class Solution {
  public:
    int missingNumber(vector<int>& arr) {
        // code here
      int n = arr.size() + 1;

        // Use long long to handle large numbers
        long long sum = 1LL * n * (n + 1) / 2; // Calculate the expected sum
        long long arrsum = 0; // Initialize the array sum

        // Calculate the sum of the array elements
        for (int i = 0; i < arr.size(); i++) {
            arrsum += arr[i];
        }

        // The missing number is the difference between the expected sum and the array sum
        return sum - arrsum;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore(); // to ignore the newline after the integer input
    while (t--) {
        int n;
        vector<int> a;
        string input;

        // Input format: first number n followed by the array elements
        getline(cin, input);
        stringstream ss(input);
        int num;
        while (ss >> num)
            a.push_back(num);

        Solution obj;
        cout << obj.missingNumber(a) << endl;
        cout << "~\n";
    }

    return 0;
}

// } Driver Code Ends