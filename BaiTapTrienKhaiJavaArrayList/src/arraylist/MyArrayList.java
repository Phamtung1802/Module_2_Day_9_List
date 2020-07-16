package arraylist;

import java.util.ArrayList;

public class MyArrayList<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY=10;
    Object element[];

    public MyArrayList() {
    }

    public MyArrayList(int initialCapacity) {
        if(initialCapacity<0)
            throw new OutOfMemoryError("Error");
        this.size = initialCapacity;
    }
    public void add(int index, E element){
        
    }
}
