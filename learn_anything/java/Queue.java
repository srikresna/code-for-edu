package learn_anything.java;

public class Queue {
    Pembeli[] Q;
    Pesanan[] P;
    int max, size, front, rear;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new Pembeli[max];
        P = new Pesanan[max];
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

    public void Enqueue(Pembeli data) {
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


    public Pembeli Dequeue() {
        Pembeli data = new Pembeli(null, null, null);
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


    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            System.out.println("| No Antrian | Nama Pembeli | No Telepon |");
            while (i != rear) {
                System.out.printf("| %-10s | %-12s | %-10s |\n", Q[i].noAntrian, Q[i].namaPembeli, Q[i].noHp);
                if (i == max - 1) {
                    i = 0;
                } else {
                    i++;
                }
            }
            System.out.printf("| %-10s | %-12s | %-10s |\n", Q[i].noAntrian, Q[i].namaPembeli, Q[i].noHp);
            System.out.println("Total Antrian : " + size);
        }
    }

    public void addPesanan(Pesanan data) {
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
            P[rear] = data;
            size++;
        }
    }

    public void printPesanan() {
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            System.out.println("| Kode Pesanan | Nama Pesanan | Harga |");
            while (i != rear) {
                if (P[i] != null) {
                    System.out.printf("| %-12s | %-12s | %-5s |\n", P[i].kodePesanan, P[i].namaPesanan, P[i].harga);
                }
                if (i == max - 1) {
                    i = 0;
                } else {
                    i++;
                }
            }
            if (P[i] != null) {
                System.out.printf("| %-12s | %-12s | %-5s |\n", P[i].kodePesanan, P[i].namaPesanan, P[i].harga);
            }
        }
    }

    public void sort(Pesanan[] data) {
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P.length - 1; j++) {
                if (P[j] != null && P[j + 1] != null) {
                    if (P[j].namaPesanan.compareTo(P[j + 1].namaPesanan) > 0) {
                        Pesanan temp = P[j];
                        P[j] = P[j + 1];
                        P[j + 1] = temp;
                    }
                }
            }
        }
    }

    public int totalPendapatan() {
        int total = 0;
        for (int i = 0; i < P.length; i++) {
            if (P[i] != null) { 
                total += P[i].harga;
            }
        }
        return total;
    }
    
}
