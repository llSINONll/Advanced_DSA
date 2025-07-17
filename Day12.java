class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Day12{
  Node head;
  public void addToFirst(int data){
    Node newNode = new Node(data);
    if (head==null) {
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
  }
  public void addAtPosition(int data, int p){
    Node newNode = new Node(data);
    Node tempNode = head;
    for (int i = 0; i<p-1; i++) {
        tempNode = tempNode.next;
    }
    newNode.next = tempNode.next;
    tempNode.next = newNode;
  }
  public void addToLast(int data){
    Node newNode = new Node(data);
    Node temp = head;
    while (temp.next!=null) { 
        temp=temp.next;
    }
    temp.next=newNode;
    newNode.next=null;
  }
  public void deleteFirst(){
    head = head.next;
  }
  public void deleteLast(){
    Node tempNode = head;
    if (head==null) {
        
    }
    if (head.next==null) {
        head=null;
    }
    while (tempNode.next!=null && tempNode.next.next!=null) { 
        tempNode = tempNode.next;
    }
    tempNode.next = null;
  }
  public void deleteAtPosition(int p){
    Node tempNode = head;
    if (head==null) {
        
    }
    if (p==0) {
        head = head.next;
    }
    for (int i = 0; i < p-1; i++) {
        
    }
  }
  void Display(){
    Node temp = head;
    while (temp!=null) { 
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
  }
  public static void main(String[] args) {
    Day12 list = new Day12();
    list.addToFirst(5);
    list.addToFirst(10);
    list.addToLast(100);
    list.addAtPosition(15, 2);
    list.deleteFirst();
    list.deleteLast();
    list.Display();
  }
}
