package main.method1;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Method1Test {

  Method1 method1 = new Method1();

  @Test
  void method1True() {

    List<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(0);
    List<Integer> expected = new ArrayList<>();
    expected.add(0);
    expected.add(1);
    Assert.assertEquals(intList, intList);

  }

  @Test
  void method1False() {

    List<Integer> intList = new ArrayList<>();
    intList.add(-1);
    intList.add(0);
    List<Integer> expected = new ArrayList<>();
    expected.add(0);

    Assert.assertEquals(expected, method1.method1(intList));

  }

  @Test
  void method1NullCome() {

    List<Integer> intList = new ArrayList<>();

    List<Integer> expected = new ArrayList<>();

    Assert.assertEquals(expected, method1.method1(intList));

  }

  @Test
  void method1NullCorrect() {

    List<Integer> intList = new ArrayList<>();
    intList.add(-100);
    intList.add(-1000);
    List<Integer> expected = new ArrayList<>();

    Assert.assertEquals(expected, method1.method1(intList));

  }

  @Test
  void method1NormalCame() {

    List<Integer> intList = new ArrayList<>();
    intList.add(-100);
    intList.add(-1000);
    intList.add(0);
    intList.add(20);
    intList.add(-100);
    intList.add(44);
    intList.add(19);
    intList.add(2);
    List<Integer> expected = new ArrayList<>();
    expected.add(44);
    expected.add(20);
    expected.add(19);
    expected.add(2);
    expected.add(0);

    Assert.assertEquals(expected, method1.method1(intList));

  }

}