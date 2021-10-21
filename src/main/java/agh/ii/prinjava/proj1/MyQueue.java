package agh.ii.prinjava.proj1;
import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 *
 * @param <E>
 */
public interface MyQueue<E> {

    /**
     *
     * @param x
     */
    void enqueue(E x);
    void dequeue();
    E getFirstElem();
    E peek();
    int numOfElems();

    /**
     *
     * @return
     */
    default boolean isEmpty() {return numOfElems() == 0;}


    /**
     *
     * @param <T>
     * @return
     */
    static <T> MyQueue<T> create() {return new MyQueueDLLBImpl<>();}
}