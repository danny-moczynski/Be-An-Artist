package artist;
import java.awt.Color;

public class Line extends Shape {
  private Point start;
  private Point end;
  /*
   * This method: draw method, sets the color, radius and where the line is located on the canvas
   * 
   * @param: none
   * 
   * return type: void type
   */
  @Override
  public void draw() {
    StdDraw.setPenColor(getColor());
    StdDraw.setPenRadius();
    StdDraw.line(start.x,start.y,end.x,end.y);
  }
  /*
   * This method: perimeter method, returns 0.0
   * 
   * @param: none
   * 
   * return type: double
   */
  public double perimeter() {
    return 0.0;
  }
  /*
   * This method: area method, returns 0.0
   * 
   * @param: none
   * 
   * return type: void type
   */
  public double area() {
    return 0.0;
  }
  /*
   * This method: line method, all of the different varibles for a line are created in here
   * 
   * @param: start, end, color, thickness
   * 
   * return type: no return type because it is a constructor
   */
  public Line(Point start, Point end, Color color, double thickness) {
    super(color, thickness);
    this.start = start;
    this.end = end;
    
  }
  /*
   * This method: get start method, gets and returns start
   * 
   * @param: none
   * 
   * return type: no return type because it is a constructor
   */
  public Point getStart() {
    return start;
  }
  /*
   * This method: setStart, setter for start in the line class
   * 
   * @param: Point start
   * 
   * return type: void type
   */
  public void setStart(Point start) {
    this.start = start;
  }
  /*
   * This method: getEnd method, gets end and returns it 
   * 
   * @param: none
   * 
   * return type: no return type because it is a constructor
   */
  public Point getEnd() {
    return end;
  }
  /*
   * This method: setEnd method, sets the end in the line class
   * 
   * @param: Point end
   * 
   * return type: void type
   */
  public void setEnd(Point end) {
    this.end = end;
  }
}
