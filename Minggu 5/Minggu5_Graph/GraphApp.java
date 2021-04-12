package Minggu5_Graph;
/**
 *
 * @author naufal
 */
public class GraphApp {
    
    public static void main(String[] args) {
        
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4
        
        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(2, 3); //AD
        theGraph.addEdge(3, 4); //DE
        
        theGraph.addEdge(0, 1);//AB
        theGraph.addEdge(1, 2);//BC
        theGraph.addEdge(2, 3);//AD
        theGraph.addEdge(3, 4);//DE
        
     
      theGraph.display();
      
      theGraph.bfs();
      System.out.println();     
      
      theGraph.depthFirstSearch();
      System.out.println();
    }
    
}
