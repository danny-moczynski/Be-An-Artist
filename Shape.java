package artist;
import java.util.Random;
import artist.StdDraw;
import java.awt.Color;

public abstract class Shape implements Drawable {
  private Color color;
  private double thickness;
  /*
   * This method: shape, sets the color and size to default values
   * 
   * @param: none
   * 
   * return type: no return type because it is a constructor
   */
  public Shape() {
    this(StdDraw.BLACK, 0.005); 
  }
  /*
   * This method: shape, sets the color and thickness
   * 
   * @param: Color color, double thickness
   * 
   * return type: no return type because it is a constructor
   */
  public Shape(Color color, double thickness) {
    this.color = color;
    this.thickness = thickness;
  }
  /*
   * This method: when called, color is set to a random color set below
   * 
   * @param: none
   * 
   * return void type
   */
  public void setRandomColor() {
    Color[] colors = {Color.RED,Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
    Random rand = new Random();
    int randomColor = rand.nextInt(colors.length);
    this.color = colors[randomColor];
  
  }
  /*
   * This method: abstract area method
   * 
   * @param: none
   * 
   * return type: abstract double
   */
  public abstract double area();
  /*
   * This method: abstract perimeter
   * 
   * @param: none
   * 
   * return type: abstract double
   */
  public abstract double perimeter();

  /*
   * This method: gets and returns the color for shape
   * 
   * @param: none
   * 
   * return type: no return type because it is a constructor
   */
  public Color getColor() {
    return color;
  }

  /*
   * This method: sets the color for the shape
   * 
   * @param: Color color
   * 
   * return type: void type
   */

  public void setColor(Color color) {
    this.color = color;
  }

  /*
   * This method: gets ans retuens thickness
   * 
   * @param: none
   * 
   * return type: double
   */

  public double getThickness() {
    return thickness;
  }

  /*
   * This method: sets the thickness of the shape in a double variable
   * 
   * @param: double thickness
   * 
   * return type: void type
   */

  public void setThickness(double thickness) {
    this.thickness = thickness;
  }
}
