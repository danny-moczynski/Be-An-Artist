package artist;
import artist.StdDraw;
import java.awt.Color;

public class Circle extends Shape {
  private Point center;
  private double radius;
  /*
   * This method: draw for the circle method 
   * 
   * @param: none
   * 
   * return type: void type
   */
  @Override
  public void draw() {
    StdDraw.setPenColor(getColor());
    StdDraw.setPenRadius();
  }
  /*
   * This method: perimeter, getting the perimeter of the shape in a double format
   * 
   * @param: none
   * 
   * return type: double 
   */
  @Override 
  public double perimeter() {
    double perimeter = 2 * (Math.PI * radius);
    return perimeter;
  }
  /*
   * This method: area, finding the area of the shape in a double format
   * 
   * @param: none
   * 
   * return type: double
   */
  @Override 
  public double area() {
    double area = (radius * radius) * Math.PI;
    return area;
  }
  /*
   * This method: circle, call this and make a circle in the main method as it gets the cenetr and radius
   * 
   * @param: Point center, double radius
   * 
   * return type: no return type because it is a constructor
   */
  public Circle(Point center, double radius) { 
    super();
    this.center = center;
    this.radius = radius;
  }
  /*
   * This method: same as above but with a new thickness variable
   * 
   * @param: center, radius, color, thickness
   * 
   * return type: no return type because it is a constructor
   */
  public Circle(Point center, double radius, Color color, double thickness) {
    super(color, thickness);
    this.center = center;
    this.radius = radius;
  }
  /*
   * This method: getting  the center and radius from the rectangle pro
   * 
   * @param: Rectangle rectangle
   * 
   * return type: no return type because it is a constructor
   */
  public Circle(Rectangle rectangle) { 
    center = rectangle.getCenter();
    radius = rectangle.getWidth();
  }
  /*
   * This method: gets and returns the center of the circle
   * 
   * @param: none
   * 
   * return type: no return type because it is a constructor
   */
  public Point getCenter() {
    return center;
  }
  /*
   * This method: setter for the circle method
   * 
   * @param: Point, center
   * 
   * return type: no return type because it is a constructor
   */
  public void setCenter(Point center) {
    this.center = center;
  }
  /*
   * This method: getter that returns the radius for the circle method
   * 
   * @param: none
   * 
   * return type: double
   */
  public double getRadius() {
    return radius;
  }
  /*
   * This method: stter for the radius in the circle method
   * 
   * @param: double radius
   * 
   * return type: no return type because it is a constructor
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }
}
