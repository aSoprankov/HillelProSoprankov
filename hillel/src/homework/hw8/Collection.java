package homework.hw8;

public interface Collection {

    boolean add(String string);

    boolean add(int index, String string);

    boolean delete(String string);

    String get(int index);

    boolean contain(String string);

    boolean equals(String[] array);

    boolean clear();

    int size();
}
