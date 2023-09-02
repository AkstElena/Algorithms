package Lecture;

/**
 * Lecture2
 */
public class Lecture2 {

  public static void main(String[] args) {
    int[] arr = new int[] {
        4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5
    };
    // bubbleSirt(arr);
    // directSort(arr);
    // insertSort(arr);
    quickSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    // System.out.println(find(8, arr));
    // int[] arr = new int[] {
    // 1, 5, 8, 9, 25
    // };
    // System.out.println(binSearch(8, arr, 0, arr.length - 1));

  }

  // Пузырьковая сортировка

  public static void bubbleSirt(int[] arr) {
    boolean finished;
    do {
      finished = true;
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          finished = false;
        }
      }
    } while (!finished);

  }

  // сорировка выбором
  public static void directSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minPosition = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minPosition]) {
          minPosition = j;
        }
      }
      if (i != minPosition) {
        int temp = arr[i];
        arr[i] = arr[minPosition];
        arr[minPosition] = temp;
      }
    }
  }

  // сортировка вставками
  public static void insertSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  // простой перебор массива, выдается позиция элемента
  public static int find(int a, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == a) {
        return i;
      }
    }
    return -1;
  }

  // бинарный поиск
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

  // быстрая сортировка
  public static void quickSort(int[] arr, int startPosition, int endPosition) {
    int lefPosition = startPosition;
    int rightPosition = endPosition;
    int pivot = arr[(startPosition + endPosition) / 2];
    do {
      while (arr[lefPosition] < pivot) {
        lefPosition++;
      }
      while (arr[rightPosition] > pivot) {
        rightPosition--;
      }
      if (lefPosition <= rightPosition) {
        if (lefPosition < rightPosition) {
          int temp = arr[lefPosition];
          arr[lefPosition] = arr[rightPosition];
          arr[rightPosition] = temp;
        }
        lefPosition++;
        rightPosition--;
      }
    } while (lefPosition <= rightPosition);
    if (lefPosition < endPosition) {
      quickSort(arr, lefPosition, endPosition);
    }
    if (startPosition < rightPosition) {
      quickSort(arr, startPosition, rightPosition);
    }
  }

  // пирамидальная сортировка
  private static void heapify(int[] arr, int heapSize, int rootIndex) {
    int largest = rootIndex; // инициализируем небольшой элемент как корень
    int leftChild = 2 * rootIndex + 1;
    int rightChild = 2 * rootIndex + 2;

    // Если левый дочерний элемент больше корня (больше чем самый большой элемент на
    // данный момент)
    if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
      largest = leftChild;
    }
    // Если правый дочерний элемент больше, чем самый большой элемент на данный
    // момент
    if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
      largest = rightChild;
    }
    // если самый большой элемент не корень
    if (largest != rootIndex) {
      int temp = arr[rootIndex];
      arr[rootIndex] = arr[largest];
      arr[largest] = temp;
    }

    // рекурсивно преобразуем в двичную кучу затронутое поддерево
    heapify(arr, heapSize, largest);

  }

  public static void sort(int[] arr) {
    // построение бинарной кучи (перегруппируем массив)
    for (int i = arr.length / 2 - 1; i >= 0; i--) {
      heapify(arr, arr.length, i);
    }

    // Один за другим извлекаем элементы из кучи
    for (int i = arr.length - 1; i >= 0; i--) {
      // Перемещаем тукущий корень в конец
      int temp = arr[0];
      arr[0] = arr[1];
      arr[1] = temp;

      // вызываем к уменшенной куче
      heapify(arr, i, 0);

    }

  }

}
