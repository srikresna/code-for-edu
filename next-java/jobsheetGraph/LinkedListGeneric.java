package jobsheetGraph;

public class LinkedListGeneric<T> {
    NodeGeneric head;
    int size;


    public LinkedListGeneric() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T item) {
        if (isEmpty()) {
            head = new NodeGeneric(null, item, null);
        } else {
            NodeGeneric newNode = new NodeGeneric(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeGeneric current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeGeneric newNode = new NodeGeneric(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(T item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Index out of bound");
        } else {
            NodeGeneric current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                NodeGeneric newNode = new NodeGeneric(current.prev, item, current);
                current.prev = newNode;
                head = newNode;

            } else {
                NodeGeneric newNode = new NodeGeneric(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeGeneric tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\n Succesfully added");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    // 2nd lab activity
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty, cannot remove");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty, cannot remove");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeGeneric current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value is out of bound");
        } else if (size == 0) {
            removeFirst();
        } else {
            NodeGeneric current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    // 3rd lab activity
    public T getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return (T) head.data;
    }

    public T getLast(int index) throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        NodeGeneric tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (T) tmp.data;
    }

    public T get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception ("Linked list still empty");
        }
        NodeGeneric tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (T) tmp.data;
    }
}
