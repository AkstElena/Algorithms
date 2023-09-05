package Homework;

public class main {
  public static void main(String[] args) {

    Homework3 list = new Homework3();
    list.addFirst(15);
    list.addFirst(3);
    list.addFirst(21);
    list.addFirst(45);

    list.printList();

    list.revert();
    list.printList();
  }

}
