package Lecture;

public class Lecture3 {
  Node head; // начало списка
  Node tail; // последний элемент в списке

  // добавление элемента в список, при классическом варианте в конец списка
  public void add(int value) {
    Node node = new Node();
    node.value = value;
    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      node.previos = tail;
      tail = node;
    }
  }

  // добавление элемента в середину списка
  public void add(int value, Node node) {
    Node next = node.next;
    Node addNode = new Node();
    addNode.value = value;
    node.next = addNode;
    addNode.previos = node;
    if (next == null) {
      tail = addNode;
    } else {
      next.previos = addNode;
      addNode.next = next;
    }
  }

  // удаление элемента из списка
  public void delete(Node node) {
    Node next = node.next;
    Node previos = node.previos;
    if (previos == null) {
      next.previos = null;
      head = next;
    } else {
      if (next == null) {
        tail = previos;
        previos.next = null;
      } else {
        next.previos = previos;
        previos.next = next;
      }
    }
  }

  // поиска элемента в списке
  public Node find(int value) {
    Node current = head;
    while (current != null) {
      if (current.value == value) {
        return current;
      } else {
        current = current.next;
      }
    }
    return null;

  }

  // разворот списка для односвязного
  public void revert() {
    Node currentNode = head;
    while (currentNode != null) {
      Node next = currentNode.next;
      Node previos = currentNode.previos;
      currentNode.next = previos;
      currentNode.previos = next;
      if (previos == null) {
        tail = currentNode;
      }
      if (next == null) {
        head = currentNode;
      }
      currentNode = next;
    }
  }

  // разворот односвязного списка с помощью рекурсии
  public void revert1() {
    if (head != null && head.next != null) {
      revert(head.next, head);
    }
  }

  private void revert(Node currentNode, Node previosNode) {
    if (currentNode.next == null) {
      head = currentNode;
    } else {
      revert(currentNode.next, currentNode);
    }
    currentNode.next = previosNode;
    previosNode.next = null;

  }

  // работа со стеком, добавление данных в начало очереди (для односвязного
  // списка)
  public void push(int value) {
    Node node = new Node();
    node.value = value;
    node.next = head;
    head = node;
  }

  // работа со стеком, получение и удаление первого элемента (для односвязного
  // списка)
  public Integer pop() {
    Integer result = null;
    if (head != null) {
      result = head.value;
      head = head.next;
    }
    return result;
  }

  // работа с очередью, добавление данных в начало очереди (для двусвязного
  // списка)
  public void push2(int value) {
    Node node = new Node();
    node.value = value;
    node.next = head;
    head.previos = node;
    head = node;
  }

  // работа с очередью, извлечение последнего элемента (для двусвязного списка)
  public Integer peek() {
    Integer result = null;
    if (tail != null) {
      result = tail.value;
      tail.previos.next = null;
      tail = tail.previos;
    }
    return result;
  }

  // односвязный список
  // public class Node {
  // int value; // значение элемента списка
  // Node next; // указывает следующий элемент списка

  // }

  // двусвязный список
  public class Node {
    int value; // значение элемента списка
    Node next; // указывает следующий элемент списка
    Node previos; // указывает предыдущий элемент списка

  }
}
