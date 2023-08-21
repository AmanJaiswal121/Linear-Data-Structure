package QueueDS;

public class CircularQueue {

    int[] queue;// int queue[];
    int front, rear;
    int capacity;

    CircularQueue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        capacity = size;

    }

    void enqueue(int value) {
        if (front == 0 && rear == capacity - 1) {
            System.out.println("Queue Overflow :");
        } else {
            if (front == -1) {
                front = 0;
            }
            // Change from normal Queue
            // That is the formula :
            rear = (rear + 1) % capacity;
            queue[rear] = value;
        }
    }

    void disp() {
        // Change from normal Queue
        int i;
        for (i = front; i != rear; i = (i + 1) % capacity) {
            System.out.print(queue[i] + "\t");
        }
        System.out.print(queue[i] + "\t");
        System.out.println();
    }

    int dequeue() {
        int value;
        if (front == -1) {
            System.out.println("Queue is empty :");
            return -1;
        } else {
            value = queue[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                // Change from normal Queue
                // That is the formula :
                front = (front + 1) % capacity;

            }
        }
        return value;
    }

    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);
        c.enqueue(40);
        c.enqueue(50);
        c.disp();
        System.out.println();
        System.out.println("Dequeue Element :" + c.dequeue());
        c.disp();
        System.out.println();
        System.out.println("Dequeue Element :" + c.dequeue());
        c.disp();
        System.out.println();
        System.out.println("Inserting new value :");
        System.out.println("After Removing value other inserted value :");
        c.enqueue(60);
        c.disp();
        System.out.println();
        System.out.println("Inserting another new value :");
        c.enqueue(70);
        c.disp();
    }

}
