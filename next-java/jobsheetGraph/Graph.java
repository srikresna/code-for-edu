package jobsheetGraph;

public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        // add edge
        list[source].addFirst(destination);

        // add back edge (for undirected)
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        // degree undirected graph
        System.out.println("degree vertex " + source + " : " + list[source].size());

        // degree directed graph
        // indegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            // outdegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        boolean edgeFound = false;
        for (int i = 0; i < list[source].size(); i++) {
            if (list[source].get(i) == destination) {
                list[source].remove(i);
                // remove back edge (for undirected)
                for (int j = 0; j < list[destination].size(); j++) {
                    if (list[destination].get(j) == source) {
                        list[destination].remove(j);
                        break;
                    }
                }
                edgeFound = true;
                System.out.println("Edge removed between " + source + " and " + destination);
                break;
            }
        }
        if (!edgeFound) {
            System.out.println("Edge between " + source + " and " + destination + " doesn't exist");
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public boolean graphType(boolean graph) {
        return graph;
    }
}
