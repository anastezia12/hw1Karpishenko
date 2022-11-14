package main.method3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetRangeVolume {

  public void heshteg(List<GetVolume> getVolume) {
    HashMap<GetVolume, Double> heshteg = new HashMap<GetVolume, Double>();

    for (GetVolume i : getVolume) {
      heshteg.put(i, i.getVolume());
    }

    heshteg.entrySet().stream()
        .sorted(Map.Entry.<GetVolume, Double>comparingByValue().reversed())
        .forEach(System.out::println);

  }


}
