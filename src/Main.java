public class Main {

    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> test1 = new SinglyLinkedList<>();
        System.out.println(test1.isEmpty());
        test1.addFirst(734); // adding to the first
        System.out.println(test1.isEmpty()); // checking whether or not "test1" is empty
        test1.addFirst(281); // adding to the first
        test1.addLast(999); // adding to the end
        test1.addLast(999); // adding to the end
        test1.addLast(1360); // adding to the end
        test1.addLast(1360); // adding to the end

        SinglyLinkedList<Integer> test2 = new SinglyLinkedList<>();
        test2.addFirst(300); // adding to the first
        test2.addFirst(500); // adding to the first
        test2.addLast(700); // adding to the end
        test2.concatenate(test1); // testing concatenate method on "test1" and "test2"
        System.out.println(test2); // log the linkedList instance by it values
        System.out.println(test2.unique()); // testing unique method on ""test2
        System.out.println(test1); // log the linkedList instance by its values
        System.out.println(test2); // log the linkedList instance by its values

        System.out.println(test1.merge(test2)); // log the linkedList instance by it values and testing "merge" for question 3
        System.out.println(test2); // log the linkedList instance by its values
        ReversibleSinglyList<Integer> test3 = new ReversibleSinglyList<>();

        test3.addFirst(333); // adding to the first
        test3.addFirst(111); // adding to the first
        test3.addFirst(555); // adding to the first
        test3.addLast(777); // adding to the end
        test3.addLast(888); // adding to the end

        System.out.println(test3); // log the linkedList instance by its values
        test3.reverse(); // testing reverse on "test3"
        System.out.println(test3); // log the linkedList instance by its values

    }
}
