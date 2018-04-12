package pg.CTCI.hashtables1;

public class HashNode {
    private int dData;
    public HashNode next;
    public HashNode(int data) {
        this.dData = data;
    }
    
    public int getKey() {
        return dData;
    }
    
    public void displayNode() {
        System.out.println("     Node: " + dData);
    }
}
