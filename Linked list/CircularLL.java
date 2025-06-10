public class CircularLL {
    public class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    static Node head=null;
    static Node tail=null;

    public void insert(int val){
        Node newNode=new Node(val);
        if(head == null){
            head=tail=newNode;
            tail.next=head;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
        
    }
    public void delete(int val){
        Node node=head;
        if(head == null){
            return;
        }
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.val == val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.val+" -> ");
                node=node.next;
            }while(node!=head);
            System.out.println("back to head");
        }
    }

    public static void main(String args[]){
        CircularLL cll=new CircularLL();
        cll.insert(23);
        cll.insert(19);
        cll.insert(21);
        cll.insert(24);
        cll.display();
        cll.delete(21);
        cll.display();

    }
}
