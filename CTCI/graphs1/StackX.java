package pg.CTCI.graphs1;

public class StackX {
    private int  arr[];
    private int size;
    
    public StackX(int maxSize) {
        arr = new int[maxSize];
        size = 0;
    }
    
    public int peek() {
        return arr[size];
    }
    
    public void push(int data) {
        arr[size++] = data;
    }
    
    public int pop() {
        return arr[size--];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
}
