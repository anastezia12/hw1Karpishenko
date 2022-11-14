package main.method3;

public class Cube implements GetVolume {

  int side;

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }

  public Cube(int side) {
    this.side = side;
  }

  public double getVolume() {
    return (double) (this.side * this.side * this.side);
  }
}
