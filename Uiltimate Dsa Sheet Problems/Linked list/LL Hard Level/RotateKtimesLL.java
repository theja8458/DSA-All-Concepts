public class RotateKtimesLL {
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
     static Node findkthNode(Node temp , int k){
        int cnt=1;
        while (temp != null) {
            if (cnt == k) {
                return temp;
            }
            cnt++;
            temp = temp.next;
        }
        return temp;
     }
    static Node RotateLL(Node head,int k){
        int len=1;
        Node tail = head;
        while (tail.next != null) {
           tail = tail.next;
           len++;
        }
        if(k % len == 0) return head;
        k = k%len;
        tail.next = head;
        Node newLastNode = findkthNode(head , len-k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = ConvertArrtoLL(arr);
        head = RotateLL(head, 2);
        PrintLL(head);
    }
}
