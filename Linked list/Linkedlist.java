class Linkedlist{
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
        this.data=data;
        this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head == null){
          head=tail=newNode;
          return;
        }
        

        newNode.next=head;

        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        // if(head == null){
        //     System.out.println("LL is empty");
        //     return;
        // }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i < idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
      if(size == 0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
      }else if(size == 1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
      }
       Node prev=head;
      for(int i=0 ; i<size-2 ; i++){
         prev=prev.next;
      }
      int val=prev.next.data;
      prev.next=null;
      tail=prev;
      size--;
      return val;
    }
    public  int search(int key){
            
        Node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        Node prev= null;
        Node cur= tail= head;
        Node next;
        while(cur != null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
      head=prev;
    }

    public void deleteNthFromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp != null){
            size++;
            temp=temp.next;
        }

        if(n == size){
            head=head.next; //removeFirst
            return;
        }

        int i=1;
        int iToInd=size-n;
        Node prev=head;
        while(i < iToInd){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;
    }

    public Node mid(Node head){
        Node slow =head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalind(){
        if(head == null || head.next == null){
            return true;
        }
      Node midNode=mid(head);

      Node cur=midNode;
      Node prev=null;
    //   Node next;
      
      while(cur != null){
        Node next=cur.next;
         cur.next=prev;
         prev=cur;
         cur=next;
      }

      Node right=prev;
      Node left=head;

      while(right != null){
        if(left.data != right.data){
            return false;
        }
        left=left.next;
        right=right.next;
      }
      return true;
    }

    public static boolean cycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean exits=false;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                exits=true;
                break;
            }
        }
        if(exits == false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow != fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
     private Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
     }

     private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
              temp.next=head1;
              head1=head1.next;
              temp=temp.next;
            }else{
             temp.next=head2;
             head2=head2.next;
             temp=temp.next;
            }
        }

        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
     }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getmid(head);

        Node righhead=mid.next;
        mid.next=null;
        Node newLeft =mergeSort(head);
        Node newRight=mergeSort(righhead);


        return merge(newLeft,newRight);
    }
    public void zigzag(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left != null && right !=null){
             nextL=left.next;
             left.next=right;
             nextR=right.next;
             right.next=nextL;


             left=nextL;
             right=nextR;

        }
    }

    public void removedupli(){
        Node node=head;
        while(node.next!=null){
            if(node.next !=null && node.data==node.next.data){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    public static void main(String args[]){
     Linkedlist ll=new Linkedlist();
    //  ll.addFirst(1);
    //  ll.addFirst(2);
    //  ll.addFirst(3);
    //  ll.addFirst(4);
    //  ll.addFirst(5);
    //  ll.addFirst(6);
    //  ll.addFirst(7);
     
    //  ll.print();
    //  ll.removedupli();
    //  ll.print();

     ll.addLast(1);
     ll.addLast(2);
     ll.addLast(3);
     ll.addLast(4);
     ll.addLast(5);
     ll.print();
     ll.deleteNthFromEnd(2);
     ll.print();
    //  ll.zigzag();
    //  ll.head =ll.mergeSort(head);

    //  ll.print();
    //  ll.head=ll.mergeSort(ll.head);
    //  System.out.println(ll);
    //  ll.head=new Node(1);
    //  ll.head.next=new Node(2);
    // ll.print();
    // ll.addFirst(3);
    // ll.addFirst(2);
    
    // ll.print();
    // ll.addFirst(1);
    // ll.addFirst(2);
    // ll.print();
    // ll.addLast(4);
    // ll.print();
    // ll.addLast(5);
    // ll.print();
    // ll.print();
    // ll.add(2, 3);
    // ll.print();
    // System.out.println("Size = "+size);
    // ll.removeFirst();
    // ll.print();
    // System.out.println("Size = "+size);
    //  ll.removeLast();
    // ll.print();
    // System.out.println("Size = "+size);
    // System.out.println(ll.search(3));
    //  ll.addLast(1);
    //  ll.addLast(2);
    //  ll.addLast(1);
    //  ll.addLast(1);
         //  ll.reverse();
    //  ll.print();
    //  ll.deleteNthFromEnd(3);
    //  ll.print();
    //  System.out.println(ll.checkPalind());

    // head =new Node(1);
    // Node temp=new Node(2);
    // head.next=temp;
    // head.next.next=new Node(3);
    // head.next.next.next=temp;   
    // //1->2->3->2
    //   System.out.println(cycle());
    //   removeCycle();
    //   System.out.println(cycle());
    }
}