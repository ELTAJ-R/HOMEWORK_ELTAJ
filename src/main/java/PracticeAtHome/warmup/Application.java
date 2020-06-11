package PracticeAtHome.warmup;


import java.util.List;

public class Application {

  public static void main(String[] args) {
    Rectangles rectangles = new Rectangles();
    List<Rectangle> list = rectangles.list(10);
    System.out.printf("List of generated rectangles is: %s\n",list);
    System.out.printf("The square of all the rectangles is: %d\n", rectangles.area(list));
  }

}
