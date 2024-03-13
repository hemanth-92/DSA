package linkedlist;
public void BasicLinkedList(){
  static class node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;

  }
  //single linked list 
  static node head = null;
  public static void main(String[] args){
   insertion();

  }
  public static void printLL(){
      Node temp = head;
      while(temp!=null){
	System.out.print(temp.data + "->");
        temp = temp.next;
      }
    System.out.print("null");
  }
}
}
