package jobsheetGraph;
import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();
        Graph graph = new Graph(vertices);
        for (int i = 0; i < vertices; i++) {
            System.out.print("Enter the source: ");
            int source = sc.nextInt();
            System.out.print("Enter the destination: ");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
        //check graph type
        System.out.print("Is the graph directed? (true/false) : ");
        boolean directed = sc.nextBoolean();


        graph.printGraph();
        System.out.println("Graph type : " + (graph.graphType(directed) ? "directed" : "undirected"));
    }
}
