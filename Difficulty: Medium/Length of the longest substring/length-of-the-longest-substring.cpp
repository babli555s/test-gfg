class Solution {
public:
    int longestUniqueSubstring(string s) {
        int n = s.length();
        unordered_set<char> st; // stores current window characters
        int left = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {
            // if duplicate, shrink window
            while (st.find(s[right]) != st.end()) {
                st.erase(s[left]);
                left++;
            }
            st.insert(s[right]); // add current char
            maxLen = max(maxLen, right - left + 1);
        }

        return maxLen;
    }
};
