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
//        test1.unique();
//        System.out.println(test1.unique());

        System.out.println(test1);

        SinglyLinkedList<Integer> test2 = new SinglyLinkedList<>();
        test2.addFirst(300);
        test2.addFirst(500);
        test2.addLast(700);
        test2.concatenate(test1);
        System.out.println(test2);
        System.out.println(test2.unique());
        System.out.println(test1);
        System.out.println(test2);
        test2.merge(test1);
        System.out.println(test1);
    }
}
