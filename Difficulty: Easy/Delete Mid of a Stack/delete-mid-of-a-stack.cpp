class Solution {
  public:
    // Function to delete middle element of a stack.
    void solve(stack<int> &inputstack,int count,int size){
        if(count==size/2){
            inputstack.pop();
            return;
    }
    int num=inputstack.top();
    inputstack.pop();
    //pop 
    solve(inputstack,count+1,size);
    inputstack.push(num);
    }
    void deleteMid(stack<int>& s) {
        // code here..
        int size=s.size();
        int count=0;
        solve(s,count,size);
    }
};