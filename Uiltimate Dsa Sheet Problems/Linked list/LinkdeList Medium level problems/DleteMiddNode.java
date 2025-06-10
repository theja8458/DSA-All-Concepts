public class DleteMiddNode {
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
    static Node DeleteMidNode(Node head){
        // Node temp = head;
        // int cnt = 0;
        // while (temp != null) {
        //     cnt++;
        //     temp = temp.next;
        // }
        // int reach = cnt/2;
        // temp = head;
        // while (temp != null) {
        //     reach--;
        //     if(reach == 0) break;
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;

        // optimal 

        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }
    static void PrintLL(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = ConvertArrtoLL(arr);
         DeleteMidNode(head);
        PrintLL(head);
    }
}
