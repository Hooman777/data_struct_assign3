public class Main {

    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> test1 = new SinglyLinkedList<>();
        System.out.println(test1.isEmpty());
        test1.addFirst(734);
        System.out.println(test1.isEmpty());
        test1.addFirst(281);
        test1.addLast(999);
        test1.addLast(999);
        test1.addLast(1360);
        test1.addLast(1360);
        System.out.println(test1);
//        System.out.println(test1.removeLast());
        System.out.println(test1.unique());

        System.out.println(test1);

    }
}
