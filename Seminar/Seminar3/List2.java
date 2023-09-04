package Seminar.Seminar3;
// реализация методов для двусвязного списка

public class List2 {

  private Node2 head;
  private Node2 tail;

  /*
   * Задание 6 (тайминг 10 минут)
   * 1.Обновляем методы согласно новой структуре.
   * 2.Появилась дополнительная переменная, которую необходимо отслеживать во
   * всех операциях.
   * 3.Так же благодаря ссылке на последний элемент списка операции работы с
   * концом стали проще и их стоит заменить на логику аналогичную работе с
   * началом списка
   */

  public void addFirst2(int value) {
    Node2 newNode = new Node2();
    newNode.value = value;
    if (head != null) {
      newNode.next = head;
      head.prev = newNode;
    } else {
      tail = newNode;
    }
    head = newNode;
  }

  public void deleteFirst2() {
    if (head != null && head.next != null) {
      head.prev = null;
      head = head.next;
    } else {
      head = null;
      tail = null;
      System.err.println("Список пустой! ");
    }
  }

  public boolean findValue2(int value) {
    Node2 tempNode = head;
    while (tempNode != null) {
      if (tempNode.value == value) {
        return true;
      } else {
        tempNode = tempNode.next;
      }
    }
    return false;
  }

  public void addLast2(int value) {
    Node2 newNode = new Node2();
    newNode.value = value;
    newNode.prev = tail;
    if (tail != null) {
      newNode.prev = tail;
      tail.next = newNode;
    } else {
      head = newNode;
    }
    tail = newNode;

  }

  public void deleteLast2() {
    if (tail != null && tail.prev != null) {
      tail = tail.prev;
      tail.next = null;
    } else {
      head = null;
      tail = null;
      System.err.println("Список пустой! ");
    }
  }

  /*
   * Задание 7 (тайминг 15 минут)
   * 1.Добавляем метод сортировки для связного списка.
   * 2.Можно использовать любой алгоритм, что мы использовали на предыдущем
   * семинаре, но с точки зрения работы связного списка лучше ориентироваться на
   * пузырьковую сортировку, т.к. она взаимодействует с соседними элементами, а
   * не только по индексам, как делают все остальные сортировки.
   */

  public void bubbleSort() {
    boolean needSort = true;
    while (needSort) {
      needSort = false;
      Node2 currentNode2 = head;
      while (currentNode2.next != null && currentNode2 != null) {
        if (currentNode2.value > currentNode2.next.value) {
          int temp = currentNode2.value;
          currentNode2.value = currentNode2.next.value;
          currentNode2.next.value = temp;
          needSort = true;
        }
        currentNode2 = currentNode2.next;
      }
    }
  }

  public void printList2() {
    Node2 tempNode = head;
    while (tempNode != null) {
      System.out.print(tempNode.value + " ");
      tempNode = tempNode.next;
    }
    System.out.println();
  }

}
