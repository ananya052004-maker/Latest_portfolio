#include<stdlib.h>
#include<stdio.h>
struct Node
{
    int value;
    struct Node* root->right;
    struct Node* root->left;
}
struct Node* newnode(int value)
{
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->value=value;
    node->left->right=null;
    return;

}
void inorder(struct Node* root)
{
    if(root!=null)
    {
        inorder(root->left);
        printf("%d",root->value);
        inorder(root->right);

    }
}
void preorder(struct Node* root)
{
    if(root!=null)
    {
        printf("%d",root->value);
        preorder(root->left);
        preorder(root->right);
        
    }
}
void postorder(struct Node* root)
{
    if(root!=null)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d",root->value);
    }
}
int main()
{
    struct Node* = newnode(1);
    root->right(2);
    root->left(3);
    root->right(4);
    root->left(5);
    root->left->left(6);
    int n = scanf(&%d);
    switch(n)
    {
        case 1:
        inorder(root);
        break;
        case 2:
        preorder(root);
        break;
        case 3:
        postorder(root);
        break;
        default:
        printf("invalid");
        break;
    }
    return 0;
}