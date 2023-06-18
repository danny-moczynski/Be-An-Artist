import artist.*;
import java.util.Random;

public class Main {
  /*
   * This method: sets x and y points to random doubles between -50 and 50
   * 
   * @param: int n
   * 
   * return type: no return type because it is a void method
   */
  public static void pickUpSticks(int n) { 
    Random rand = new Random();
    Canvas canvas = new Canvas(n); 
    //Iterate through the array until i equals the number passed in the parameter
    //Set each variable to a random double
    for (int i = 0; i < n; i++) {
      double randomX1 = rand.nextDouble(-50,50);
      double randomY1 = rand.nextDouble(-50,50);
      double randomX2 = rand.nextDouble(-50,50);
      double randomY2 = rand.nextDouble(-50,50);
      //Create a new line object that calls the point class for the coordinates
      Line line = new Line(new artist.Point(randomX1, randomY1), new artist.Point (randomX2, randomY2), StdDraw.BLACK, 0.005);
      line.setRandomColor(); 
      StdDraw.line(randomX1, randomY1, randomX2, randomY2);
      canvas.addShape(line);
    }
    canvas.draw();
    canvas.clearCanvas();
  }
  /*
   * This method: calls all of our methods so it runs on the canvas
   * 
   * @param: String [] args
   * 
   * return type: calls methods and returns on canvas in output
   */
  public static void main(String[] args) {
    pickUpSticks(100); //Call how many sticks you want printed
    drawStaircase(200); //Call how many stairs you want printed
    drawSomethingInteresting(5);
  }
  /*
   * This method: draws a staircase starting in the bottom left corner and finishing in the top right corner with different colors
   * 
   * @param: int numSquares
   * 
   * return type: no return type because it is a void method
   */
  public static void drawStaircase(int numSquares) { 
    Canvas canvas = new Canvas(numSquares); 
    int topLeftX = -50; 
    int bottomRightX = -50;
    int increment = 1;
    //Iterate throught the array until the number of squares is met
    //with i incrementing
    for (int i = 0; i < numSquares; i++) {
      topLeftX += increment;
      bottomRightX += increment;
      
    SolidRectangle rectangle = (new SolidRectangle(new artist.Point(-50.0 + topLeftX, -50.0 + bottomRightX), 1.0, 1.0, StdDraw.BLACK, 0.005));
    rectangle.setRandomColor();
    canvas.addShape(rectangle);
    }
    canvas.draw();
    canvas.clearCanvas();
    }
  /*
   * This method: draws a snowman because we are having winter in the middle of march 
   * 
   * @param: int numCircles
   * 
   * return type: no return type because it is a void method
   */
  public static void drawSomethingInteresting(int numCircles) {   Canvas canvas = new Canvas(numCircles);
    SolidCircle bottomCircle = new SolidCircle(new artist.Point(0, -25.0), 10.0);
    canvas.addShape(bottomCircle);
    canvas.draw();                                                          
    SolidCircle middleCircle = new SolidCircle(new artist.Point(0.0, 10.0), 7.50);
    canvas.addShape(middleCircle);                      
    canvas.draw(); 

    SolidCircle topCircle = new SolidCircle(new artist.Point(0.0, 35.0), 5.0);
    canvas.addShape(topCircle);                      
    canvas.draw();                                                   
    SolidCircle topButton = new SolidCircle(new artist.Point(0.0, 15.0), 0.50);
    StdDraw.filledCircle(0.0, 15.0, 1.5);
    canvas.addShape(topButton);                      
    canvas.draw();
                                                                   SolidCircle middleButton = new SolidCircle(new   artist.Point(0.0, 5.0), 0.50);
    StdDraw.filledCircle(0.0, 5.0, 1.5);
    canvas.addShape(middleButton);                      
    canvas.draw();
                                                               
    SolidCircle leftEye = new SolidCircle(new artist.Point(-4.0, 40.0), 0.75);
    StdDraw.filledCircle(-4.0, 40.0, 0.75);                                                           
    canvas.addShape(leftEye);                      
    canvas.draw();

    SolidCircle rightEye = new SolidCircle(new artist.Point(4.0, 40.5), 0.75);
    StdDraw.filledCircle(4.0, 40, 0.75);                        canvas.addShape(rightEye);                      
    canvas.draw();

    SolidRectangle hat = new SolidRectangle(new artist.Point(-10.0, 10.0), 5.0, 1.0, StdDraw.BLACK, 0.005);
   StdDraw.filledRectangle(0.0, 45.0, 5.0, 0.5);                                     canvas.addShape(hat);                                           canvas.draw(); 
    SolidRectangle topOfHat = new SolidRectangle(new artist.Point(-10.0, 10.0), 5.0, 1.0, StdDraw.BLACK, 0.005);
   StdDraw.filledRectangle(0.0, 47.5, 3.0, 2.0);                                     canvas.addShape(topOfHat);                                           canvas.draw();                        SolidCircle topButtonBottom = new SolidCircle(new artist.Point(0.0, -15.0), 0.50);
    StdDraw.filledCircle(0.0, -15.0, 1.5);
    canvas.addShape(topButtonBottom);                      
    canvas.draw();

    SolidCircle middleButtonBottom = new SolidCircle(new artist.Point(0.0, -25.0), 0.50);
    StdDraw.filledCircle(0.0, -25.0, 1.5);
    canvas.addShape(middleButtonBottom);                      
    canvas.draw();                                                 
    SolidCircle BottomButtonBottom = new SolidCircle(new artist.Point(0.0, -35.0), 0.50);
    StdDraw.filledCircle(0.0, -35.0, 1.5);
    canvas.addShape(BottomButtonBottom);                      
    canvas.draw();                                               canvas.clearCanvas();                                                      
}
}
