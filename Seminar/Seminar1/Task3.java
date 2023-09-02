package Seminar.Seminar1;

/*Необходимо написать алгоритм поиска всех доступных комбинаций
(посчитать количество) для количества кубиков K с количеством граней N.
2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
ограничено (4 кубика, например), либо их количество будет
динамическим. Выбор за вами.
3. Если вы реализуете простой вариант, обращает внимание, что данное
решение имеет сложность O(n4), но если количество кубиков сделать
переменной, то она трансформируется в O(nk), что будет представлять
собой экспоненциальную сложность. Для второго решения очевидно, что
его сложность O(nk) с самого начала. */

public class Task3 {

  public static void main(String[] args) {

    // решение для 4х кубиков с 6 гранями
    int face = 6;
    int count = 0;
    for (int i = 0; i < face; i++) {
      for (int j = 0; j < face; j++) {
        for (int k = 0; k < face; k++) {
          for (int k2 = 0; k2 < face; k2++) {
            count++;
          }
        }
      }
    }
    System.out.println(count);

    System.out.println(countCombination(4, 6));
    System.out.println(countCombination(8, 6));
  }

  public static int countCombination(int kubs, int face) {
    if (kubs == 1) {
      return face;
    }
    int combination = 0;
    for (int i = 1; i <= face; i++) {
      combination += countCombination(kubs - 1, face);
    }
    return combination;
  }

  /**
   * Простой вариант (количество кубиков 4)
   */
  public static int combinationCount(int faces) {
    int count = 0;
    for (int i = 1; i <= faces; i++) {
      for (int j = 1; j <= faces; j++) {
        for (int k = 1; k <= faces; k++) {
          for (int l = 1; l <= faces; l++) {
            count++;
          }
        }
      }
    }
    return count;
  }

  /**
   * Сложный вариант - количество кубиков задается условием
   */
  public static int combinationCount(int count, int faces) {
    if (count > 0) {
      return recursiveCounter(1, count, faces);
    } else {
      return 0;
    }
  }

  // 6 * 6 * 6 * 6
  private static int recursiveCounter(int depth, int maxDepth, int faces) {
    // max = 4, faces = 6 // count = 214 * 6 = 1296
    // 1 4 6 ->
    // ф
    int count = 0;
    for (int i = 1; i <= faces; i++) {
      if (depth == maxDepth) {
        count++;
      } else {
        count += recursiveCounter(depth + 1, maxDepth, faces);
      }
    }
    return count;
  }

  public static int countCombinations(int k, int n) {
    // Базовый случай: если количество кубиков равно 0, возвращаем 1 комбинацию
    // (пустая комбинация)
    if (k == 1) {
      return n;
    }
    // Рекурсивно считаем комбинации для каждого значения на текущем кубике
    int combinations = 0;
    for (int i = 1; i <= n; i++) {
      combinations += countCombinations(k - 1, n);
    }
    return combinations;
  }
}
