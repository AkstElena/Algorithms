package Seminar.Seminar2;

import java.util.Date;

/*
 * 1.Пишем тесты для сравнения производительности сортировки больших массивов. 
2.Для наглядного результата стоит сравнивать массивы до 100000 элементов. При таком подходе будет явно видно, какая из сортировок окажется быстрее.

 */
public class Task3 {

  public static void main(String[] args) {
    for (int i = 10000; i <= 100000; i = i + 10000) {
      int[] arr = new int[i];
      int[] arr1 = new int[i];
      for (int j = 0; j < arr1.length; j++) {
        arr[j] = (int) (Math.random() * 10000);
        arr1[j] = arr[j];
      }
      Date startDate = new Date();
      Task1.sortArr(arr);
      Date endDate = new Date();
      long bubbleSortDuration = endDate.getTime() - startDate.getTime();

      startDate = new Date();
      Task2.quickSort(arr1, 0, arr1.length - 1);
      ;
      endDate = new Date();
      long quickSortDuration = endDate.getTime() - startDate.getTime();
      System.out.printf("i: %s, bubble sort duration: %s, quick sort duration: %s%n", i, bubbleSortDuration,
          quickSortDuration);
    }

  }
}
