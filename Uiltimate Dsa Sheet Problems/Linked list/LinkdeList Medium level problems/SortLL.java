public class SortLL {
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
    static Node getMide(Node head){
        if(head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node merge(Node list1 , Node list2){
        Node dumm = new Node(-1);
        Node temp = dumm;
        while (list1 != null && list2 !=null) {
            if(list1.data < list2.data){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
       if(list1 == null) temp.next = list2;
       else temp.next = list1; 
        return dumm.next;
    }
    static Node sort(Node head){
        if(head == null || head.next == null) return head;
        Node middle = getMide(head);
        Node LeftHead = head;
        Node rightHead = middle.next;
        middle.next = null;
        LeftHead = sort(LeftHead);
        rightHead = sort(rightHead);

        return merge(LeftHead,rightHead);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,1};
        Node head = ConvertArrtoLL(arr);
        head = sort(head);
        PrintLL(head);
    }
}
