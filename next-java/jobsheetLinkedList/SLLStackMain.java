package jobsheetLinkedList;

public class SLLStackMain {
    public static void main(String[] args) {
        SLLStack stack = new SLLStack();
        stack.push("Bahasa");
        stack.push("Android");
        stack.push("Komputer");
        stack.push("Basis Data");
        stack.push("Matematika");
        stack.push("Algoritma");
        stack.push("Statistika");
        stack.push("Multimedia");
        stack.printStack();
        stack.printLinkedList();
        stack.getTop();
    }
}
