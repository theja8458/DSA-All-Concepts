public class DLLInsertion {
        static class Node{
            int data;
            Node next;
            Node back;
    
            Node(int data){
                this.data = data;
                this.next = null;
                this.back = null;
            }
        }
        static Node head = null;
        static Node ConvertArrtoDll(int arr[]){
            Node head = new Node(arr[0]);
            Node prev = head;
            for(int i=1 ; i<arr.length ; i++){
                Node temp = new Node(arr[i]);
               prev.next = temp;
               temp.back=prev;
               prev=temp;
            }
            return head;
        }
        static Node AddAtHead(Node head,int val){
            Node newNode = new Node(val);
            // Node temp = head;
            newNode.next=head;
            head.back=newNode;
            // head = newNode;
            return newNode;
        }
        static void PrintDll(Node head){
            while (head != null) {
              System.out.print(head.data+" ");
              head= head.next;
            }
          }

          static Node AddatTail(Node head,int val){
            if(head == null) return AddAtHead(head, val);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node prev = temp.back;
            Node newNode = new Node(val);
            newNode.back = prev;
            newNode.next = temp;
            prev.next = newNode;
            temp.back=newNode;
            return head;
          }
          
          static Node InsertAtKBefore(Node head,int k,int val){
            if(k == 1) return AddAtHead(head, val);
            Node temp = head;
            int cnt=0;
            while (temp != null) {
                cnt++;
                if (cnt == k) {
                    break;
                }
                temp.next = temp;
            }
            Node prev = temp.back;
            Node newNode = new Node(val);
            newNode.next = temp;
            newNode.back = prev;
            prev.next = newNode;
            temp.back=newNode;
            return head;
          }
        public static void main(String args[]){
            int arr[] = {1,2,3,4};
            Node head = ConvertArrtoDll(arr);
            // head = AddAtHead(head, 11);
            head = AddatTail(head, 11);
         PrintDll(head);
        
        
        }
    }

