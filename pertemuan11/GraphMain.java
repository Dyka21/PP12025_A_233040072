package pertemuan11;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        //latihan 5
        // graph.addVertex('A'); //0
        // graph.addVertex('B'); //1
        // graph.addVertex('C'); //2
        // graph.addVertex('D'); //3
        // graph.addVertex('E'); //4

        // graph.addEdge(0, 1); // 
        // graph.addEdge(1, 2); //
        // graph.addEdge(0, 3); //
        // graph.addEdge(3, 4); //


        //latihan6
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3

        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 2); // A-C
        graph.addEdge(0, 3); // A-D
        graph.addEdge(1, 3); // B-D


         graph.adjacencyMatrix();
         System.out.println();
    }
}
