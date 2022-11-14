package main.method2;

import static java.sql.Types.NULL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Method2 {
  //Написати метод, який на вхід приймає список рядків-текстів,
  // в яких можуть бути хеш-теги (слова, що починаються на знак "#").
  // Як результат, метод повинен повертати top-5 найчастіше згаданих хеш-тегів із зазначенням кількості
  // згадки кожного з них. Декілька однакових хеш-тегів в одному рядку повинні вважатися однією згадкою.
  // Написати unit-тести для цього методу.

  public List<Object> newMethod(List<String> massage) {
    HashMap<String, Integer> hashtag = new HashMap<String, Integer>();

    massage.stream().forEach(x -> {

      String[] separateStrings = x.split("[/\\\\., ]", 0);

      for (String i : separateStrings) {
        if (i.contains("#")) {
          String[] y = i.split("#");

          if (y != null) {

            Set<String> list = new HashSet<>(Arrays.asList(y));
            y = list.toArray(new String[0]);

            for (String j : y) {
              if (j != "" && !j.equals(" ")) {
                if (!hashtag.containsKey(j)) {
                  hashtag.put(j, 1);
                } else {
                  hashtag.put(j, hashtag.get(j) + 1);
                }
              }
            }
          }
        }
      }
    });
    return Collections.singletonList(hashtag.entrySet().stream()
        .sorted(Entry.<String, Integer>comparingByValue().reversed())
        .toList());
  }
}
