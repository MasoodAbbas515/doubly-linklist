class dll{
    Node head;
    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

// add_first
public void AddFirst(String data) {
    Node  temp = new Node(data);
    if ( head ==null) {
      head=temp;
      return;
  }
  temp.next=head;
  head=temp;
}
// add_last
public void AddLast(String data) {
    Node  temp = new Node(data);
    if ( head ==null) {
      head= temp;
      return;
    }
    Node currNode =head;
    while(currNode.next != null){
        currNode=currNode.next;
    }
    currNode.next=temp;
    temp.prev=currNode;
}
public void printlist() {
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    Node currNode =head;
    while(currNode != null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
}
public static void main(String args[]) {
    
    Link_List words= new Link_List();
    // words.AddFirst("Mornig");
    // words.AddFirst("Good");
    // words.AddFirst("Hellow");
    words.AddLast("uigui");
    words.AddLast("jkfhjilh");
    words.printlist();

}
}