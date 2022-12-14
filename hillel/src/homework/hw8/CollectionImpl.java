package homework.hw8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionImpl extends Array implements Collection, Iterable {
    public CollectionImpl(int capasity) {
        super(capasity);
    }

    public CollectionImpl() {
        super(10);
    }

    @Override
    public boolean add(String string) {
        switch ((getElementData().length > getSize()) ? 0 : 1) {
            case 0 -> {
                getElementData()[getSize()] = string;
                setSize(getSize() + 1);
            }
            case 1 -> {
                String[] tmpArray = new String[(getElementData().length * 3) / 2 + 1];
                System.arraycopy(getElementData(), 0, tmpArray, 0, getElementData().length);
                tmpArray[getSize()] = string;
                setSize(getSize() + 1);
                setElementData(Arrays.copyOf(tmpArray, getSize()));
            }
        }
        return true;
    }

    @Override
    public boolean add(int index, String string) {
        if (index < 0 || index >= getSize()) return false;

        String[] tmpElementData = new String[(getElementData().length * 3) / 2 + 1];
        System.arraycopy(getElementData(), 0, tmpElementData, 0, getElementData().length);
        System.arraycopy(tmpElementData, index, tmpElementData, index + 1, getElementData().length - index);
        tmpElementData[index] = string;
        setSize(getSize() + 1);
        setElementData(Arrays.copyOf(tmpElementData, getSize()));
        return true;
    }

    @Override
    public boolean delete(String string) {
        boolean result = false;
        for (int i = 0; i < getSize(); i++) {
            if (getElementData()[i].equals(string)) {
                System.arraycopy(getElementData(), i + 1, getElementData(), i, getSize() - i - 1);
                result = true;
            }
        }
        if (!result) return false;

        setSize(getSize() - 1);
        setElementData(Arrays.copyOf(getElementData(), getSize()));
        return true;
    }

    @Override
    public String get(int index) {
        if (index >= getSize() || index < 0) return "Exeption";
        return getElementData()[index];
    }

    @Override
    public boolean contain(String string) {
        String tmpString = "";

        for (int i = 0; i < getSize(); i++) {
            tmpString += getElementData()[i] + " ";
        }

        String[] strings = tmpString.split(" ");

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(String[] array) {
        if (getElementData().length != array.length) return false;

        for (int i = 0; i < getSize(); i++) {
            if (getElementData()[i] != array[i]) return false;
        }
        return true;
    }

    @Override
    public boolean clear() {
        setSize(0);
        setElementData(new String[getSize()]);
        return true;
    }

    @Override
    public int size() {
        return getSize();
    }


    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < getSize() && getElementData()[currentIndex] != null;
            }

            @Override
            public String next() {
                return getElementData()[currentIndex++];
            }

            @Override
            public void remove() {
                delete(next());
            }


        };
        return iterator;
    }
}
