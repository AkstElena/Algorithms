package Seminar.Seminar1;

/* 
1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
2. Считаем, что 1 и 2 значения последовательности равны 1.
3. Искать будем по формуле On
=On-1+On-2 что предполагает использовать
рекурсивного алгоритма
*/

public class Task4 {

  public static void main(String[] args) {
    System.out.println(findFibonacci(9));
    System.out.println(findFibonacciWhile(9));

  }

  public static int findFibonacci(int n) {
    if (n == 1 | n == 2) {
      return 1;
    } else {
      return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
  }

  /*
   * 1.Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот
   * раз
   * откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
   * линейную сложность, т.к. вычисление каждого из чисел последовательности будет
   * происходить ровно 1 раз.
   * 2.Вариантов решения может быть несколько, но нужно предложить студентам
   * считать
   * последовательность с первого числа и далее до тех пор, пока не доберемся до
   * нужного номера. При этом значение предыдущих элементов нужно сохранять, чтобы
   * не приходилось вычислять заново, как это происходило при рекурсивном методе.
   */

  public static int findFibonacciWhile(int n) {
    int firstNumber = 1;
    int secondNumber = 1;
    int count = 2;
    while (count < n) {
      int temp = firstNumber;
      firstNumber = secondNumber;
      secondNumber = temp + secondNumber;
      count++;
    }
    return secondNumber;
  }

}
