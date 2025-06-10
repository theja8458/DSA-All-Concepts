import java.util.*;
public class LoopDetect {
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
        static boolean DetectCycle(Node head){
            Node temp = head;
            // HashMap<Node,Integer> hm = new HashMap<>();
            // while (temp != null) {
            //     if(!hm.containsKey(temp)){
            //         hm.put(temp, 1);
            //     }else{
            //         return true;
            //     }
            // }

            Node slow = head;
            Node fast = head;
            while (fast!= null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                // temp = temp.next;
                if(slow == fast) return true;
            }
            return false;
        }

       static Node StartPontOfLL(Node head){
        // HashMap<Node,Integer> hm = new HashMap<>();
        // Node temp = head;
        // while (temp != null) {
        //     if(!hm.containsKey(temp)){
        //         hm.put(temp, 1);
        //     }else{
        //         return temp;
        //     }
        //     temp= temp.next;
        // }

        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
       }

    static int LenOfLoopInLL(Node head){
        // HashMap<Node,Integer> hm = new HashMap<>();
        // Node temp = head;
        // int timer = 1;
        // while (temp != null) {
        //     if(hm.containsKey(temp)){
        //         int val = hm.get(temp);
        //         return timer-val;
        //     }
        //     hm.put(temp, timer);
        //     timer++;
        //     temp = temp.next;
        // }

        Node slow = head;
        Node fast = head;
       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int cnt=1;
                fast = fast.next;
                while (fast != slow) {
                    fast = fast.next;
                    cnt++;
                }
                return cnt;
            }
            
        }
        // if(cnt != 0) return cnt;
        return 0;
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,7,8,9,3};
        // Node head = ConvertArrtoLL(arr);
        Node head = new Node(1);
        Node temp = head;
        temp.next = new Node(2);
        temp.next.next = new Node(3);
        temp.next.next.next = new Node(4);
        temp.next.next.next.next = new Node(5);
        temp.next.next.next.next.next = head.next;
        // System.out.println(DetectCycle(head));
        // System.out.println(StartPontOfLL(head).data);
        System.out.println(LenOfLoopInLL(head));
    }
}
