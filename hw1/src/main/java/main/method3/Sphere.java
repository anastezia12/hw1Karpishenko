package main.method3;

public class Sphere implements GetVolume {

  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public Sphere(int radius) {
    this.radius = radius;
  }


  @Override
  public double getVolume() {
    return (double) (this.radius * this.radius * this.radius) * 3.14 * 3 / 4;
  }
}
