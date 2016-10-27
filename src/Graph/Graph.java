package Graph;

import java.util.LinkedList;

public class Graph {

	int n;
	Boolean[][] edges;
	Vertex[] vertices;
	public Graph(Boolean[][] edges){
		this.edges = edges;
		this.n = edges.length;
		
		vertices = new Vertex[edges.length];
		for(int i = 0; i < vertices.length; i ++){
			vertices[i] = new Vertex(i);
		}
		
	}
	public int getN(){
		return n;
	}
	public Vertex getVertex(int v){
		return vertices[v];
	}
	public void printGraph()
	{
		for(int i = 0; i < edges.length; i++)
		{
			String row = "";
			for(int j = 0; j < edges.length; j++)
			{
				row += " " + edges[i][j];
			}
			System.out.println(row);
		}
		
	}
	public void breadthFirstSearch(int sourceLabel) throws Exception
	{
		Vertex s = getVertex(sourceLabel);
		/*this is already done in the constructor of the Vertex
		for(int i = 0; i < vertices.length;i ++){
			if(i != sourceLabel){
				vertices[i].setColor(0);
				vertices[i].setDistance(Integer.MAX_VALUE);
				vertices[i].setParent(null);
			}
		}*/
		
		s.setColor(1);
		s.setDistance(0);
		s.setParent(null);
		
		LinkedList<Vertex> q = new LinkedList<Vertex>();
		q.offer(s);
		
		while(q.peek() != null)
		{
			Vertex u = q.poll();
			u.setColor(2);
			
			for(int i = 0; i < edges[u.getLabel()].length; i++)
			{
				if(edges[u.getLabel()][i])
				{
					Vertex v = getVertex(i);
					if(v.getColor() == 0){
						v.setColor(1);
						v.setDistance(u.getDistance() + 1);
						v.setParent(u);
						q.offer(v);
					}
				}
			}
			
		}
		
	}
}
