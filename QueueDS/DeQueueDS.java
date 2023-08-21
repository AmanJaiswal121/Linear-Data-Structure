package QueueDS;

public class DeQueueDS {
    int[] queue;
    int capacity;
    int front, rear;

    public DeQueueDS(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    boolean isFull() {
        return front == 0 && rear == capacity - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    int getFront() {
        if (isEmpty()) {
            return -1;
        } else {
            return queue[front];
        }
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            return -1;
        } else {
            return queue[rear];
        }
    }

    void insertRear(int element) {
        if (isFull()) {
            front = 0;
            rear = 0;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {

            rear = rear + 1;

        }
        queue[rear] = element;

    }

    void insertFront(int element) {
        if (isFull()) {

        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front = front - 1;
        }
        queue[front] = element;
    }

    void deleteFront() {
        if (isEmpty()) {

        } else {
            if (front == rear) {
                front = -1;
                rear = -1;

            } else if (front == capacity - 1) {
                front = 0;
            } else {
                front = front + 1;
            }

        }
    }

    void deleteRear() {
        if (isEmpty()) {

        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                rear = rear - 1;
            }
        }
    }

    public static void main(String[] args) {
        DeQueueDS d = new DeQueueDS(5);
        d.insertRear(10);
        d.insertRear(20);
        d.insertRear(30);
        System.out.println("Get Front " + d.getFront());
        System.out.println("Get Rear " + d.getRear());
        System.out.println();
        d.insertFront(40);
        System.out.println("Get Front " + d.getFront());
        System.out.println("Get Rear " + d.getRear());
        System.out.println();
        d.deleteFront();
        System.out.println("Get Front " + d.getFront());
        System.out.println("Get Rear " + d.getRear());
        System.out.println();
        d.deleteRear();
        System.out.println("Get Front " + d.getFront());
        System.out.println("Get Rear " + d.getRear());
    }

}
