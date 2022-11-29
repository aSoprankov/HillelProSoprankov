package org.example.collection;

import java.util.Arrays;
import java.util.Objects;

public class CollectionImpl extends Array implements Collection {
    public CollectionImpl(int capasity) {
        super(capasity);
    }

    public CollectionImpl() {
        super(0);
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
        StringBuilder tmpString = new StringBuilder();

        for (int i = 0; i < getSize(); i++) {
            tmpString.append(getElementData()[i]).append(" ");
        }

        String[] strings = tmpString.toString().split(" ");

        for (String s : strings) {
            if (s.equals(string)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(String[] array) {
        if (getElementData().length != array.length) return false;

        for (int i = 0; i < getSize(); i++) {
            if (!Objects.equals(getElementData()[i], array[i])) return false;
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
}
