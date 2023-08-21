package QueueDS;

public class QueueDS {
	int[] queue;// int queue[];
	int front, rear;
	int capacity;

	QueueDS(int size) {
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
			rear++;
			queue[rear] = value;
		}
	}

	void disp() {
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + "\t");
		}
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
				front++;
			}
		}
		return value;
	}

	public static void main(String[] args) {

		QueueDS q1 = new QueueDS(5);
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.disp();
		System.out.println("Dequeue Element :" + q1.dequeue());
		q1.disp();
		System.out.println("Dequeue Element :" + q1.dequeue());
		q1.disp();
	}

}