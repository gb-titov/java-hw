package S4;

import java.util.LinkedList;

public class Ex2<T> {
    private LinkedList<T> list;
    
    public Ex2() {
        list = new LinkedList<T>();
    }

    public void enqueue(T item){
        list.addLast(item);
    }

    public T first(){
        if(list.size() == 0)
            return null;
        return list.getFirst();
    }

    public T dequeue(){
        if(list.size() == 0)
            return null;
        return list.removeFirst();
    }

    public void printQueueToConsole(){
        System.out.println(list);
    }
}
