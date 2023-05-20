package jobsheetDLL;

public class HistoryNode {
    String data;
    HistoryNode prev;
    HistoryNode next;

    public HistoryNode(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
