/**
 * Solution for question 4 which is reversing the given linked list
 * reversible linked list implementation
 */
public class ReversibleSinglyList<E> extends SinglyLinkedList {
    public ReversibleSinglyList() {}
    public void reverse() {
        Node<E> temp0 = head;
        if (size == 2) {
            head = temp0.getNext();
            tail = temp0;
        }
        else if (size > 2) {
            Node<E> temp1 = temp0.getNext();
            Node<E> temp2 = temp1.getNext();
            temp0.setNext(null);
            head = tail;
            tail = temp0;
            while (temp2 != null) {
                temp1.setNext(temp0);
                temp0 = temp1;
                temp1 = temp2;
                temp2 = temp1.getNext();
            }
            temp1.setNext(temp0);
        }
    }
}
