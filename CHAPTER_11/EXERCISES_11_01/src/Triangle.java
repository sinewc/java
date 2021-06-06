
public class Triangle 
		extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
        
        private double x1;
	private double x2;
	private double x3;
        private double y1;
	private double y2;
	private double y3;

	/** Construct default Triangle object */
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	/** Construct a triangle with specified side1, side2 and side3 */
	Triangle(double x1, double y1, double x2,double y2, double x3, double y3) { 
		this.x1 = x1;
                this.y1 = y1;
		this.x2 = x2;
                this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
//                this.side1 =Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
//                this.side2 =Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
//                this.side3 =Math.sqrt(((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)));
	}

	/** Return side1 */
	public double getSide1() { 
            side1 =Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		return side1;
	}

	/** Return side2 */
	public double getSide2() {
            side2 =Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
		return side2;
	}

	/** Return side3 */
	public double getSide3() {
            side3 =Math.sqrt(((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)));
		return side3;
	}

	/** Return area of this triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/** Return perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Return a string description for the triangle */
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}