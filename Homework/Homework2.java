package Homework;

/*
 * Реализовать алгоритм пирамидальной сортировки (сортировка кучей)
 */

public class Homework2 {
  public static void main(String[] args) {
    int[] arr = new int[] {
        4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5
    };
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static void sort(int[] arr) {
    for (int i = arr.length / 2 - 1; i >= 0; i--) {
      heapify(arr, arr.length, i);
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr, i, 0);
    }
  }

  private static void heapify(int[] arr, int heapSize, int rootIndex) {
    int largest = rootIndex;
    int leftChild = 2 * rootIndex + 1;
    int rightChild = 2 * rootIndex + 2;
    if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
      largest = leftChild;
    }
    if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
      largest = rightChild;
    }
    if (largest != rootIndex) {
      int temp = arr[rootIndex];
      arr[rootIndex] = arr[largest];
      arr[largest] = temp;
      heapify(arr, heapSize, largest);
    }

  }

}
