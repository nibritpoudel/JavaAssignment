package Week7project;


import java.util.Iterator;
import java.util.LinkedList;

public class Undirected_graph_Nibriti {
	

    private int Vertices; 
    private LinkedList<Integer> jrf[];
 
    
    
    
    public Undirected_graph_Nibriti(int vertices) 
    { 
        Vertices = vertices; 
        jrf = new LinkedList[vertices]; 
        for (int x=0; x<vertices; ++x) 
            jrf[x] = new LinkedList(); 
    } 
    void BFS(int bfs) 
    { 
        boolean visited[] = new boolean[Vertices]; 
  
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
     
        visited[bfs]=true; 
        queue.add(bfs); 
  
        while (queue.size() != 0) 
        { 
            
            bfs = queue.poll(); 
            System.out.print(bfs+" "); 
  
          
            Iterator<Integer> i = jrf[bfs].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
 
    public static void main(String args[])
    {
    	Undirected_graph_Nibriti undirect = new Undirected_graph_Nibriti(4);
 
        undirect.addEdge(0, 1);
        undirect.addEdge(0, 2);
        undirect.addEdge(1, 2);
        undirect.addEdge(2, 0);
        undirect.addEdge(2, 3);
        undirect.addEdge(3, 3);
 
        System.out.println(" The Breadth First Traversal is ");
 
        undirect.BFS(0);
    } 
	    void addEdge(int noOfver,int widthOfUndirectedGraph) 
	    { 
	        jrf[noOfver].add(widthOfUndirectedGraph); 
	    } 
	  
	  
	 
	  
	} 
