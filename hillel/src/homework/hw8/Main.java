package homework.hw8;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CollectionImpl ci = new CollectionImpl();

        for (int i = 0; i < ci.getElementData().length; i++) {
            ci.add(String.valueOf(i));
        }

        boolean add = ci.add("i10");
        System.out.println("add 'i10': " + add);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean addByIndex = ci.add(5, "string i5");
        System.out.println("add in [5]: " + addByIndex);

        addByIndex = ci.add(-5, "add");
        System.out.println("add in [-5]: " + addByIndex);

        addByIndex = ci.add(25, "add");
        System.out.println("add in [25]: " + addByIndex);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean delete = ci.delete("7");
        System.out.println("delete '7': " + delete);

        delete = ci.delete("value");
        System.out.println("delete 'value': " + delete);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        String get = ci.get(7);
        System.out.println("get from [7]: " + get);

        get = ci.get(ci.size() - 1);
        System.out.println("get from [size - 1]: " + get);

        get = ci.get(ci.size());
        System.out.println("get from [size]: " + get);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean contain = ci.contain("i5");
        System.out.println("contain 'i5': " + contain);

        contain = ci.contain("value");
        System.out.println("contain 'value': " + contain);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        boolean equals = ci.equals(ci.getElementData());
        System.out.println("equal: " + equals);

        String[] tmpTestArray = Arrays.copyOf(ci.getElementData(), ci.getSize() - 1);

        equals = ci.equals(tmpTestArray);
        System.out.println("equal: " + equals);
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        int size = ci.size();
        System.out.println("size: " + size);

        //boolean clear = ci.clear();
        //System.out.println("clear: " + clear);

        //size = ci.size();
        //System.out.println("size: " + size);
        //System.out.println("- - - - - - - - - - - - - - - - - - -");

        Iterator<String> iterator = ci.iterator();

        while (iterator.hasNext()) {
            String string = iterator.next();

            //if (string.equals("4"))
                //iterator.remove();

            System.out.print(string + " ");
        }

    }
}