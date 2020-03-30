package PracticeInClass;




public class XLinkedListApp {
    public static void main(String[] args) {
        XLinkedList xl = new XLinkedList();
        xl.prepend(1); // LL: 1
        xl.prepend(2); // LL: 2,1
        xl.prepend3(3); // LL: 3,2,1
        xl.append(10);   // LL: 3,2,1,10
        xl.append(20);   // LL: 3,2,1,10,20
        System.out.println(xl.represent());
        System.out.println(xl.represent2());
        System.out.println(xl.represent3r());

//        System.out.println(xl.indexOf(3));
//        System.out.println(xl.indexOf(2));
//        System.out.println(xl.indexOf(1));
//        System.out.println(xl.indexOf(10));
//        System.out.println(xl.containsAt(1, 2));
//        System.out.println(xl.size());
//        System.out.println(xl.containsr(1));
//        System.out.println(xl.containsr(2));
//        System.out.println(xl.containsr(3));
//        System.out.println(xl.containsr(40));
//        System.out.println(xl.containsr(50));
        xl.reverser();
        System.out.println(xl.represent());




    }
}
