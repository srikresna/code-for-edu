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
        front = rear = -1;
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
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("The last element : " + stdQueue[rear].nim + " "
            + stdQueue[rear].name + " " + stdQueue[rear].classNumber + " "
            + stdQueue[rear].gpa);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekPosition(String nim) {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                if (nim.equalsIgnoreCase(stdQueue[i].nim)) {
                    System.out.println("The element with with nim " + nim + " is in position " + i);
                    System.out.println("The student data is " + stdQueue[i].nim + " " + stdQueue[i].name 
                    + " " + stdQueue[i].classNumber + " " + stdQueue[i].gpa);
                    System.out.println("---------------------------------------------");
                }
                i = (i + 1) % max;
            }

        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void printStudent(int position) {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                if (position == i) {
                    System.out.println("The element in position " + position + " is " + stdQueue[i].nim + " " + stdQueue[i].name 
                    + " " + stdQueue[i].classNumber + " " + stdQueue[i].gpa);
                    System.out.println("---------------------------------------------");
                }
                i = (i + 1) % max;
            }

        } else {
            System.out.println("Queue is still empty");
        }
    }


}
