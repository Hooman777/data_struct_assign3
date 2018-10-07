public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList() {};
    // access methods
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }
    // update methods
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (isEmpty()) tail = head;
        size++;
    }
    public void addLast(E e) {
        Node<E> temp = new Node<>(e, null);
        if (isEmpty()) head = temp;
        else {
            tail.setNext(temp);
        }
        tail = temp;
        size++;
    }
    public E removeFirst() {
        if (isEmpty()) return null;
        E output = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) tail = head;
        return output;
    }
    public E removeLast() {
        if (isEmpty()) return null;
        E output = tail.getElement();
        Node<E> temp1 = head;
        Node<E> temp2 = null;
        while (temp1.getNext() != null) {
            temp2 = temp1;
            temp1 = temp1.getNext();
        }
        tail = temp2;
        size--;
        if (isEmpty()) head = tail;
        return output;
    }
    public SinglyLinkedList<E> unique() {
        if (isEmpty()) return null;
        Node<E> temp = head;
        SinglyLinkedList<E> output = new SinglyLinkedList<>();
        output.addFirst(head.getElement());
        for (int i = 1; i < size - 1; i+=2) {
            temp = temp.getNext();
            E each = temp.getElement();
            E check = temp.getNext().getElement();
            if (each != check) output.addLast(each);
        }
        output.addLast(tail.getElement());
        head = output.head;
        tail = output.tail;
        size = output.size();
        return output;
    }
    public SinglyLinkedList<E> merge(SinglyLinkedList<E> l2) {
        SinglyLinkedList<E> output = new SinglyLinkedList<>();
        output.head = head;
        Node<E> temp1 = head;
        Node<E> temp2 = l2.head;
        for (int i = 0; i < size; ++i) {
            output.addLast(temp1.getElement());
            output.addLast(temp2.getElement());
//            output.concatenate(output);
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();

        }
        return output;
    }

//    public SinglyLinkedList<E> merge(SinglyLinkedList<E> l1, SinglyLinkedList<E> l2) {
//        SinglyLinkedList<E> output = new SinglyLinkedList<>();
//        Node<E> newHead = l1.head;
//        Node<E> temp = null;
//        Node<E> temp1 = l1.head;
//        Node<E> temp2 = l2.head;
//
//        for (int i = 0; i < l1.size(); ++i) {
//            temp = temp1.getNext();
//            temp1.setNext(temp2);
//            temp2.setNext(temp);
//        }
//        return output;
//    }
    public void concatenate(SinglyLinkedList<E> l2) {
        if (isEmpty() && l2.isEmpty()) {
            head = null;
            tail = null;
            size = 0;
        } else if (isEmpty() && !l2.isEmpty()) {
            head = l2.head;
            tail = l2.head;
            size += l2.size();
        } else if (!isEmpty() && !l2.isEmpty()) {
            tail.setNext(l2.head);
            tail = l2.tail;
            size += l2.size();
        }
    }
    @Override
    public String toString() {
        if (isEmpty()) return "Empty list!";
        Node<E> temp = head;
        StringBuilder output = new StringBuilder("[");
        for (int i = 1; i < size; ++i) {
            output.append(temp.getElement());
            output.append(", ");
            temp = temp.getNext();
        }
        output.append(temp.getElement());
        output.append("]");
        return output.toString();
    }

}
