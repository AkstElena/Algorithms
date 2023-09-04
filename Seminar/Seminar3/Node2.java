package Seminar.Seminar3;

/*
 * Задание 5 (тайминг 5 минут)
 * 1.Расширяем структуру связного списка до двухсвязного.
 * 2.Мы научились работать с односвязным список, теперь можно ближе
 * познакомиться со структурой двухсвязного списка и особенностей его
 * внутреннего строения.
 * 3.Стоит напомнить, что двухсвязный список представляет из себя цепочку
 * элементов, которые умеют ссылаться не только на следующий элемент
 * последовательности, но и на предыдущий.
 * 4.Вносить корректировки в уже готовые методы на текущий момент не стоит, их
 * модификацией мы займемся позднее
 */

public class Node2 { // это элемент двусвязанного списка
  int value;
  Node2 next;
  Node2 prev;

}