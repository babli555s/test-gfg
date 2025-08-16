/*
class Node {
  public:
    int data;
    Node* next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};

*/

/*
class Node {
  public:
    int data;
    Node* next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};
*/

/*
class Node {
  public:
    int data;
    Node* next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};
*/

class Solution {
  public:
    // Function to reverse a linked list
    Node* reverse(Node* head) {
        Node* prev = NULL;
        Node* curr = head;
        while (curr != NULL) {
            Node* nxt = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    // Main function to add two lists
    Node* addTwoLists(Node* head1, Node* head2) {
        // Step 1: Reverse both lists
        head1 = reverse(head1);
        head2 = reverse(head2);

        Node* dummy = new Node(0);
        Node* ans = dummy;
        int carry = 0;

        // Step 2: Add digit by digit
        while (head1 != NULL || head2 != NULL || carry != 0) {
            int x = (head1 != NULL) ? head1->data : 0;
            int y = (head2 != NULL) ? head2->data : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            ans->next = new Node(sum % 10);
            ans = ans->next;

            if (head1) head1 = head1->next;
            if (head2) head2 = head2->next;
        }

        // Step 3: Reverse result back
        Node* result = reverse(dummy->next);

        // Step 4: Remove leading zeros
        while (result && result->data == 0 && result->next != NULL) {
            result = result->next;
        }

        return result;
    }
};
