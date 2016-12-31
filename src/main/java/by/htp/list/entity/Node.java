package by.htp.list.entity;

/**
 * Created by Ark on 29.12.2016.
 */
public class Node<T> {
    protected T obj;
    protected Node nextNode;

    public Node(T obj, Node nextNode) {
        this.obj = obj;
        this.nextNode = nextNode;
    }

}
