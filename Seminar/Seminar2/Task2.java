package Seminar.Seminar2;

/*
 * Написать алгоритм быстрого поиска (quicksort).
 */
public class Task2 {

  public static void main(String[] args) {
    int[] arr = new int[] { 5, 32, 5, 11, 41, 3, 12, 51, 1 };
    quickSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void quickSort(int[] arr, int startPosition, int endPosition) {
    int leftPosition = startPosition;
    int rightPosition = endPosition;
    int pivot = arr[(startPosition + endPosition) / 2];
    do {
      while (arr[leftPosition] < pivot) {
        leftPosition++;
      }
      while (arr[rightPosition] > pivot) {
        rightPosition--;
      }
      if (leftPosition <= rightPosition) {
        if (leftPosition < rightPosition) {
          int temp = arr[leftPosition];
          arr[leftPosition] = arr[rightPosition];
          arr[rightPosition] = temp;
        }
        leftPosition++;
        rightPosition--;
      }
    } while (leftPosition <= rightPosition);
    if (leftPosition < endPosition) {
      quickSort(arr, leftPosition, endPosition);
    }
    if (startPosition < rightPosition) {
      quickSort(arr, startPosition, rightPosition);
    }
  }
}
