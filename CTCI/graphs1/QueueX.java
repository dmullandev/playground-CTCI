package pg.CTCI.graphs1;

public class QueueX {
    private int  arr[];
    private int size;
    private int front;
    private int rear;
    
    public QueueX(int maxSize) {
        arr = new int[maxSize];
        size = 0;
        front = 0;
        rear = 0;
    }
    
    public void enqueue(int data) {
        arr[rear++] = data;
        size++;
    }
    
    public int dequeue() {
        size--;
        return arr[front++];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int peek() {
        return arr[front];
    }
}
