package pg.CTCI.hashtables1;

public class HashChain {
    private HashNode first;
    
    public void insert(int data) {
        HashNode newNode = new HashNode(data);
        
        if (first == null) { //insert at front (unordered)
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }
    
    public void delete(int data) {
        HashNode previous = null;
        HashNode current = first;
        
        while (current != null && data != current.getKey()) {
            previous = current;
            current = current.next;
        }
        
        if (previous == null) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
    }
    
    public void displayList() {
        HashNode current = first;
        
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
}
