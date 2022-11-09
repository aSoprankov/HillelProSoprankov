package homework.hw7;

import java.util.Arrays;

public class CollectionServicImpl extends Collection implements ArrayService {

    public CollectionServicImpl(int size) {
        super(size);
    }

    @Override
    public boolean add(int index, String string) {
        if (index < collection.length - 1) {
            collection[index] = string;
            return true;
        }

        String[] tmp = new String[index + 1];
        System.arraycopy(collection, 0, tmp, 0, collection.length);

        collection = Arrays.copyOf(tmp, tmp.length);
        collection[index] = string;
        return true;
    }

    @Override
    public boolean add(String string) {
        int counter = 0;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == null) break;
            counter++;
        }

        if (counter < collection.length) {
            collection[counter] = string;
            return true;
        }

        String[] tmp = new String[collection.length + 1];
        System.arraycopy(collection, 0, tmp, 0, collection.length);

        collection = Arrays.copyOf(tmp, tmp.length);
        collection[collection.length - 1] = string;
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index > collection.length) return false;

        String[] tmp = new String[collection.length - 1];
        System.arraycopy(collection, 0, tmp, 0, index);

        for (int i = index; i < tmp.length; i++) {
            tmp[i] = collection[i + 1];
        }

        collection = Arrays.copyOf(tmp, tmp.length);
        return true;
    }

    @Override
    public boolean delete(String string) {
        String[] tmp = new String[collection.length];
        int tmpCounter = 0;
        int sizeNewArray = 0;
        int checkValue = 0;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i] != string) sizeNewArray++;
            if (collection[i] == string && collection[i].equals(string)) checkValue++;
        }

        if (checkValue == 0) return false;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == null || !collection[i].equals(string)) {
                tmp[tmpCounter] = collection[i];
                tmpCounter++;
            }
        }

        collection = Arrays.copyOf(tmp, sizeNewArray);
        return true;
    }

    @Override
    public String get(int index) {
        if (index > collection.length) return "Exception in thread 'main' java.lang.ArrayIndexOutOfBoundsException";
        return collection[index];
    }
}
