class ReverseKsizeOfLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static Node ConvertArrtoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node  mover = head;
        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }
    static void PrintLL(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static Node getKthNode(Node temp,int k){
        k -=1;
        while (temp != null && k>0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    static Node reverse(Node head){
         Node temp = head;
         Node prev = null;
         while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
         }
         return prev;
    }

    static Node RevNodesInKGroup(Node head,int k){
     Node temp = head;
     Node prevLast = null;
     while (temp != null) {
       Node kthNode = getKthNode(temp,k);
       if(kthNode == null){
        if(prevLast != null) prevLast.next = temp;
        break;
       }

       Node nextNode = kthNode.next;
       kthNode.next = null;
        reverse(temp);
        if(temp == head){
            head = kthNode;
        }else{
            prevLast.next = kthNode;
        }
        prevLast = temp;
        temp = nextNode;
     }
     return head;
    }

    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    Node head = ConvertArrtoLL(arr);
    head = RevNodesInKGroup(head, 3);
    PrintLL(head);
    }
}