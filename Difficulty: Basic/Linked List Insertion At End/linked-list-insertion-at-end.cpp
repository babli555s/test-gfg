/*Structure of the linked list node is as
struct Node {
  int data;
  struct Node * next;
  Node(int x) {
    data = x;
    next = NULL;
  }
}; */

class Solution {
  public:
    Node *insertAtEnd(Node *head, int x) {
        // Code here
       
        Node* curr=head;
        
       
            Node* newNode=new Node(x);
             if(head==NULL) return newNode;
             while(curr->next!=NULL){
                 curr=curr->next;
             }
            curr->next=newNode;
            return head;
    }
};
