void checkString(string s) {
    int v = 0; // vowels
    int c = 0; // consonants
    int n = s.size();
    for (int i = 0; i < n; i++) {
        char ch = s[i];
        if (isalpha(ch)) { // only consider alphabets
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                v++;
            } else {
                c++;
            }
        }
    }

    if (v > c)
        cout << "Yes";
    else if (c > v)
        cout << "No";
    else
        cout << "Same";

    cout << endl;
}

