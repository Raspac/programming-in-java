package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * This interface is meant to allow us to create a Queue, a data structure where the
 * elements are added or removed at the beginning of the list
 */
public interface MyQueue<E> {

    /**
     * This function is meant to add an element at the beginning of the Queue
     */
    void enqueue(E x);


    /**
     * This function is meant to remove an element at the beginning of the Queue
     */
    E dequeue();


    /**
     * This function is used to verify if the Queue is empty or not
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }


    /**
     * This function is used to get the number of elements in a queue
     */
    int numOfElems();


    /**
     * This function is used to look at the elements of a queue
     */
    E peek();


    /**
     * Pros:
     * -The factory methods offer more flexibility as they allow
     */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
