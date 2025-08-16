class Solution {
  public:
    int characterReplacement(string s, int k) {
        vector<int> occurance(26, 0);  // instead of int[]
        int left = 0, maxOccurance = 0, ans = 0;

        for (int right = 0; right < s.size(); right++) {
            // Count current char
            maxOccurance = max(maxOccurance, ++occurance[s[right] - 'A']);

            // If window is invalid, shrink from left
            while (right - left + 1 - maxOccurance > k) {
                occurance[s[left] - 'A']--;
                left++;
            }

            // Update answer
            ans = max(ans, right - left + 1);
        }

        return ans;
    }
};
