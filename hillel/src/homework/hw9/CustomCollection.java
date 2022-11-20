package homework.hw9;

public interface CustomCollection<String> {

    boolean add(String string);

    boolean addAll(String[] array);

    boolean delete (int index);

    boolean delete (String string);

    String get(int index);

    boolean contains(String string);

    boolean clear();

    int size();

    boolean trim();

}
