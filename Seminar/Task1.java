package Seminar;

/**
 * Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N. Согласно
 * свойствам линейной сложности, количество итераций цикла будет линейно
 * изменяться относительно изменения размера N.
 */
public class Task1 {
  public static void main(String[] args) {

    System.out.println(summNumber(5));

  }

  public static int summNumber(int n) {
    int summ = 0;
    for (int i = 1; i <= n; i++) {
      summ += i;
    }
    return summ;

  }
}