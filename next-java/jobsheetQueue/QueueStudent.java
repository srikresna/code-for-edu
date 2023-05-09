package jobsheetQueue;

public class QueueStudent {
    int max, front, rear, size;
    Student[] stdQueue;

    public QueueStudent(int n) {
        max = n;
        create();
    }

    public void create() {
        stdQueue = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Student data) {
        if (isFull()) {
            System.out.println("Queue is already full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            stdQueue[rear] = data;
            size++;
        }
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is still empty");
            return null;
        } else {
            Student data = stdQueue[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            System.out.println("Data removed: " + data.nim + " " + data.name + " "
                    + data.classNumber + " " + data.gpa);
            System.out.println();
            return data;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print("The first element : " + stdQueue[front].nim + " "
                    + stdQueue[front].name + " " + stdQueue[front].classNumber + " "
                    + stdQueue[front].gpa);
                System.out.println();
                i = (i + 1) % max;
            }
            System.out.println(stdQueue[i] + " ");
            System.out.println("Element amount : " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.print("The first element : " + stdQueue[front].nim + " "
            + stdQueue[front].name + " " + stdQueue[front].classNumber + " "
            + stdQueue[front].gpa);
            System.out.println();
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("The last element : " + stdQueue[rear].nim + " "
            + stdQueue[rear].name + " " + stdQueue[rear].classNumber + " "
            + stdQueue[rear].gpa);
            System.out.println();
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekPosition(String nim) {
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                if (stdQueue[i].nim.equals(nim)) {
                    System.out.println("The element with nim " + nim + " is in position " + i);
                    System.out.println("The element is " + stdQueue[i].nim + " " + stdQueue[i].name 
                        + " " + stdQueue[i].classNumber + " " + stdQueue[i].gpa);
                    System.out.println("---------------------------------------------");
                    return;
                }
            }
        } else {
            System.out.println("Queue is still empty");
        }
    }
    
    public void printStudent(int position) {
        if (!isEmpty()) {
            if (position < front || position > rear) {
                System.out.println("Position is not found");
            } else {
                System.out.println("The element with position " + position + " is " + stdQueue[position].nim + " " + stdQueue[position].name 
                    + " " + stdQueue[position].classNumber + " " + stdQueue[position].gpa);
                System.out.println("---------------------------------------------");
            }
        } else {
            System.out.println("Queue is still empty");
        }
    }
}
