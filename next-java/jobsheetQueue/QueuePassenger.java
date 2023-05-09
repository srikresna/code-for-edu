package jobsheetQueue;

public class QueuePassenger {
    public int max;
    public int size;
    public int front;
    public int rear;
    public Passengers[] Q;
    public Object p;

    public QueuePassenger(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new Passengers[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("The first element : " + Q[front].name + " "
            + Q[front].cityOrigin + " " + Q[front].cityDestination + " "
            + Q[front].ticketAmount + " " + Q[front].price);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print("The first element : " + Q[front].name + " "
                + Q[front].cityOrigin + " " + Q[front].cityDestination + " "
                + Q[front].ticketAmount + " " + Q[front].price);
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Element amount : " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared successfully");
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void Enqueue (Passengers data) {
        if (IsFull()) {
            System.out.println("Queue is already full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    //modifying Dequeue method
    public Passengers Dequeue() {
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
            return null;
        } else {
            Passengers data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            System.out.println("Data removed: " + data.name + " " + data.cityOrigin + " " +
                    data.cityDestination + " " + data.ticketAmount + " " + data.price);
            return data;
        }
    }
    
    //peekRear method
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("The last element: " + Q[rear].name + " " +
                    Q[rear].cityOrigin + " " + Q[rear].cityDestination + " " +
                    Q[rear].ticketAmount + " " + Q[rear].price);
        } else {
            System.out.println("Queue is still empty");
        }
    }
    

    /*
    public Passengers Dequeue() {
        Passengers data = new Passengers("", "", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    */
}
