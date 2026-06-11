class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist{
    Node head;

    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;

    }
    public void delete(int key){
        Node current=head;
        Node previous=null;

        if(current!=null && current.data==key){
            head=current.next;
            return;
        }
        while(current!=null && current.data!=key){
            previous=current;
            current=current.next;
        }
        if(current==null){
            return;
        }
        previous.next=current.next;

    }
}