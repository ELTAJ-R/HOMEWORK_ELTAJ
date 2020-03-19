package OnlineLesson;

public class Apple implements Comparable<Apple> {
  public final int size;

  public Apple(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return String.format("A[%d]", size);
  }

  @Override
  public int compareTo(Apple o) {
    return this.size-o.size;
  }
}
