package jobsheetGraph;
import java.util.Scanner;

public class GraphMainGeneric {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();

        GraphGeneric<Integer> graph = new GraphGeneric<Integer>(vertices);
        for (int i = 0; i < vertices; i++) {
            System.out.print("Enter the source: ");
            int source = sc.nextInt();
            System.out.print("Enter the destination: ");
            int destination = sc.nextInt();
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
            graph.addEdge(source, destination, data);
        }

        graph.printGraph();
        System.out.println("Graph type : " + (graph.graphType(true) ? "directed" : "undirected"));
        

    }
}
