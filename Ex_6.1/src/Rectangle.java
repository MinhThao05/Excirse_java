
public class Rectangle extends Shape{
	private double width = 1.0;
	private double length = 1.0;
	public Rectangle() {
	}
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	double getArea() {
		return width*length;
	}
	@Override
	double getPerimeter() {
		return (width+length)*2;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	

}
