public class RmoveNthNodeFromEnd {
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
    static Node removeNthNodeFormEnd(Node head,int n){
        // int cnt=0;
        // Node temp = head;
        // while (temp != null) {
        //     cnt++;
        //     temp = temp.next;
        // }
        // if(cnt == n) return head.next;
        // int reach = cnt-n;
        // temp = head;
        // while (temp != null) {
        //     reach--;
        //     if (reach == 0) {
        //         break;
        //     }
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;

        //optimal
        Node fast = head;
        for(int i=0 ; i<n ; i++){
            fast = fast.next;
        }
        Node slow = head;
        if(fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
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
        head = removeNthNodeFormEnd(head, 2);
        PrintLL(head);

    }
}
