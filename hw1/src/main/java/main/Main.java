package main;

import java.util.ArrayList;
import java.util.List;
import main.method1.Method1;
import main.method2.Method2;
import main.method3.Cube;
import main.method3.Cylinder;
import main.method3.GetRangeVolume;
import main.method3.GetVolume;

public class Main {

  public static void main(String[] arg){
    List<Integer> intList = new ArrayList<>();
    intList.add(-4);
    intList.add(-555);
    intList.add(0);
    intList.add(4);
    intList.add(555);
    intList.add(1);
    Method1 method1 = new Method1();

    System.out.println(method1.method1(intList));
    System.out.println("-------------------------------------");

    List<String> massage = new ArrayList<>();
   massage.add("#cool#cool#cool#cool#cool");
    massage.add("#cool");
    massage.add("#c");
    massage.add("# ");
    massage.add("#col");
    massage.add("#col c");
    massage.add("col c");
    Method2 method2 = new Method2();
    method2.newMethod(massage);
    System.out.println(method2.newMethod(massage));
    System.out.println("------------------------------");



    GetVolume.listOfObj.add(new Cube(4));
    GetVolume.listOfObj.add(new Cylinder(4, 2));
    GetRangeVolume getRangeVolume = new GetRangeVolume();
    getRangeVolume.heshteg(GetVolume.listOfObj);

  }

}
