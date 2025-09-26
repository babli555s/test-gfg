#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    // Helper: sigma(x) = sum of divisors of x (O(sqrt(x)))
    long long sigma(int x) {
        long long s = 0;
        for (int i = 1; i * i <= x; ++i) {
            if (x % i == 0) {
                s += i;
                int j = x / i;
                if (j != i) s += j;
            }
        }
        return s;
    }

    // Required: sum of sigma(d) for every divisor d of N
    long long sumOfDivisors(int N) {
        long long total = 0;
        for (int i = 1; i * i <= N; ++i) {
            if (N % i == 0) {
                total += sigma(i);
                int other = N / i;
                if (other != i) total += sigma(other);
            }
        }
        return total;
    }
};
