package Seminar.Seminar2;

/*
1. Необходимо написать один из простых алгоритмов сортировки, имеющий сложность O(n2). 
2.Можно выбрать из пузырьковой сортировки, сортировки вставками и сортировки выбором. 
3.Следует обратить внимание на сложность данных алгоритмов и указать признаки квадратичной сложности для каждого из них.
 */
public class Task1 {
  public static void main(String[] args) {
    int[] arr = new int[] { 5, 32, 5, 11, 41, 3, 12, 51, 1 };
    sortArr(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  // пузырьковая сортировка
  public static void sortArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

}
