// Function to search a node in BST.
bool search(Node* root, int x) {
    // Your code here
     while (root != NULL) {
        if (root->data == x) return true;
        else if (x < root->data) 
        root = root->left;
        else root = root->right;
    }
    return false;
}