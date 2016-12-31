package by.htp.list.entity;

/**
 * Created by Ark on 29.12.2016.
 */
public class MyLinkedList<T> {
    private Node<T> rootNode;
    private Node<T> currentNode;
    private int size;

    public MyLinkedList(){
        rootNode = new Node<T>(null, null);
        size = 0;
    }

    public void add(T obj) {
        Node node = new Node<T>(obj, null);
        if(0 == size++) rootNode.nextNode = node;
        else currentNode.nextNode = node;
        currentNode = node;
    }

    public T get(int i) {
        if(i < 0 | i >= size)
            return null;
        moveTo(i);
        return currentNode.obj;
    }

    public boolean set(T obj, int i) {
        if(i < 0 | i >= size)
            return false;
        moveTo(i);
        currentNode.obj = obj;
        return true;
    }

    public boolean insert(T obj, int i) {
        if(i < 0 | i >= size)
            return false;
        Node<T> newNode = new Node<>(obj, null);
        moveTo(i-1);
        Node<T> temp = currentNode.nextNode;
        currentNode.nextNode = newNode;
        newNode.nextNode = temp;
        ++size;
        return true;
    }

    public boolean remove(int i) {
        if(i < 0 | i >= size)
            return false;
        moveTo(i-1);
        currentNode.nextNode = currentNode.nextNode.nextNode;
        --size;
        return true;
    }

    public int getSize() {
        return size;
    }

    private void moveTo(int i) {
        currentNode = rootNode;
        for(int j = 0; j <= i; ++j)
            currentNode = currentNode.nextNode;
    }

}
