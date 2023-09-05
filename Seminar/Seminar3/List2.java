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

  // сортировка с заменой только значений
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

  // сортировка с заменой ячеек данных, перестановка позиций
  public void sort() {
    boolean needSort;
    do {
      needSort = false;
      Node2 node = head;
      while (node != null && node.next != null) {
        if (node.value > node.next.value) {
          Node2 before = node.prev;
          Node2 after = node.next.next;
          Node2 current = node;
          Node2 next = node.next;

          current.next = after;
          current.prev = next;
          next.next = current;
          next.prev = before;
          if (before != null) {
            before.next = next;
          } else {
            head = next;
          }
          if (after != null) {
            after.prev = current;
          } else {
            tail = current;
          }

          needSort = true;
        }
        node = node.next;
      }
    } while (needSort);
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
