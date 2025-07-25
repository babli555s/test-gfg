#include <deque>
using namespace std;

class Solution {
public:
    // Push at back
    void pb(deque<int>& dq, int x) {
        dq.push_back(x);
    }

    // Pop from back
    void ppb(deque<int>& dq) {
        if (!dq.empty())
            dq.pop_back();
    }

    // Get front element
    int front_dq(deque<int>& dq) {
        if (!dq.empty())
            return dq.front();
        return -1; // return -1 if empty
    }

    // Push at front
    void pf(deque<int>& dq, int x) {
        dq.push_front(x);
    }
};
