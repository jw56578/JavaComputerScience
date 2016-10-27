package Graph;
 
public class HW7BFS {

    public static void main(String[] args) {

    	Boolean[][] edges = new Boolean[5][5];
    	
    	//do you connect to itself/
    	edges[0][0] = true;
    	//vert 0 is not connected to vert 1
    	edges[0][1] = true;
    	edges[0][2] = true;
    	edges[0][3] = false;
    	edges[0][4] = true;
    	
    	edges[1][0] = false;
    	edges[1][1] = false;
    	edges[1][2] = true;
    	edges[1][3] = false;
    	edges[1][4] = false;
    	
    	
    	edges[2][0] = true;
    	edges[2][1] = false;
    	edges[2][2] = false;
    	edges[2][3] = true;
    	edges[2][4] = false;
    	
    	edges[3][0] = false;
    	edges[3][1] = true;
    	edges[3][2] = false;
    	edges[3][3] = false;
    	edges[3][4] = true;
    	
       	edges[4][0] = true;
    	edges[4][1] = false;
    	edges[4][2] = false;
    	edges[4][3] = false;
    	edges[4][4] = false;
    	
    	Graph g = new Graph(edges);
    	
    	try {
			g.breadthFirstSearch(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	g.printGraph();
    	for(int i = 0; i < g.vertices.length; i ++){
    		System.out.println(g.vertices[i]);
    		
    	}
    	
    }

}
