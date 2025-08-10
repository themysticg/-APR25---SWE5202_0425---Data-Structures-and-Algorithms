package Task3;

// AdjacencyMatrixGraph test for SWE5202
public class AdjacencyMatrixGraphTest {
    public static void main(String[] args) {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(4); // Create a graph with 4 nodes (0, 1, 2, 3)
        
        // Add edges as per the diagram: 0-1, 1-2, 0-3
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        
        // Print adjacency matrix to verify connectivity
        graph.printMatrix();
    }
}