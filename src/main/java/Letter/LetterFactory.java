package Letter;

import Point.Point2d;
import Shape.*;
import org.w3c.dom.css.Rect;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    /**
     * TODO
     * Create the letter A graphically
     * 
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        double width = halfMaxWidth - stripeThickness;
        double height = maxHeight - stripeThickness;

        BaseShape left = new Rectangle(width, height);
        BaseShape right = new Rectangle(width, height);
        BaseShape middle = new Rectangle(halfMaxHeight, width);

        left = new BaseShape(left.rotate(left.getCoords(), Math.toRadians(20)));
        right = new BaseShape(right.rotate(right.getCoords(), Math.toRadians(-20)));

        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-halfMaxHeight / 3, 0.0)));
        right = new BaseShape(right.translate(right.getCoords(), new Point2d(halfMaxHeight / 3, 0.0)));

        BaseShape letterA = new BaseShape();
        letterA.add(left).add(right).add(middle);

        return letterA;
    }

    /**
     * TODO
     * Create the letter B graphically
     * 
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        double circleWidth = halfMaxHeight;
        double circleHeight = (maxHeight-stripeThickness)/2;

        BaseShape left = new Rectangle(halfMaxWidth-stripeThickness, maxHeight-stripeThickness);
        BaseShape top = new Ellipse(circleWidth, circleHeight);
        BaseShape bottom = new Ellipse(circleWidth, circleHeight);

        top.remove(new Ellipse(circleWidth-stripeThickness, circleHeight-stripeThickness));
        bottom.remove(new Ellipse(circleWidth-stripeThickness, circleHeight-stripeThickness));

        top = new BaseShape(top.translate(top.getCoords(), new Point2d(0.0, halfMaxHeight / 2)));
        bottom = new BaseShape(
                bottom.translate(bottom.getCoords(), new Point2d(0.0, -(halfMaxHeight) / 2)));
        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-(circleWidth-stripeThickness)/2, 0.0)));

        BaseShape letterB = new BaseShape();
        letterB.add(left).add(top).add(bottom);

        return letterB;
    }

    /**
     * TODO
     * Create the letter C graphically
     * 
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        double a = maxHeight;
        double b = maxWidth;

        BaseShape letterC = new Ellipse(b, a);

        BaseShape removeEllipse = new Ellipse(b / 1.5, a / 1.5);
        BaseShape removeRect = new Rectangle(halfMaxWidth, halfMaxHeight);
        removeRect = new BaseShape(removeRect.translate(removeRect.getCoords(), new Point2d(halfMaxWidth, 0.0)));
        letterC.remove(removeEllipse);
        letterC.remove(removeRect);

        return letterC;
    }

    /**
     * TODO
     * Create the letter E graphically
     * 
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        double width = halfMaxWidth - stripeThickness;
        double height = maxHeight - stripeThickness;

        BaseShape left = new Rectangle(width, height);
        BaseShape top = new Rectangle(height / 2, width);
        BaseShape middle = new Rectangle(height / 2, width);
        BaseShape bottom = new Rectangle(height / 2, width);

        top = new BaseShape(top.translate(top.getCoords(), new Point2d(0.0, height / 2)));
        middle = new BaseShape(middle.translate(middle.getCoords(), new Point2d(0.0, 0.0)));
        bottom = new BaseShape(
                bottom.translate(bottom.getCoords(), new Point2d(0.0, -height / 2)));
        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-halfMaxHeight / 2, 0.0)));

        BaseShape letterE = new BaseShape();
        letterE.add(left);
        letterE.add(top);
        letterE.add(middle);
        letterE.add(bottom);

        return letterE;
    }

    /**
     * TODO
     * Create the letter H graphically
     * 
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        double width = halfMaxWidth - stripeThickness;
        double height = maxHeight - stripeThickness;

        BaseShape left = new Rectangle(width, height);
        BaseShape right = new Rectangle(width, height);
        BaseShape middle = new Rectangle(halfMaxHeight, width);

        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-halfMaxHeight / 2, 0.0)));
        right = new BaseShape(right.translate(right.getCoords(), new Point2d(halfMaxHeight / 2, 0.0)));

        BaseShape letterH = new BaseShape();

        letterH.add(left);
        letterH.add(right);
        letterH.add(middle);

        return letterH;
    }

    /**
     * TODO
     * Create the letter N graphically
     * 
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        double width = halfMaxWidth - stripeThickness;
        double height = maxHeight - stripeThickness;

        BaseShape left = new Rectangle(width, height);
        BaseShape right = new Rectangle(width, height);
        BaseShape middle = new Rectangle(width, maxHeight);

        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-halfMaxHeight / 3, 0.0)));
        right = new BaseShape(right.translate(right.getCoords(), new Point2d(halfMaxHeight / 3, 0.0)));

        middle = new BaseShape(middle.rotate(middle.getCoords(), Math.toRadians(-20)));

        BaseShape letterN = new BaseShape();

        letterN.add(left).add(right).add(middle);

        return letterN;
    }

    /**
     * TODO
     * Create the letter O graphically
     * 
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        double a = maxHeight;
        double b = maxWidth;

        BaseShape letterO = new Ellipse(b, a);

        BaseShape innerEllipse = new Ellipse(b / 1.5, a / 1.5);
        letterO.remove(innerEllipse);

        return letterO;
    }

}
