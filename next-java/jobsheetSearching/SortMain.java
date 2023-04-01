package jobsheetSearching;

public class SortMain {
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        MergeSorting ms = new MergeSorting();
        System.out.println("Array Before Sorting");
        ms.printArray(data);
        ms.mergeSort(data);
        System.out.println("Array After Sorting");
        ms.printArray(data);
    }
}
