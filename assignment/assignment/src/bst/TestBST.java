package bst;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.Scanner;
public class TestBST {
public static void main(String[] args) {
// Create a BST
BST<String> tree = new BST<>();
try { // reads in words from a file
String word;
BufferedReader diskInput = new BufferedReader(new InputStreamReader(new
FileInputStream(new File("C:\\Users\\victo\\Desktop\\spring_cis_265\\assignment\\src\\bst\\city.txt"))));
Scanner input = new Scanner(diskInput);
while (input.hasNext()) {
word = input.next();
word = word.toLowerCase();
tree.insert(word);
}
} catch (IOException e) {
System.out.println("io exception");
}
System.out.println();
// Traverse tree
System.out.print("Inorder: ");
tree.inorder();
System.out.print("\nPostorder: ");
tree.postorder();
System.out.print("\nPreorder: ");
tree.preorder();
System.out.print("\nThe number of nodes is " + tree.getSize());
// Search for an element
boolean found = false;
found = tree.search("athens");
System.out.print("\nIs athens in the tree? " + found);
if(found){
// Get a path from the root to athens
System.out.print("\nA path from the root to athens is: ");
java.util.ArrayList<TreeNode<String>> path = tree.path("athens");
for (int i = 0; path != null && i < path.size(); i++)
System.out.print(path.get(i).element + " ");
}
found = false;
found = tree.search("assignment4");
System.out.print("\nIs assignment4 in the tree? " + found);
}
}


