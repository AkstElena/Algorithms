package Seminar.Seminar4;

import java.util.List;

public class HashTable<K, V> {

  // Задание 2 (тайминг 15 минут)
  // 1. Добавляем массив связных списков с фиксированным размером (массив
  // бакетов), либо передаваемым в конструкторе.
  // 2. Хэш-таблица оперирует индексами, потому массив будет идеальным
  // вариантов для представления бакетов.
  // 3. Также реализуем метод вычисления индекса на основании хэш-кода
  // ключа.
  private Basket[] baskets;

  // List<K, V>[] baskets = new List() [];

  public HashTable(int intSize) {
    this.baskets = baskets;
  }

  private class Entity {
    private K key;
    private V value;
  }

  // создаем список
  private class Basket {
    private Node head;

    private class Node {
      private Node next;
      private Entity value;
    }
  }
}
