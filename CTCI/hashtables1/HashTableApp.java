package pg.CTCI.hashtables1;

import java.util.Random;

public class HashTableApp {

    public static void main(String[] args) {
        
        int maxSize = 20;
        HashTable ht = new HashTable(maxSize);
        
        Random rand = new Random();
        
        for (int i = 0; i < 5000; i++) {
            int ran = rand.nextInt(10000);
            ht.insert(ran);
        }
        
        ht.displayTable();
    }
}
