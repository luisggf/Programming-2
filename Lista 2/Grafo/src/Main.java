import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    Graph g1 = new Graph(10);
    g1.addEdgeUnoriented(7, 5, 1);
    g1.addEdgeUnoriented(7, 1, 1);
    g1.addEdgeUnoriented(7, 2, 1);
    g1.addEdgeUnoriented(1, 0, 1);
    g1.addEdgeUnoriented(1, 4, 1);
    g1.addEdgeUnoriented(2, 3, 1);
    g1.addEdgeUnoriented(5, 6, 1);
    g1.addEdgeUnoriented(6, 8, 1);
    System.out.println(g1.bfs(7));
    System.out.println(g1.connected());
    Graph g2 = new Graph("graph1.txt");
    System.out.println(g2);
    
    // Graph g1 = new Graph(4);
    // g1.addEdge(0, 1, 1);
    // g1.addEdge(1, 0, 1);
    // g1.addEdge(0, 3, 1);
    // g1.addEdge(3, 0, 1);
    // System.out.println("=== g1 ===");
    // System.out.println(g1);
    // System.out.println("degree(0): " + g1.degree(0)); // 2
    // System.out.println("degree(1): " + g1.degree(1)); // 1
    // System.out.println("degree(2): " + g1.degree(2)); // 0
    // System.out.println("degree(3): " + g1.degree(3)); // 1
    // System.out.println("highestDegree: " + g1.highestDegree()); // 2
    // System.out.println("lowestDegree: " + g1.lowestDegree()); // 0
    // System.out.println("density: " + g1.density());
    // System.out.println("\n=== g1 complement ===");
    // System.out.println(g1.complement());
    // Graph g2 = new Graph(3);
    // g2.addEdge(0, 1, 1);
    // g2.addEdge(1, 0, 1);
    // System.out.println("g2 is subGraph? " + g1.subGraph(g2)); // true
    // Graph g3 = new Graph(4);
    // g3.addEdge(1, 3, 1);
    // g3.addEdge(3, 1, 1);
    // System.out.println("g3 is subGraph? " + g1.subGraph(g3)); // false

  }
}