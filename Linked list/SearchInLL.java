public class SearchInLL {
     static  class Node{
        int data;
        Node next;

         Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        public static Node head;
        public static Node tail;

        public void addFirst(int data){
            Node newNode=new Node(data);
           if(head == null){
            head=tail=newNode;;
            return;
           }

            newNode.next=head;
            head=newNode;
        }
        // public  int search(int key){
            
        //     Node temp=head;
        //     int i=0;
        //     while(temp != null){
        //         if(temp.data == key){
        //             return i;
        //         }
        //         temp=temp.next;
        //         i++;
        //     }
        //     return -1;
        // }
        // public void print(){
        //     Node temp=head;
        //     while(temp != null){
        //         System.out.print(temp.data);
        //         temp=temp.next;
        //     }
        //     System.out.println();
        // }


        private int healper(Node head, int key){
            if(head == null){
                return -1;
            }
            if(head.date == key){
                return 0;
            }
            int idx=healper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
        }

        public int recSearch(int key){
            return healper(head, key);
        }
         public static void main(String args[]){
            SearchInLL search=new SearchInLL();
            search.addFirst(1);
            search.addFirst(2);
            search.addFirst(3);
            search.addFirst(4);
            search.addFirst(5);
            System.out.println(search.recSearch(4));
            // search.print();
         }
}
