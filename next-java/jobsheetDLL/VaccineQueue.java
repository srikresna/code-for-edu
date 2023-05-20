package jobsheetDLL;

public class VaccineQueue {
    String queueNumber, name;
    VaccineQueue next, prev;

    public VaccineQueue(String no, String name) {
        this.queueNumber = no;
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}
