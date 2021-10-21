package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    @Override
    public void enqueue(E x) {
        elem.addLast();
    }

    @Override
    public E dequeue() {
        elem.removeLast();
    }

    @Override
    public int numOfElems() {
        return element.numofElement();
    }

    @Override
    public E peek() {
        elem.removeFirst();
    }
}
