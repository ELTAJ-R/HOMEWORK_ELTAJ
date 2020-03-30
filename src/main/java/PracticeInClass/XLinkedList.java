package PracticeInClass;


import java.util.StringJoiner;

public class XLinkedList {

    static class Node {
        final int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node head;

    void prepend(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    void prepend2(int value) {
        Node node = new Node(value, head);
        head = node;
    }

    void prepend3(int value) {
        head = new Node(value, head);
    }

    void append(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public String represent() {
        StringJoiner sj = new StringJoiner(",", "LL:(", ")");
        Node curr = head;
        while (curr != null) {
            sj.add(String.valueOf(curr.value));
            curr = curr.next;
        }
        return sj.toString();
    }

    public String represent2() {
        StringJoiner sj = new StringJoiner(",", "LL:(", ")");
        for (Node curr = head; curr != null; curr = curr.next) {
            sj.add(String.valueOf(curr.value));
        }
        return sj.toString();
    }

    private void attach_next(Node curr, StringJoiner sj) {
        if (curr == null) return;
        sj.add(String.valueOf(curr.value));
        attach_next(curr.next, sj);
    }

    public String represent3r() {
        StringJoiner sj = new StringJoiner(",", "LL:(", ")");
        attach_next(head, sj);
        return sj.toString();
    }

    int size() {
        int count = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            count++;
        }
        return count;
    }

    int recursionSize(Node curr) {
        if (curr == null) return 0;
        else return recursionSize(curr.next) + 1;
    }

    int sizer() {
        return recursionSize(head);
    }

    int sizetr() {
        throw new RuntimeException("Should be implemented at home");
    }

    boolean contains(int element) {
        return checkerIfContains(element) >= 0;

    }

    int checkerIfContains(int element) {
        int count = -1;

        for (Node curr = head; curr != null; curr = curr.next) {
            count++;


            if (curr.value == element) {
                count++;
                break;

            } else count--;
        }
        return count;
    }

    //used similar method as in ArrayList
    boolean checkerIfContainsRe(int element, Node curr) {
        if (curr == null) return false;
        if (element == curr.value) return true;
        else return checkerIfContainsRe(element, curr.next);
    }

    boolean containsr(int element) {
        return checkerIfContainsRe(element, head);
    }


    int indexOf(int element) {
        if (contains(element)) {
            int index = -1;
            for (Node curr = head; curr != null; curr = curr.next) {
                index++;

                if (curr.value == element) {
                    break;
                }
            }
            return index;
        } else {
            return -1;
        }
    }


    void reverse() {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node savedNext = curr.next; //
            curr.next = prev;
            prev = curr;       // moving to the next node
            curr = savedNext;  // moving to the next node
        }
        head = prev;
    }
    void reverser() {
        reverseRecursion(head,null);

    }

    private Node reverseRecursion(Node curr,Node prev){

        if(curr==null) return head;
        curr=head;
        Node savedNext = curr.next;
        prev=curr;
        curr = savedNext;
        head=prev;
        return reverseRecursion(curr.next,prev);


    }

    void merge(Node head2) {

    }

    boolean containsAt(int index, int element) {
        if (indexOf(element) == index) return true;
        else return false;
    }


    void deleteHead() {

        Node curr = head.next;
        while (curr != null) {
            curr = curr.next;
        }


    }

    void deleteTail() {
    }

    void deleteAt(int index) {
    }

    void deleteValue(int value) {
    }

    void insertAfter(int index, int value) {
    }

    void insertBefore(int index, int value) {
    }

}
