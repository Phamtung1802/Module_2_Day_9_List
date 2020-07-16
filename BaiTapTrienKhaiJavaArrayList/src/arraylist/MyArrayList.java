package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyArrayList<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY=10;
    private Object element[];

    public MyArrayList() {
    }

    public MyArrayList(int initialCapacity) {
        if(initialCapacity<0)
            throw new OutOfMemoryError("Error");
        this.element=new Object[initialCapacity];
    }

    public void add(int index, E element){
        ensureCapacity();
        E temp=(E) this.element[index];
        for(int j=this.element.length-1; j>index ;j--){
            E temp2=(E)this.element[j-1];
            this.element[j-1]=this.element[j];
            this.element[j]=temp2;
        }
        this.element[index]=element;
        this.size++;
    }

    public String printElement(int index){
        return element[index].toString();
    }

    public String printAllElement(){
        String arr="";
        for(int i=0;i<this.element.length;i++){
            arr+=" "+this.element[i].toString();
        }
        return arr;
    }

    public int printElementLenght(){
        return this.element.length;
    }

    public void ensureCapacity(){
        Object Copy[]=new Object[this.element.length+1];
        for(int i=0;i<this.element.length;i++){
            Copy[i]=this.element[i];
        }
        this.element=Copy;
    }
}
