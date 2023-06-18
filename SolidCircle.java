package artist; 
import artist.StdDraw;

public class SolidCircle extends Circle {
  public SolidCircle(Point center, double radius) {
    super(center, radius);
  }
/*
   * This method: draw method for soluid circle, sets pen color and the variables of a  normal circle
   * 
   * @param: none
   * 
   * return type: void type
   */
@Override
  public void draw() {
    StdDraw.setPenColor(getColor());
    StdDraw.circle(getCenter().x, getCenter().y, getRadius() * 2);
  }
}
