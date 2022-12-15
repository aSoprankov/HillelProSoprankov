package homework.hm10.unique.elements;

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