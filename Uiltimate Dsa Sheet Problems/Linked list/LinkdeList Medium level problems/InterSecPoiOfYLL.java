import java.util.*;
public class InterSecPoiOfYLL {
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
    static Node IntersectionOfLL(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        HashMap<Node,Integer> hm = new HashMap<>();
        while (temp1 != null) {
            hm.put(temp1, 1);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            if(hm.containsKey(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }
        return temp2;
    }
    public static void main(String[] args) {
        int arr1[] = {3,1,4,6,2};
        int arr2[] = {1,2,4,5,4,6,2};
        Node head1 = ConvertArrtoLL(arr1);
        Node head2 = ConvertArrtoLL(arr2);
        System.out.println(IntersectionOfLL(head1, head2));
    }
}
