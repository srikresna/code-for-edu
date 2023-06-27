
public class DLL {
    Node2P head;

    public DLL() {
        head = null;
    }

    // soal 1
    // method ini menghasilkan sebuah variable array , dimana datanya berasal dari
    // data di dalam objek linkedlist yang sudah ada
    // Tampilan data awal DLL:
    // 10-100-34-20-200-75
    // Tampilan data array hasil dari fungsi toArray():
    // 10, 100, 34, 20, 200, 75,
    int[] toArray() {
        // buat sebuah array dengan ukuran sesuai dengan size dari linkedlist untuk
        // menampung data dari linkedlist
        // definiskan juga pointer tmp untuk menelusuri linkedlist
        int[] arr = new int[size()];
        Node2P tmp = head;
        int i = 0;
        // lakukan perulangan untuk mengambil data dari linkedlist dan memasukkannya ke
        // dalam array, kemudian return array tersebut
        while (tmp != null) {
            arr[i] = tmp.data;
            i++;
            tmp = tmp.next;
        }
        return arr;
    }

    // soal 2
    // method ini digunakan untuk mengembalikan list baru yang mengambil sebagian
    // dari data yang sudah ada di list dari posisi start sampai posisi end
    // Tampilan data dari list hasil dari fungsi sublist(1,3):
    // 100-34-20
    DLL sublist(int start, int end) {
        // buat sebuah objek linkedlist baru untuk menampung data dari linkedlist yang
        // sudah ada
        // definisikan juga pointer tmp untuk menelusuri linkedlist
        DLL list = new DLL();
        Node2P tmp = head;
        int i = 0;
        // lakukan perulangan untuk mengambil data dari linkedlist dan memasukkannya ke
        // dalam list baru, kemudian return list tersebut
        while (tmp != null) {
            // cek apakah posisi saat ini berada di antara start dan end, jika iya maka
            // tambahkan data ke dalam list baru
            if (i >= start && i <= end) {
                list.addLast(tmp.data);
            }
            i++;
            tmp = tmp.next;
        }
        return list;
    }

    // soal 3
    // method ini digunakan untuk menambahkan data yang ada di list ke dalam list
    // yang sudah ada
    // Tampilan data dari list hasil dari fungsi addAll():
    // 10-100-34-20-200-75-212-212-212
    void addAll(DLL list) {
        // definisikan pointer tmp untuk menelusuri linkedlist
        Node2P tmp = list.head;
        // lakukan perulangan untuk mengambil data dari linkedlist dan memasukkannya ke
        // dalam list yang sudah ada
        while (tmp != null) {
            addLast(tmp.data);
            tmp = tmp.next;
        }
    }

    // soal 4
    // method ini akan mengecek apakah semua data yang ada di dalam list, ada di
    // dalam list yang sudah ada
    // Tampilan data dari fungsi containsAll():
    // true
    boolean containsAll(DLL list) {
        // definisikan pointer current untuk menelusuri linkedlist
        Node2P current = list.head;
        // lakukan perulangan untuk mengecek apakah semua data yang ada di dalam list,
        while (current != null) {
            // ketika data yang ada di dalam list tidak ada di dalam list yang sudah ada, maka return false
            if (!contains(current.data)) {
                return false;
            }
            current = current.next;
        }
        // jika semua data yang ada di dalam list ada di dalam list yang sudah ada, maka return true
        return true;
    }

    boolean contains(int data) {
        Node2P tmp = head;
        while (tmp != null) {
            if (tmp.data == data) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    // soal 5
    // method ini akan menghapus data dari dalam list yang sudah ada berdasarkan
    // nilai yang ada di dalam list
    // Tampilan data dari fungsi removeAll():
    // 10-20-200-75
    void removeAll(DLL list) {
        // definisikan pointer tmp untuk menelusuri linkedlist
        Node2P current = head;
        // lakukan perulangan untuk menghapus data dari dalam list yang sudah ada
        while (current != null) {
            Node2P next = current.next;
            // cek apakah data yang ada di dalam list sudah ada di dalam list yang sudah ada
            if (list.contains(current.data)) {
                // jika iya, maka hapus data tersebut
                if (current.prev == null) {
                    deleteFirst();
                } else if (current.next == null) {
                    deleteLast();
                    // jika tidak, maka lanjutkan ke data selanjutnya
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
            current = next;
        }
    }

    int get(int idx) {
        if (idx < 0 || idx >= size()) {
            System.out.println("Idx invalid!");
            return -1;
        } else {
            Node2P tmp = head;
            for (int i = 0; i < idx; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    void deleteByData(int data) {
        Node2P tmp = head;
        while (tmp != null) {
            if (tmp.data == data) {
                if (tmp.prev == null) {
                    deleteFirst();
                } else if (tmp.next == null) {
                    deleteLast();
                } else {
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                }
            }
            tmp = tmp.next;
        }
    }

    boolean isEmpty() {
        return head == null ? true : false;
    }

    int size() {
        int n = 0;
        Node2P tmp = head;
        while (tmp != null) {
            n++;
            tmp = tmp.next;
        }
        return n;
    }

    void addLast(int in) {
        Node2P newNode = new Node2P(in);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node2P tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }
    }

    void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Data kosong! operasi deleteFirst gagal!");
        } else if (size() == 1) {
            head = null;
        } else {
            Node2P del = head;
            head.next.prev = null;
            head = head.next;
            del = null;
        }
    }

    void deleteLast() {
        if (isEmpty()) {
            System.out.println("Data kosong! Operasi deleteLast gagal!");
        } else if (size() == 1) {
            head = null;
        } else {
            Node2P tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.prev.next = null;
            tmp.prev = null;
            tmp = null;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Data kosong! Operasi print gagal");
        } else {
            Node2P tmp = head;
            while (tmp != null) {
                System.out.print("" + tmp.data);
                if (tmp.next != null)
                    System.out.print("-");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }
}
