import java.util.*;
public class PalindromeLL {
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
            // temp.next = prev;
            Node front = temp.next;
            temp.next = prev;
            prev = temp;       // ✅ Corrected this line
            temp = front;

        }
        return prev;
    }
    static boolean CheckPalindLL(Node head){
    //   Stack<Integer> st = new Stack<>();
    //   Node temp = head;
    //   while (temp != null) {
    //     st.push(temp.data);
    //     temp = temp.next;
    //   }
    //   temp = head;
    //   while (!st.isEmpty()) {
    //       if(temp.data != st.peek()) return false;
    //       st.pop();
    //       temp = temp.next;
    //   }
      Node slow  = head;
      Node fast = head;
      while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      Node newHead = reverse(slow.next);
      Node first = head;
      Node second = newHead;
      while (second != null) {
        if(first.data != second.data){
            reverse(newHead);
            return false;
        }
        first = first.next;
        second = second.next;
      }
      reverse(newHead);
    return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        Node head = ConvertArrtoLL(arr);
        System.out.println(CheckPalindLL(head));

    }
}
