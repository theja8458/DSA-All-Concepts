public class AddOneNumToLL {
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
    static Node AddOneNum(Node head){
    //     head = reverse(head);
    //    Node  temp = head;
    //     int carry = 1;
    //     while (temp != null) {
    //         temp.data = carry+temp.data;
    //         if(temp.data < 10){
    //             carry = 0;
    //             break;
    //         }else{
    //             temp.data = 0;
    //             carry = 1;
    //         }
    //         temp = temp.next;
    //     }

    //     if(carry == 1){
    //         Node newNode = new Node(1);
    //         newNode.next = head;
    //         return newNode;
    //     }
    //     head = reverse(head);
    //     return head;
       
        //opttimla
        int carry = helper(head);
        if(carry == 1){
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
      
    }
    static int helper(Node temp){
        if(temp == null) return 1;
        int carry = helper(temp.next);
        temp.data = temp.data+carry;
        if(temp.data < 10){
            return 0 ;
        }
        temp.data = 0;
        return 1;
    }
    static void PrintLL(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
  public static void main(String[] args) {
    int arr[] = {1,5,9};
    Node head = ConvertArrtoLL(arr);
       head = AddOneNum(head);
       PrintLL(head);
  }   
}
