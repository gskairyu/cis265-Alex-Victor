import java.util.Iterator; 
import java.util.LinkedList; 
class CreateQueue<E> implements Iterable{ 
 private LinkedList<E> list = new LinkedList<E>(); 
 
 public void enqueue(E item) { // SAME AS PUSH IN STACK 
  list.addLast(item); 
 } 
 public E dequeue() { // SAME AS POP IN STACK 
  return list.poll(); 
 } 
 public boolean hasItems() { // CHECKS IF THE QUEUE IS EMPTY OR NOT 
  return !list.isEmpty(); 
 } 
 public int size() { // DETERMINES THE SIZE OF QUEUE 
  return list.size(); 
 } 
 public void addItems(CreateQueue<? extends E> q) { //ADDS ITEMS TO LINKED LIST 
  while (q.hasItems()) 
   list.addLast(q.dequeue()); 
 } 
 @Override 
 public Iterator iterator() { //RETURNS QUEUE VALUES AS A LIST 
  return list.iterator(); 
 } 
} 
