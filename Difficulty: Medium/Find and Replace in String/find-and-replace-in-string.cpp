// User function Template for C++

class Solution {
  public:
    string findAndReplace(string S, int Q, int index[], string sources[],
                          string targets[]) {
        // Process from right to left so indices don't shift
        vector<pair<int,int>> ops;
        for (int i = 0; i < Q; i++) {
            ops.push_back({index[i], i});
        }

        // Sort by index in descending order
        sort(ops.rbegin(), ops.rend());

        for (auto &op : ops) {
            int idx = op.first;
            int q   = op.second;

            string src = sources[q];
            string tgt = targets[q];

            // Only replace if substring matches
            if (S.substr(idx, src.size()) == src) {
                S.replace(idx, src.size(), tgt);
            }
        }

        return S;
    }
};
