public class SortZerONeTwosLL {
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
    static Node SortList0s1s2s(Node head){
        // int cnt0=0 , cnt1=0 ;
        // int cnt2 = 0;
        // Node temp = head;
        // while (temp != null) {
        //     if(temp.data == 0){
        //         cnt0++;
        //     }else if(temp.data == 1){
        //         cnt1++;
        //     }else{
        //         cnt2++;
        //     }
        //     temp = temp.next;
        // }
        // temp = head;
        // while (temp != null) {
        //     if(cnt0 != 0){
        //       temp.data = 0;
        //       cnt0--;
        //     }else if(cnt1 != 0){
        //         temp.data = 1;
        //         cnt1--;
        //     }else{
        //         temp.data = 2;
        //         cnt2--;
        //     }
        //     temp  = temp.next;
        // }
        // return head;


        //optimal approach
        Node ZeroHead = new Node(-1);
        Node OneHead = new Node(-1);
        Node TwoHead = new Node(-1);
        Node zero = ZeroHead;
        Node one = OneHead;
        Node two = TwoHead;
        Node temp = head;
        while (temp != null) {
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
       zero.next = (OneHead.next != null) ? OneHead.next: TwoHead.next;
       one.next = TwoHead.next;
       two.next = null;
       Node newHead = ZeroHead.next;
       return newHead;
    }

    static void PrintLL(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,2,0,2,1};
        Node head = ConvertArrtoLL(arr);
        head = SortList0s1s2s(head);
        PrintLL(head);
    }
}
