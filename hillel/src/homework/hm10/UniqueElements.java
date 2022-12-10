package homework.hm10;

import java.util.*;

import static java.lang.System.*;

public class UniqueElements {
    public static void main(String[] args) {
        createCollection(20);

        List<CustomObject> customObjects = createCollection(20);

        out.print("Source collection -> ");
        customObjects.stream().forEach(out::print);

        uniqueList(customObjects);

        out.print("\nUnique collection -> ");
        customObjects.stream().forEach(out::print);
    }


    private static List<CustomObject> createCollection(int size) {
        List<CustomObject> customObjects = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            customObjects.add(new CustomObject(generateValue()));
        }

        return customObjects;
    }

    private static String generateValue() {
        String[] letters = {"A", "B", "C", "D"};

        int index = new Random().nextInt(4);

        return letters[index];
    }

    private static void uniqueList(List<CustomObject> customObjects) {
        Collections.sort(customObjects, new Comparator<CustomObject>() {
            @Override
            public int compare(CustomObject o1, CustomObject o2) {
                return o1.getLetter().compareTo(o2.getLetter());
            }
        });

        for (int i = 1; i < customObjects.size(); i++) {
            if (customObjects.get(i - 1).getLetter().equals(customObjects.get(i).getLetter()))
                customObjects.remove(i - 1);
        }
    }
}

class CustomObject {
    private String letter;

    CustomObject(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public String toString() {
        return "{" + letter + "} ";
    }
}

