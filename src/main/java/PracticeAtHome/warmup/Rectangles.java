package PracticeAtHome.warmup;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Rectangles {
  private final Collection<Rectangle> rectangles;
  private final static Rectangle method =new Rectangle();

  static Collection<Rectangle> random(int qty) {
    return Stream
        .generate(Rectangle::random)
        .limit(qty)
        .collect(Collectors.toList());
  }

  Rectangles() {
    this(C.RECTANGLES_COUNT);
  }

  Rectangles(int qty) {
    this.rectangles = Rectangles.random(qty);
  }



  long area(List<Rectangle> rectangles) {
      Set<Rectangle> res=new HashSet<>();
     for (Rectangle rec:rectangles) {res.addAll(method.fromOneRectangle(rec));}
     return res.size();
  }

  public List<Rectangle> list(int numOfRectangles) {
   return new ArrayList<>(random(numOfRectangles));}

}
