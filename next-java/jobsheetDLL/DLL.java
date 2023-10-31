public class DLL {
    Film head, tail;
    HistoryNode historyHead, historyTail;

    public DLL() {
        head = null;
        tail = null;
        historyHead = null;
        historyTail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String id, String judul, double rating) {
        Film newFilm = new Film(null, id, judul, rating, null);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
    }

    public void addLast(String id, String judul, double rating) {
        Film newFilm = new Film(null, id, judul, rating, null);
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            newFilm.prev = tail;
            tail.next = newFilm;
            tail = newFilm;
        }
    }

    public void addAtIndex(String id, String judul, double rating, int index) {
        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            addFirst(id, judul, rating);
            return;
        }

        int count = 0;
        Film current = head;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid index!");
            return;
        }

        Film newFilm = new Film(null, id, judul, rating, null);
        newFilm.prev = current;
        newFilm.next = current.next;
        current.next = newFilm;
        newFilm.next.prev = newFilm;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        int count = 0;
        Film current = head;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid index!");
            return;
        }

        if (current == tail) {
            removeLast();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Film current = head;
        while (current != null) {
            System.out.println(current.id + " " + current.judul + " " + current.rating);
            current = current.next;
        }
    }

    public void printByIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        int count = 0;
        Film current = head;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid index!");
            return;
        }
        System.out.println("IDENTITAS FILM");
        System.out.println(current.id + " " + current.judul + " " + current.rating);
    }

    public Film searchID(String id) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }

        Film current = head;
        while (current != null) {
            if (current.id.equals(id)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void sortDescRating() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Film current = head;
        while (current != null) {
            Film max = current;
            Film temp = current.next;
            while (temp != null) {
                if (temp.rating > max.rating) {
                    max = temp;
                }
                temp = temp.next;
            }
            double rating = current.rating;
            current.rating = max.rating;
            max.rating = rating;
            current = current.next;
        }
    }

    public int size() {
        int count = 0;
        Film current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

}