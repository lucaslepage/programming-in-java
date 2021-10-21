package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 *
 * @param <E>
 */
public interface MyStack<E> {

    void pop();

    /**
     *
     * @param x
     */
    void push(E x);

    /**
     *
     * @return
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     *
     * @return
     */
    int numOfElems();

    /**
     *
     * @return
     */
    E peek();

    /**
     *
     * @param <T>
     * @return
     */
    static <T> MyStack<T> create() {return new MyStackDLLBImpl<T>();}
}