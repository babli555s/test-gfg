class Solution {
public:
    string minWindow(string& s1, string& s2) {
        int n = s1.size(), m = s2.size();
        int minLen = INT_MAX;
        int startIndex = -1;

        int i = 0;
        while (i < n) {
            int j = 0;
            // move forward to match s2 as subsequence
            while (i < n) {
                if (s1[i] == s2[j]) {
                    j++;
                    if (j == m) break; // matched whole s2
                }
                i++;
            }
            
            if (i == n) break; // no further match possible

            // Backtrack to shrink window
            int end = i; 
            j = m - 1;
            while (j >= 0) {
                if (s1[i] == s2[j]) j--;
                i--;
            }
            i++; // move forward to the start of valid window

            // Update minimum window
            if (end - i + 1 < minLen) {
                minLen = end - i + 1;
                startIndex = i;
            }

            // continue searching from next character
            i = i + 1; 
        }

        return (startIndex == -1) ? "" : s1.substr(startIndex, minLen);
    }
};
