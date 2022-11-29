package org.example.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CollectionTest {

    @Test
    void add() {
        CollectionImpl ci = new CollectionImpl();

        Assertions.assertTrue(ci.add("val-1"));
        Assertions.assertEquals(1, ci.size());
        Assertions.assertEquals("val-1", ci.get(0));

        Assertions.assertTrue(ci.add(null));
        Assertions.assertEquals(2, ci.size());
        Assertions.assertNull(ci.get(1));

        Assertions.assertTrue(ci.add(1, "val-2"));
        Assertions.assertEquals(3, ci.size());
        Assertions.assertEquals("val-2", ci.get(1));

        Assertions.assertFalse(ci.add(-5, "val-2"));
        Assertions.assertFalse(ci.add(50, "val-2"));

    }

    @Test
    void testAdd() {
    }

    @Test
    void delete() {
        CollectionImpl ci = new CollectionImpl();
        for (int i = 0; i < 5; i++) {
            ci.add(String.valueOf(i + 1));
        }

        Assertions.assertTrue(ci.delete("3"));
        Assertions.assertEquals(4, ci.size());

        Assertions.assertFalse(ci.delete("value"));
    }

    @Test
    void get() {
        CollectionImpl ci = new CollectionImpl();
        for (int i = 0; i < 10; i++) {
            ci.add(String.valueOf(i + 100));
        }

        Assertions.assertEquals("105", ci.get(5));
    }

    @Test
    void getNegative() {
        CollectionImpl ci = new CollectionImpl();
        ci.add("q");
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> ci.get(1));
    }

    @Test
    void contain() {
        CollectionImpl ci = new CollectionImpl();
        for (int i = 0; i < 5; i++) {
            ci.add("T" + i);
        }

        String str = "T4";
        Assertions.assertTrue(ci.contain(str));

        str = "F";
        Assertions.assertFalse(ci.contain(str));
        Assertions.assertFalse(ci.contain(null));
    }

    @Test
    void testEquals() {
        CollectionImpl ci = new CollectionImpl();
        String[] testArray1 = {"0", "1", "2", "3", "4"};
        String[] testArray2 = {"0", "1", "2", "3", "5"};
        String[] testArray3 = {"0", "1", "2", "3", "4", "5"};

        for (int i = 0; i < 5; i++) {
            ci.add(String.valueOf(i));
        }

        Assertions.assertTrue(ci.equals(testArray1));
        Assertions.assertFalse(ci.equals(testArray2));
        Assertions.assertFalse(ci.equals(testArray3));
    }

    @Test
    void clear() {
        CollectionImpl ci = new CollectionImpl();
        ci.add("0");
        ci.clear();
        Assertions.assertEquals(0, ci.size());
    }

    @Test
    void size() {
        CollectionImpl ci = new CollectionImpl();
        Assertions.assertEquals(0, ci.size());
    }
}