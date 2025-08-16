/*
class Node {
 public:
    int data ;
    Node *next ;

    Node(int x) {
        data = x ;
        next = NULL ;
    }
};
*/

class Solution {
  public:
    Node* reverseList(struct Node* head) {
        // code here
        Node* curr=head;
        Node* prev=NULL;
       
        while(curr!=NULL){
            Node* nxt=curr->next;
            curr->next=prev;
            prev=curr;
            curr=nxt;
            
            
            
        }
        return prev;
    }
};