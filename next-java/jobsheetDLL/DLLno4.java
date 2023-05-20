package jobsheetDLL;

public class DLLno4 {
    Student head, tail;
    HistoryNode historyHead, historyTail;

    public DLLno4() {
        head = null;
        tail = null;
        historyHead = null;
        historyTail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String name, double gpa) {
        Student newStudent = new Student(null, nim, name, gpa, null);
        if (isEmpty()) {
            head = tail = newStudent;
        } else {
            newStudent.next = head;
            head.prev = newStudent;
            head = newStudent;
        }
    }

    public void addLast(String nim, String name, double gpa) {
        Student newStudent = new Student(null, nim, name, gpa, null);
        if (isEmpty()) {
            addFirst(nim, name, gpa);
        } else {
            newStudent.prev = tail;
            tail.next = newStudent;
            tail = newStudent;
        }
    }

    public void addAtIndex(String nim, String name, double gpa, int index) {
        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            addFirst(nim, name, gpa);
            return;
        }

        int count = 0;
        Student current = head;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid index!");
            return;
        }

        Student newStudent = new Student(current, nim, name, gpa, current.next);
        if (current.next != null) {
            current.next.prev = newStudent;
        } else {
            tail = newStudent;
        }
        current.next = newStudent;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("No data to remove!");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("No data to remove!");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("No data to remove!");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        int count = 0;
        Student current = head;
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
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void printData() {
        if (isEmpty()) {
            System.out.println("No data available in the list.");
        } else {
            Student current = head;
            while (current != null) {
                System.out.println("NIM: " + current.nim);
                System.out.println("Name: " + current.name);
                System.out.println("GPA: " + current.gpa);
                System.out.println("-------------------------");
                current = current.next;
            }
            System.out.println("All data printed successfully");
        }
    }

    public Student searchNIM(String nim) {
        if (isEmpty()) {
            return null;
        }

        Student current = head;
        int nodeIndex = 0;
        while (current != null) {
            if (current.nim.equals(nim)) {
                System.out.println("Data " + nim + " is in node - " + nodeIndex);
                return current;
            }
            current = current.next;
            nodeIndex++;
        }

        System.out.println("Data " + nim + " not found!");
        return null;
    }
    public void sortDescendingGPA() {
        if (isEmpty()) {
            System.out.println("No data available in the list.");
            return;
        }
    
        boolean swapped;
    
        do {
            swapped = false;
            Student current = head;
    
            while (current.next != null) {
                if (current.gpa > current.next.gpa) {
                    double tempGPA = current.gpa;
                    String tempNIM = current.nim;
                    String tempName = current.name;
    
                    current.gpa = current.next.gpa;
                    current.nim = current.next.nim;
                    current.name = current.next.name;
    
                    current.next.gpa = tempGPA;
                    current.next.nim = tempNIM;
                    current.next.name = tempName;
    
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
