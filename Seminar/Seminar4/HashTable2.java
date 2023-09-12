package Seminar.Seminar4;

// Задание 3 (тайминг 10 минут)
// 1. Реализуем метод поиска данных по ключу в хэш-таблице.
// 2. Теперь, когда у нас есть базовая структура нашей хэш-таблицы, можно
// написать алгоритм поиска элементов, включающий в себя поиск нужного
// бакета и поиск по бакету

public class HashTable2<K, V> {
  private static final int INIT_BASKET_COUNT = 16;

  private Basket[] baskets;

  public HashTable2() {
    this(INIT_BASKET_COUNT);
  }

  public HashTable2(int initSize) {
    baskets = (Basket[]) new Object[initSize];
  }

  private int calculateBasketIndex(K key) {
    return key.hashCode() % baskets.length;
  }

  private class Entity {
    private K key;
    private V value;
  }

  private class Basket {
    private Node head;

    private class Node {
      private Node next;
      private Entity value;
    }
  }

}