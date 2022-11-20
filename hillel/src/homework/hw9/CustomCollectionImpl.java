package homework.hw9;

import java.util.Iterator;
import java.util.function.Consumer;

public class CustomCollectionImpl extends LList implements CustomCollection {
    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Object[] array) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean trim() {
        return false;
    }
}
