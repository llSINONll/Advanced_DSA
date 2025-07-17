class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Day11{
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
  public void addToLast(int data){
    Node newNode = new Node(data);
    Node temp = head;
    while (temp.next!=null) { 
        temp=temp.next;
    }
    temp.next=newNode;
    newNode.next=null;
  }
  void Display(){
    Node temp = head;
    while (temp!=null) { 
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
  }
  public static void main(String[] args) {
    Day11 list = new Day11();
    list.addToFirst(5);
    list.addToFirst(10);
    list.addToLast(100);
    list.Display();
  }
}

