package jobsheetSorting;

public class HighAchieverStudent {
    Students list[] = new Students[5];
    int idx;

    // add method
    void add(Students std) {
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The student list is already full-filled");
        }
    }
    // print method
    void print() {
        for (Students std : list) {
            std.print();
            System.out.println("==================================");
        }
    }
    // bubble sort method
    void bubbleSort() {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j].gpa > list[j - 1].gpa) {
                    // SWAP
                    Students tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }
    // selection sort method
    void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].gpa < list[idxMin].gpa) {
                    idxMin = j;
                }
            }
            // SWAP
            Students tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }
    /* 
    // insertion sort method
    void insertionSort() {
        for (int i = 1; i < list.length; i++) {
            Students key = list[i];
            int j = i - 1;
            while ((j >= 0) && (list[j].gpa > key.gpa)) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }
    */
    // insertion with ascending or not
    void insertionSort(boolean asc) {
        for (int i = 1; i < list.length; i++) {
            Students temp = list[i];
            int j = i;
            if (asc) {
                while ((j > 0) && (list[j - 1].gpa > temp.gpa)) {
                    list[j] = list[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (list[j - 1].gpa < temp.gpa)) {
                    list[j] = list[j - 1];
                    j--;
                }
            }
            list[j] = temp;
        }
    }

}
