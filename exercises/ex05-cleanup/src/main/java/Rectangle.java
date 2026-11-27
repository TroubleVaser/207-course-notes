/**
 * Exercise 5.
 * Implements the Rectangle class.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle.
   *
   * @param width the rectangle's width
   * @param height the rectangle's height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the rectangle's area.
   *
   * @return the area
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the amount by which to scale the rectangle
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares the area of this rectangle with another rectangle.
   *
   * @param other the other rectangle
   * @return whether this rectangle is larger
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
