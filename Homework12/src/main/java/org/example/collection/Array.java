package org.example.collection;

public class Array {
    private String[] elementData;
    private int size = 0;

    public Array() {
        elementData = new String[10];
    }

    public Array(int capacity) {
        elementData = new String[capacity];
    }

    public String[] getElementData() {
        return elementData;
    }

    public void setElementData(String[] elementData) {
        this.elementData = elementData;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
