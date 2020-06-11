package PracticeAtHome.warmup;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
class Rectangle {
    Point p1;
    Point p2;

    static Rectangle random() {
        return new Rectangle(Point.random(), Point.random());
    }

    public static boolean isAbnormal(Rectangle rectangle) {
        if (rectangle.p1.x > rectangle.p2.x && rectangle.p1.y > rectangle.p2.y) return false;
        else if(rectangle.p1.x<rectangle.p2.x && rectangle.p1.y<rectangle.p2.y) return false;
        else return true; }

    public Point findTheLowestPoint(Rectangle rectangle) {
        if (rectangle.p1.y < rectangle.p2.y) return rectangle.p1;
        else return rectangle.p2;
    }

    public Point findTheHighestPoint(Rectangle rectangle) {
        if (rectangle.p1.y > rectangle.p2.y) return rectangle.p1;
        else return rectangle.p2;
    }

    public List<Rectangle> fromOneRectangle(Rectangle rectangle) {
        List<Rectangle> allRectangles = new ArrayList<>();
        Point lowest = rectangle.findTheLowestPoint(rectangle);
        Point highest = rectangle.findTheHighestPoint(rectangle);
        int x = lowest.x;
        int y = lowest.y;
        if (!isAbnormal(rectangle)) {
            while (x != highest.x && y != highest.y) {
                while (x + 1 <= highest.x) {
                    allRectangles.add(new Rectangle(new Point(x, y), new Point(x + 1, y + 1)));
                    x = x + 1;
                }
                if (y + 1 <= highest.y) {
                    y = y + 1;
                    x = lowest.x;
                }
            }
        } else {
            while (x != highest.x && y <= highest.y-1) {
                while (x - 1 >= highest.x) {
                    allRectangles.add(new Rectangle(new Point(x - 1, y), new Point(x, y + 1)));
                    x = x - 1;
                }
                if (y + 1 <= highest.y) {
                    y = y + 1;
                    x = lowest.x;
                }
            }

        }
        System.out.println(allRectangles.size());
        System.out.println("______________________________");
        return allRectangles;
    }

}
