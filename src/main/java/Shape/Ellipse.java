package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        Double a = widthDiameter / 2;
        Double b = heightDiameter / 2;
        ArrayList<Point2d> coords = new ArrayList<Point2d>();

        // Loop through a grid of points
        for (double y = -b; y <= b; y += 0.5) {
            for (double x = -a; x <= a; x += 0.5) {
                // Check if the point (x, y) is inside the ellipse
                if ((Math.pow(x, 2) / Math.pow(a, 2)) + (Math.pow(y, 2) / Math.pow(b, 2)) <= 1) {
                    coords.add(new Point2d(x, y));
                }
            }
        }

        // Add all the points to your ellipse
        addAll(coords);
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super();
        addAll(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return (Ellipse) super.clone();
    }
}
