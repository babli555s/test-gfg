//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

void checkString(string s);


// } Driver Code Ends

//User function Template for C++

void checkString(string s)
{
     int v=0;
    int c=0;
    for(char ch:s){
        if(isalpha(ch)){
        if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
        v++;
        }
        else{
            c++;
        }
    }
    }
   
    
    //Your code here
    
    if(v>c){
        cout<<"Yes";
    }
    else if(c>v){
        cout<<"No";
    }
    else{
        cout<<"Same";
    }
    
    cout<<endl;
}



//{ Driver Code Starts.

int main() {
	int t;
	cin>>t;
	cin.ignore();
	while(t--)
	{
	    
	    string s;
	    getline(cin,s);
	    
	    //function call
	    checkString(s);
	   
	
cout << "~" << "\n";
}
	return 0;
}


// } Driver Code Ends