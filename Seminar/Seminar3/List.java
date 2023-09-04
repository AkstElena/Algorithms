package Seminar.Seminar3;

public class List {

  private Node head;

  /*
   * Задание 2
   * 1.Реализуем метод добавления новых элементов в начало списка и удаление
   * первого элемента связного списка.
   * 2.Односвязный список всегда имеет ссылку на первый элемент
   * последовательности, потому именно с реализации методов для первого
   * элемента последовательности стоит начать
   */

  public void addFirst(int value) {
    Node newNode = new Node();
    newNode.value = value;
    newNode.next = head;
    head = newNode;
    // проверка на начало списка не нужна, так как и так следующий элемент станет
    // автоматически Null
  }

  public void deleteFirst() {
    if (head == null) {
      System.err.println("Список пустой! ");
    } else {
      head = head.next;
    }
  }

  /*
   * Задание 3
   * 1.Реализуем метод поиска элемента в односвязном списке для проверки наличия
   * элемента внутри списка.
   * 2.Для корректной работы со связным список необходимо понимать, как именно
   * можно обходить все значения внутри связного списка.
   * 3.Для нашего примера проще всего будет написать метод поиска значения в
   * связном списке и возвращения из метода информации о наличии искомого
   * внутри списка.
   */
  public boolean findValue(int value) {
    Node tempNode = head;
    while (tempNode != null) {
      if (tempNode.value == value) {
        return true;
      } else {
        tempNode = tempNode.next;
      }
    }
    return false;
  }

  /*
   * Задание 4 (тайминг 10 минут)
   * 1.Реализуем метод добавления новых элементов в конец списка и удаление
   * последнего элемента связного списка.
   * 2.Теперь, когда мы понимаем, как можно искать значения внутри связного
   * списка,
   * мы можем сделать методы добавления и удаления элементов в конец нашего
   * односвязного списка.
   */

  public void addLast(int value) {
    Node newNode = new Node();
    newNode.value = value;
    Node temp = head;
    while (temp != null) {
      if (temp.next == null) {
        temp.next = newNode;
        break;
      }
      temp = temp.next;
    }
  }

  public void deleteLast() {
    if (head == null) {
      System.err.println("Список пустой! ");
    } else {
      Node temp = head;
      while (temp.next != null) {
        if (temp.next.next == null) {
          temp.next = null;
          return;
        }
        temp = temp.next;
      }
      head = null;

    }
  }

  public void printList() {
    Node tempNode = head;
    while (tempNode != null) {
      System.out.print(tempNode.value + " ");
      tempNode = tempNode.next;
    }
    System.out.println();
  }

}
