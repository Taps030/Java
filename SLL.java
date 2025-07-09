//Singly linked list
class Node{
    int data;
    Node next;
    
    // constructor 
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL{
    
    
    Node head;
    
    //insertatbegin
    
    public void insertatbegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }
    
    //insertatend
    
    public void insertatend(int data){
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    //insertatspecificposition 
    
    public void insertatspecificposition(int data, int position){
        if(position<1){
            System.out.println("Invalid Position");
            return;
        }
        if(position==1){
            insertatbegin(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        for(int i=1; temp!=null && i<position-1; i++){
            temp =temp.next; 
        }
        if(temp==null){
            System.out.println("Position out of bounds");
        }
        else{
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    
    
    //deleteatbeginning 
    
    public void deleteatbeginning(){
        if(head==null){
            return;
        }
        head = head.next;
    }

    // display 
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
    
  public static void main(String[] args){
      SLL list = new SLL();
      list.insertatbegin(10);
      list.insertatbegin(20);
      list.insertatbegin(30);
      list.insertatbegin(40);
      list.insertatbegin(50);
      
      list.insertatend(100);
      list.insertatend(150);
      list.insertatend(200);
      
      list.insertatspecificposition(75,4);
      
    //   list.deleteatbeginning();
    //   list.deleteatbeginning();
      
      list.display();
}

}
