package homework.hw7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CollectionServicImpl csi = new CollectionServicImpl(10);

        boolean addByIndex1 =  csi.add(1, "addByIndex1");
        boolean addByIndex2 =  csi.add(15, "addByIndex2");
        System.out.println("add by index1: " + addByIndex1 + "\nadd by index2: " + addByIndex2 + "\n");

        boolean add1 = csi.add("add1");
        boolean add2 = csi.add("add2");
        System.out.println("add1: " + add1 + "\nadd2: " + add2 + "\n");

        boolean deleteByIndex1 = csi.delete(1);
        boolean deleteByIndex2 = csi.delete(16);
        System.out.println("deleteByIndex1: " + deleteByIndex1 + "\ndeleteByIndex2: " + deleteByIndex2 + "\n");

        boolean deleteValue1 = csi.delete("add1");
        boolean deleteValue2 = csi.delete("No value");
        System.out.println("deleteValue1: " + deleteValue1 + "\ndeleteValue2: " + deleteValue2 + "\n");

        String get1 = csi.get(1);
        String get2 = csi.get(87);
        System.out.println("get1: " + get1 + "\nget2: " + get2);
    }
}
