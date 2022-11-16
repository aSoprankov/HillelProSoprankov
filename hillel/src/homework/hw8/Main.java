package homework.hw8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CollectionImpl csi = new CollectionImpl();

        for (int i = 0; i < csi.getElementData().length; i++) {
            csi.add(String.valueOf(i));
        }

        boolean add = csi.add("i10");
        System.out.println("add 'i10': " + add);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean addByIndex = csi.add(5, "string i5");
        System.out.println("add in [5]: " + addByIndex);

        addByIndex = csi.add(-5, "add");
        System.out.println("add in [-5]: " + addByIndex);

        addByIndex = csi.add(25, "add");
        System.out.println("add in [25]: " + addByIndex);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean delete = csi.delete("7");
        System.out.println("delete '7': " + delete);

        delete = csi.delete("value");
        System.out.println("delete 'value': " + delete);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        String get = csi.get(7);
        System.out.println("get from [7]: " + get);

        get = csi.get(csi.size() - 1);
        System.out.println("get from [size - 1]: " + get);

        get = csi.get(csi.size());
        System.out.println("get from [size]: " + get);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean contain = csi.contain("i5");
        System.out.println("contain 'i5': " + contain);

        contain = csi.contain("value");
        System.out.println("contain 'value': " + contain);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean equals = csi.equals(csi.getElementData());
        System.out.println("equal: " + equals);

        String[] tmpTestArray = Arrays.copyOf(csi.getElementData(), csi.getSize() - 1);

        equals = csi.equals(tmpTestArray);
        System.out.println("equal: " + equals);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        int size = csi.size();
        System.out.println("size: " + size);

        boolean clear = csi.clear();
        System.out.println("clear: " + clear);

        size = csi.size();
        System.out.println("size: " + size);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
    }
}