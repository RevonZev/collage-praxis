package ramadhana.sapta.senoaji;

import java.util.*;

// Java How to Program 11 Edition
// Fig. 21.11: QueueLL.java
// Queue uses class List.
// Pengubahan dilakukan dengan menggunakan LinkedList dan interface Queue
public class QueueLL<E> {
    private Queue<E> queueList;

    //constructor
    public QueueLL() {
        queueList = new LinkedList<E>();
    }

    // add object to queue
    public void enqueue(E object) {
        queueList.add(object);
    }

    // remove object from queue
    public E dequeue() throws NoSuchElementException {
        return queueList.remove();
    }

    // determine if queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // output queue contents
    public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value + " ");
        }
    }
}
