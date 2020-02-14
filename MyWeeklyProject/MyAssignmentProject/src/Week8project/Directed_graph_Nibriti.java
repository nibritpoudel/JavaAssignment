
package Week8project;

import java.util.LinkedList;

public class Directed_graph_Nibriti {
	 int vertex; 
     LinkedList<Integer> adjacencyListArray[]; 
     

     public static void main(String args[]) 
	    { 
	        int vertex = 5; 
	        Directed_graph_Nibriti graph = new Directed_graph_Nibriti(vertex); 
	        EdgeAdding(graph, 0, 1); 
	        EdgeAdding(graph, 0, 2);
	        EdgeAdding(graph, 1, 2); 
	        EdgeAdding(graph, 1, 3); 
	        EdgeAdding(graph, 2, 3);
	        EdgeAdding(graph, 4, 2);
	        EdgeAdding(graph, 3, 4); 
	        DirectedGraphPrinting(graph); 
	    } 
     
     Directed_graph_Nibriti(int vertex) 
     { 
         this.vertex = vertex; 
         adjacencyListArray = new LinkedList[vertex];
         for(int i = 0; i < vertex ; i++){ 
             adjacencyListArray[i] = new LinkedList<>(); 
         } 
     } 
		    
		 
		 static void DirectedGraphPrinting(Directed_graph_Nibriti DirectedGraph) 
		 {        
		     for(int vertex = 0; vertex < DirectedGraph.vertex; vertex++) 
		     { 
		         System.out.println("Vertex "+ vertex); 
		          
		         for(Integer Values: DirectedGraph.adjacencyListArray[vertex]){ 
		             System.out.print(" --> "+Values); 
		         } 
		         System.out.println("\n"); 
		     } 
		 } 
		 static void EdgeAdding(Directed_graph_Nibriti DirectedGraph, int source, int destination) 
		 { 
		   
		     DirectedGraph.adjacencyListArray[source].add(destination); 
		  
		 } 
 
}
