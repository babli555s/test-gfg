// User function Template for C++

class Solution {
  public:
    int checkCompressed(string S, string T) {
        int i = 0, j = 0;
        
        while (i < T.size() && j < S.size()) {
            if (isdigit(T[i])) {
                // Build number (can be multi-digit)
                int count = 0;
                while (i < T.size() && isdigit(T[i])) {
                    count = count * 10 + (T[i] - '0');
                    i++;
                }
                j += count; // skip these many chars in S
            } else {
                if (S[j] != T[i]) return 0; // mismatch
                i++;
                j++;
            }
        }
        
        // Both strings should be fully traversed
        return (i == T.size() && j == S.size());
    }
};
