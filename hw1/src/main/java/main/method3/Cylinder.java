package main.method3;

public class Cylinder implements GetVolume {

  private int high;
  private int radius;

  public Cylinder(int high, int radius) {
    this.high = high;
    this.radius = radius;
  }

  public int getHigh() {
    return high;
  }

  public void setHigh(int high) {
    this.high = high;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }


  @Override
  public double getVolume() {
    return (double) (this.radius * this.radius) * 3.14 * this.high;
  }
}
