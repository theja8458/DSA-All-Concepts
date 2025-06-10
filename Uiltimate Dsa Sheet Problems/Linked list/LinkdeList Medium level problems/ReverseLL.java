import java.util.*;
public class ReverseLL {
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
    static Node reverseLL(Node head){
        // Stack<Integer> st = new Stack<>();
        // Node temp = head;
        // while (temp != null) {
        //     st.push(temp.data);
        //     temp = temp.next;
        // }
        // temp = head;
        // while (!st.isEmpty()) {
        //     temp.data = st.pop();
        //     temp = temp.next;
        // }
        Node prev = null , temp = head;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    static void PrintLL(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    //recursion reverse LL
    static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5};
        Node head = ConvertArrtoLL(arr);
        // head = reverseLL(head);
        head = reverse(head);
        PrintLL(head);
    }
}
