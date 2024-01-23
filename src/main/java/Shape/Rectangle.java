package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
            super();
            Double max_x = width / 2;
            Double max_y = height / 2;
            ArrayList<Point2d> coords = new ArrayList<Point2d>();
            for(double y = max_y; y > -max_y; y -= .5) {
                for (double x = max_x; x > -max_y; x -= .5) {
                    coords.add(new Point2d(x, y));
                }
            }
            addAll(coords);
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super();
        addAll(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }
}
