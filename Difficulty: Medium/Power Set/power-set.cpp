class Solution {
public:

    void helper(string &s, int index, string &cur, vector<string> &res) {
        if (index == s.length()) {
            if (!cur.empty())       // exclude empty string
                res.push_back(cur);
            return;
        }

        // include the current character
        cur.push_back(s[index]);
        helper(s, index + 1, cur, res);

        // exclude the current character
        cur.pop_back();
        helper(s, index + 1, cur, res);
    }

    vector<string> AllPossibleStrings(string s) {
        vector<string> res;
        string cur = "";

        helper(s, 0, cur, res);

        sort(res.begin(), res.end());  // required by GFG
        return res;
    }
};
