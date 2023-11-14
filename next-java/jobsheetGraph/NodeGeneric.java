package jobsheetGraph;

public class NodeGeneric<T> {
    T data;
    NodeGeneric<T> prev, next;

    public NodeGeneric(NodeGeneric<T> prev, T data, NodeGeneric<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

}
