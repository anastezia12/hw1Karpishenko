package main.method1;

import java.util.Collections;
import java.util.List;

public class Method1 {
  //Зробити метод, який приймає на вхід масив цілих чисел, і повертає тільки ті з них,
  // які позитивні (>=0), відсортувавши їх за спаданням. Зробити unit-тести для цього методу.

  public List<Integer> method1(List<Integer> intList) {
    List<Integer> newList = intList.stream().filter(x -> x >= 0).sorted(Collections.reverseOrder())
        .toList();
    return newList;
  }

}
