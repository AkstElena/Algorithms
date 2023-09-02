package Seminar.Seminar1;

public class Task2 {

  // Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в
  // диапазоне от 1 до N. В алгоритме будет использоваться вложенный for, что явно
  // говорит о квадратичной сложности, на этом стоит акцентировать внимание
  public static void main(String[] args) {
    int number = 100;
    for (int i = 1; i < number; i++) {
      boolean flag = true;
      for (int j = 2; j < i / 2 + 1; j++) {
        if (i % j == 0) {
          flag = false;
        }
      }
      if (flag)
        System.out.print(i + " ");

    }

  }
}
