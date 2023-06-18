package artist;
import artist.StdDraw;

public class Canvas{
  private Shape[] shapes;
  private int numShapes;

  private final double MIN_X = -50.0;
  private final double MAX_X = 50.0;
  private final double MIN_Y = -50.0;
  private final double MAX_Y = 50.0;

  public final double WIDTH = MAX_X - MIN_X;
  public final double HEIGHT = MAX_Y - MIN_Y;

  /*
   * This method: makes a new array, shapes, and sets the STDDraw scles to min and max x and y values
   * 
   * @param: int numShapes
   * 
   * return type: void type
   */
  public Canvas(int numShapes) {
    shapes = new Shape[numShapes];
    StdDraw.setXscale(MIN_X, MAX_X);
    StdDraw.setYscale(MIN_Y, MAX_Y);
    
  }
  /*
   * This method: if there is no room left, it tells the user that there is no room, else it will add a shape
   * 
   * @param: Shape shape
   * 
   * return type: void type
   */
  public void addShape(Shape shape) {
     if (numShapes == shapes.length) {
       System.out.printf("Sorry out of room!");
     }
    else {
      shapes[numShapes] = shape;
      numShapes++;
    }
    }  
  /*
   * This method: draw method
   * 
   * @param: no params
   * 
   * return type: void type
   */
  public void draw() {
    for (int i = 0; i < numShapes; i++) {
      shapes[i].draw();
    }
  }
  /*
   * This method: clears the canvas
   * 
   * @param: no params
   * 
   * return type: void type
   */
  public void clearCanvas() {
    StdDraw.clear();
  }
  /*
   * This method: returns maxArea(midth * height) as a double
   * 
   * @param: no params
   * 
   * return type: double
   */
  public double maxArea() {
    return Math.abs(WIDTH * HEIGHT);
  }
}
