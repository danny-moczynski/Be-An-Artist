package artist;

import artist.StdDraw;
import java.awt.Color;

public class Rectangle extends Shape {
  private Point center;
  private double width;
  private double height;

  /*
   * This method: draw method, sets the color and radius for pen
   * 
   * @param: none
   * 
   * return type: void type
   */
  @Override
  public void draw() {
    StdDraw.setPenColor();
    StdDraw.setPenRadius();
  }

  /*
   * This method: area, calculates the area of the rectangle
   * 
   * @param: none
   * 
   * return type: double
   */
  @Override
  public double area() {
    double area = width * height;
    return area;
  }

  /*
   * This method: perimeter, calculates the perimeter of the rectangle
   * 
   * @param: none
   * 
   * return type: double
   */
  @Override
  public double perimeter() {
    double perimeter = 2 * (width + height);
    return perimeter;
  }

  /*
   * This method: gets and sets all of the varibales needed to make the triangle
   * for use in mian mathod when called
   * 
   * @param: center, width, height, color, thickness
   * 
   * return type: no return type because it is a constructor
   */
  public Rectangle(Point center, double width, double height, Color color, double thickness) {
    super(color, thickness);
    this.center = center;
    this.width = width;
    this.height = height;
  }

  /*
   * This method: gets and sets all of the varibales needed to make the triangle
   * for use in mian mathod when called
   * 
   * @param: center, width, rectangle
   * 
   * return type: no return type because it is a constructor
   */
  public Rectangle(Point center, double width, double height) {
    this.center = center;
    this.width = width;
    this.height = height;
  }

  /*
   * This method: gets and sets all of the varibales needed to make the triangle
   * for use in mian mathod when called
   * 
   * @param: topLeft, bottomRight, color, thickness
   * 
   * return type: no return type because it is a constructor
   */
  public Rectangle(Point topLeft, Point bottomRight, Color color, double thickness) {
    super(color, thickness);
    this.center = new Point(((topLeft.x + bottomRight.x) / 2), ((topLeft.y + bottomRight.y) / 2));
    this.width = Math.abs(topLeft.x - bottomRight.x);
    this.height = Math.abs(topLeft.y - bottomRight.y);
  }

  /*
   * This method: gets center and returns it
   * 
   * @param: none
   * 
   * return type: no return type because it is a constructor
   */
  public Point getCenter() {
    return center;
  }

  /*
   * This method: sets the center of the rectangle
   * 
   * @param: Point center
   * 
   * return type: void type
   */
  public void setCenter(Point center) {
    this.center = center;
  }

  /*
   * This method: gets width ans returns it
   * 
   * @param: none
   * 
   * return type: double
   */
  public double getWidth() {
    return width;
  }

  /*
   * This method: sets the width of the rectangle
   * 
   * @param: double width
   * 
   * return type: void type
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /*
   * This method: gets height and returns it
   * 
   * @param: none
   * 
   * return type: double type
   */
  public double getHeight() {
    return height;
  }

  /*
   * This method: sets the height of the rectangle
   * 
   * @param: double height
   * 
   * return type: void type
   */
  public void setHeight(double height) {
    this.height = height;
  }
}
