class Solution {
public:
    // check if a number is prime
    bool isprime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    vector<int> primeFac(int n) {
        vector<int> ans;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isprime(i)) {
                ans.push_back(i);
            }
        }
        return ans;
    }
};
