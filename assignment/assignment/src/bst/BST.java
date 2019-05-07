package bst;

import java.util.Stack;
public class BST<E extends Comparable<E>> implements Tree<E> {
 protected TreeNode<E> root;
 protected int size = 0;
 /** Create a default binary tree */
 public BST() {
 }
 /** Create a binary tree from an array of objects */
 public BST(E[] objects) {
 for (int i = 0; i < objects.length; i++)
 add(objects[i]);
 }
 @Override /** Returns true if the element is in the tree */
 public boolean search(E e) {
 TreeNode<E> current = root; // Start from the root
 
 /* YOUR CODE HERE */
 return false;
 }
 @Override /** Insert element e into the binary tree
 * Return true if the element is inserted successfully */
 public void insert(E e) {
 root = insertRecord(root, e);
 }
 @SuppressWarnings("unchecked")
public TreeNode insertRecord(TreeNode root, E e){
 if (root == null) {
 root = new TreeNode(e);
 System.out.print(root.element + " ");
 size++;
 return root;
 }
 if (e.compareTo((E) root.element) < 0)
 root.left = insertRecord(root.left, e);
 else if (e.compareTo((E) root.element) > 0)
 root.right = insertRecord(root.right, e);
 return root; // Element inserted successfully
 }
 protected TreeNode<E> createNewNode(E e) {
 return new TreeNode<>(e);
 }
 @Override /** Inorder traversal from the root */
 public void inorder() {
 inorder(root);
 }
 /** Inorder traversal from a subtree */
 protected void inorder(TreeNode<E> root) {

/* YOUR CODE HERE */
 }
 @Override /** Postorder traversal from the root */
 public void postorder() {
 postorder(root);
 }
 /** Postorder traversal from a subtree */
 protected void postorder(TreeNode<E> root) {

/* YOUR CODE HERE */
 }
 @Override /** Preorder t7raversal from the root */
 public void preorder() {
 preorder(root);
 }
 /** Preorder traversal from a subtree */
 protected void preorder(TreeNode<E> root) {

/* YOUR CODE HERE */
 }
 @Override /** Get the number of nodes in the tree */
 public int getSize() {
 return size;
 }
 /** Returns the root of the tree */
 public TreeNode<E> getRoot() {
 return root;
 }
 /** Returns a path from the root leading to the specified element */
 public java.util.ArrayList<TreeNode<E>> path(E e) {
 java.util.ArrayList<TreeNode<E>> list =
 new java.util.ArrayList<>();
 TreeNode<E> current = root; // Start from the root
 while (current != null) {
 list.add(current); // Add the node to the list
 if (e.compareTo(current.element) < 0) {
 current = current.left;
 }
 else if (e.compareTo(current.element) > 0) {
 current = current.right;
 }
 else
 break;
 }
 return list; // Return an array list of nodes
 }
 @Override /** Delete an element from the binary tree.
 * Return true if the element is deleted successfully
 * Return false if the element is not in the tree */
 public boolean delete(E e) {
 // Locate the node to be deleted and also locate its parent node
 TreeNode<E> parent = null;
 TreeNode<E> current = root;
 while (current != null) {
 if (e.compareTo(current.element) < 0) {
 parent = current;
 current = current.left;
 }
 else if (e.compareTo(current.element) > 0) {
 parent = current;
 current = current.right;
 }
 else
 break; // Element is in the tree pointed at by current
 }
 if (current == null)
 return false; // Element is not in the tree
 // Case 1: current has no left child
 if (current.left == null) {
 // Connect the parent with the right child of the current node
 if (parent == null) {
 root = current.right;
 }
 else {
 if (e.compareTo(parent.element) < 0)
 parent.left = current.right;
 else
 parent.right = current.right;
 }
 }
 else {
 // Case 2: The current node has a left child
 // Locate the rightmost node in the left subtree of
 // the current node and also its parent
 TreeNode<E> parentOfRightMost = current;
 TreeNode<E> rightMost = current.left;
 while (rightMost.right != null) {
 parentOfRightMost = rightMost;
 rightMost = rightMost.right; // Keep going to the right
 }
 // Replace the element in current by the element in rightMost
 current.element = rightMost.element;
 // Eliminate rightmost node
 if (parentOfRightMost.right == rightMost)
 parentOfRightMost.right = rightMost.left;
 else
 // Special case: parentOfRightMost == current
 parentOfRightMost.left = rightMost.left;
 }
 size--;
 return true; // Element deleted successfully
 }
 @Override /** Obtain an iterator. Use inorder. */
 public java.util.Iterator<E> iterator() {
 return new InorderIterator();
 }
 @Override /** Remove all elements from the tree */
 public void clear() {
 root = null;
 size = 0;
 }
}
