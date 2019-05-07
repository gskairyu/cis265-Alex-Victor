package bst;

import bst.TreeNode;
// Inner class InorderIterator
public class InorderIterator<E extends Comparable<E>> implements
java.util.Iterator<E> {
// Store the elements in a list
private java.util.ArrayList<E> list = new java.util.ArrayList<>();
private int current = 0; // Point to the current element in list
protected TreeNode<E> root;
public InorderIterator() {
inorder(); // Traverse binary tree and store elements in list
}
/** Inorder traversal from the root */
private void inorder() {
inorder(root);
}
/** Inorder traversal from a subtree */
private void inorder(TreeNode<E> root) {
if (root == null)
return;
inorder(root.left);
list.add(root.element);
inorder(root.right);
}
@Override /** More elements for traversing? */
public boolean hasNext() {
if (current < list.size())
return true;
return false;
}
@Override /** Get the current element and move to the next */
public E next() {
return list.get(current++);
}
}
