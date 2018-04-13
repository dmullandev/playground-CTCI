package pg.CTCI.graphs1;

public class Graph {
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private final int MAX_VERTS = 20;
    private StackX st;
    private QueueX theQueue;
    
    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        st = new StackX(MAX_VERTS);
        theQueue = new QueueX(MAX_VERTS);
        
        for (int k = 0; k < MAX_VERTS; k++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[k][j] = 0;
            }
        }
    }
    
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }
    
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    public void displayVertex(int v) {
        System.out.println("Vertex: " + vertexList[v].label);
    }
    
    public void dfs() {
        vertexList[0].wasVisited = true;
        st.push(0);
        
        while (!st.isEmpty()) {
            int n = getAdjacentUnvisitedVertex( st.peek() );
            
            if (n == -1) {
                st.pop();
            } else {
                vertexList[n].wasVisited = true;
                displayVertex(n);
                st.push(n);
            }
        }
        
        for (int k = 0; k < nVerts; k++) {
            vertexList[k].wasVisited = false;
        }
    }
    
    public void bfs() {
        vertexList[0].wasVisited = true;
        theQueue.enqueue(0);
        
        while ( !theQueue.isEmpty() ) {
            int n = getAdjacentUnvisitedVertex( theQueue.peek() );
            
            if ( n == -1) {
                theQueue.dequeue();
            } else {
                vertexList[n].wasVisited = true;
                displayVertex(n);
                theQueue.enqueue(n);
            }
        }
        
        for (int k = 0; k < nVerts; k++) {
            vertexList[k].wasVisited = false;
        }
    }
    
    public int getAdjacentUnvisitedVertex(int v) {
        for (int k = 0; k < nVerts; k++) {
            if (adjMat[v][k] == 1 && vertexList[k].wasVisited == false) {
                return k;
            }
        }
        return -1;
    }
}
