package pg.CTCI.hashtables1;

public class HashTable {
    private HashChain[] hTable;
    private int arraySize;
    int size = 0;
    
    public HashTable(int maxSize) {
        arraySize = maxSize;
        hTable = new HashChain[arraySize];
        
        for (int j = 0; j < arraySize; j++) {
            hTable[j] = new HashChain();
        }
    }
    
    public int hashFunc(int key) {
        return key % arraySize;
    }
    
    public void insert(int data) {
        int hashVal = hashFunc(data);
        hTable[hashVal].insert(data);
        size++;
    }
    
    public void delete(int data) {
        int hashVal = hashFunc(data);
        hTable[hashVal].delete(data);
        size--;
    }
    
    public void displayTable() {
        for (int j = 0; j < arraySize; j++) {
            System.out.print(j + ".  ");
            System.out.println("List of Nodes (front-->back)");
            hTable[j].displayList();
        }
    }
}
