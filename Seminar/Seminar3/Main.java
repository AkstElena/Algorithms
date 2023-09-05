package Seminar.Seminar3;

public class Main {

  public static void main(String[] args) {
    List list = new List();
    list.addFirst(5);
    list.addFirst(15);
    // list.addFirst(185);
    // list.addFirst(21);
    // list.addFirst(45);

    // list.printList();
    // list.deleteFirst();
    // list.printList();
    // list.deleteFirst();
    // list.printList();
    // list.deleteFirst();
    // list.printList();
    // list.deleteFirst();
    // list.printList();
    // list.deleteFirst();
    // list.printList();
    // list.deleteFirst();
    // list.printList();

    // System.out.println(list.findValue(5));
    // System.out.println(list.findValue(20));

    // list.addLast(77);
    // list.printList();

    // list.deleteLast();
    // list.printList();
    // list.deleteLast();
    // list.printList();
    // list.deleteLast();
    // list.printList();

    List2 list2 = new List2();
    list2.addFirst2(41);
    list2.addFirst2(18);
    list2.addFirst2(2);

    list2.printList2();

    // list2.deleteFirst2();
    // list2.printList2();
    // list2.deleteFirst2();
    // list2.printList2();
    // list2.deleteFirst2();
    // list2.printList2();

    System.out.println(list2.findValue2(41));
    System.out.println(list2.findValue2(5));

    list2.addLast2(5);
    list2.printList2();

    // list2.deleteLast2();
    // list2.printList2();
    // list2.deleteLast2();
    // list2.printList2();
    // list2.deleteLast2();
    // list2.printList2();
    // list2.deleteLast2();
    // list2.printList2();

    // list2.bubbleSort();
    list2.sort();
    list2.printList2();

  }
}
