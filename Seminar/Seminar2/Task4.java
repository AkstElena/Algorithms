package Seminar.Seminar2;

/*
 * 1.После успешной сортировки массива на нем можно использовать бинарный поиск. Необходимо реализовать алгоритм бинарного поиска по элементам. 
2.Стоит акцентировать внимание, что т.к. алгоритм использует подход «разделяй и властвуй», его удобно писать с помощью рекурсии. 
3.Так что стоит акцентировать внимание на алгоритмическую сложность данного алгоритма, что его выполнение многократно быстрее простого перебора на больших массивах
 */

public class Task4 {

  public static void main(String[] args) {

    int[] arr = new int[] { 5, 32, 5, 11, 41, 3, 12, 51, 1 };
    Task2.quickSort(arr, 0, arr.length - 1);
    System.out.println("Запрашиваемое число находится на позиции: " + binSearch(33, arr, 0, arr.length));
  }

  public static int binSearch(int a, int[] arr, int min, int max) {
    int midpoint;
    if (max < min) {
      return -1;
    } else {
      midpoint = (max - min) / 2 + min;
    }
    if (arr[midpoint] < a) {
      return binSearch(a, arr, midpoint + 1, max);
    } else {
      if (arr[midpoint] > a) {
        return binSearch(a, arr, min, midpoint - 1);
      } else {
        return midpoint;
      }
    }
  }

}
