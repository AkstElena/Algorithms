package Homework;

public class Homework3 {
  Node head;

  public class Node { // это элемент односвязанного списка
    int value;
    Node next;

  }

  public void addFirst(int value) {
    Node newNode = new Node();
    newNode.value = value;
    newNode.next = head;
    head = newNode;
    // проверка на начало списка не нужна, так как и так следующий элемент станет
    // автоматически Null
  }

  public void printList() {
    Node tempNode = head;
    while (tempNode != null) {
      System.out.print(tempNode.value + " ");
      tempNode = tempNode.next;
    }
    System.out.println();
  }

  public void revert() {
    Node previos = null;
    Node current = head;
    while (current != null) {
      Node next = current.next;
      current.next = previos;
      previos = current;
      current = next;
    }
    head = previos;
  }

}
