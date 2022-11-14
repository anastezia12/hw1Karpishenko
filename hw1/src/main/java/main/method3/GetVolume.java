package main.method3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface GetVolume {

  List<GetVolume> listOfObj = new ArrayList<>();

  double getVolume();


  HashMap<GetVolume, Integer> getRange = new HashMap<GetVolume, Integer>();


}
