//{ Driver Code Starts
// Initial template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function template for C++

class Solution {
  public:
    void segregate0and1(vector<int> &arr) {
        // code here
        int n=arr.size();
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
            else{
                swap(arr[left],arr[right]);
                left++;
                right--;
            }
        }
    }
};


//{ Driver Code Starts.
int main() {
    int t;

    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        int n = arr.size();
        Solution ob;
        ob.segregate0and1(arr);
        for (int i = 0; i < n; i++) {
            cout << arr[i] << " ";
        }
        cout << "\n";
        cout << "~" << endl;
    }
    return 0;
}
// } Driver Code Ends