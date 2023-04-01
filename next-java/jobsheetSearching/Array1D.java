package jobsheetSearching;

public class Array1D {
    int[] data = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90 };

    public void printArray() {
        System.out.println("Data Array 1D");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%2d  ", data[i]);
        }
    }
    public int usingSequentialSearch(int search) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == search) {
                return i;
            }
        }
        return -1;
    }
    public int insertionSort() {
        int temp;
        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        return -1;
    }
    public int insertionSort(boolean descending) {
        int temp;
        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] < temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        return -1;
    }
    public int[] getBiggestValue() {
        int[] position = new int[2];
        int biggest = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > biggest) {
                biggest = data[i];
                position[0] = i;
                position[1] = data[i];
            }
        }
        return position;
    }
}
