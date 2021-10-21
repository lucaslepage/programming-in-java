package agh.ii.prinjava.proj1.impl;

/**
 * @param <E>
 */
public class DLinkList<E> {
    private Node<E> head;

    /**
     * @param <T>
     */
    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        /**
         * @param element
         */
        public Node(T element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    /**
     * The point here is to create a new node that we link with the old one
     * @param data
     */
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     * @param element
     * @param <T>
     */
    public <T> void addLast(T element){
        Node s = new Node(element);
        Node p = head;
        if (head==null){
            head=s;
        }
        else{
            while(p.next!=null){
                p=p.next;
            }
            p.next=s;
            s.prev=p;
        }
    }

    /**
     * If the list is empty, we don't touch it at all (return a)
     * @return
     */
    public Node removeFirst(){
        Node a = head;
        if (head.next==null  head==null){
            return a;
        }
        head=head.next;
        a.next.prev=null;
        a.next=null;
        return a;
    }

    /**
     * Again, if the list is empty, nothing happens
     * @return
     */
    public Node removeLast(){
        Node a = head;
        if (head==null  head.next==null)
        return a;
        while (a.next!=null){
            a=a.next;
        }
        a.prev.next=null;
        a.prev=null;
        return a;
    }
    
    /**
     * @return
     * */
    public int numofElement() {
        if (this.head == null) return 0;

        int size = 0;

        for (Node<E> node = head; node != null; node = node.next) {
            size++;
        }

        return size;
    }

    /**
     * @return
     */
    public String toString() {
        Node tmp = head;
        System.out.println("DLinkList{");
        while (tmp != null) {
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
        return ("}");
    }
}
