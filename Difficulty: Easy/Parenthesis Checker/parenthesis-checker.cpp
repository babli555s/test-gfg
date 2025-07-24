class Solution {
public:
    bool isBalanced(string& k) {
        stack<char> s;
        for (int i = 0; i < k.size(); i++) {
            char ch = k[i];

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (!s.empty()) {
                    char top = s.top();
                    if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                        s.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return s.empty();
    }
};
