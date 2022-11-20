package homework.hw9;

public class LList {
    private int size = 0;
    Node<Number> first;
    Node<Number> last;

    private class Node<Number> {
        Number item;
        Node<Number> next;
        Node<Number> previous;

        Node(Node<Number> previous, Number element, Node<Number> next) {
            this.item = element;
            this.next = next;
            this.previous = previous;
        }
    }
}
