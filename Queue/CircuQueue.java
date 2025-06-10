import java.util.*;

class CircuQueue {

    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if the queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add an element to the queue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) { // Queue becomes empty
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue newQ = new Queue(3);
        newQ.add(1);
        newQ.add(2);
        newQ.add(3);
        System.out.println(newQ.remove()); // Output: 1
        newQ.add(4);
        System.out.println(newQ.remove()); // Output: 2
        newQ.add(5);

        // Print and remove all elements in the queue
        while (!newQ.isEmpty()) {
            System.out.println(newQ.peek());
            newQ.remove();
        }
    }
}
