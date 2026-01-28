class Solution {
public:
    vector<int> prevSmaller(vector<int>& arr) {
        vector<int> ans;
        stack<int> st;

        for (int i = 0; i < arr.size(); i++) {

            // Pop elements >= current
            while (!st.empty() && st.top() >= arr[i]) {
                st.pop();
            }

            // If stack empty → no smaller element
            if (st.empty())
                ans.push_back(-1);
            else
                ans.push_back(st.top());

            // Push current element
            st.push(arr[i]);
        }

        return ans;
    }
};
