class Solution {
public:
    int countWords(string &s) {
        int count=0;
        bool inWord=false;
        for (char c:s) {
            if (isalpha(c)) {
                if (!inWord) {
                    count++;
                    inWord=true;
                }
            } else {
                inWord=false;
            }
        }
        return count;
    }
};

