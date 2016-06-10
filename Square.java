public class Square extends DrawableShape {
	public static int side;
	public String color;
	
	public Square(int sideLength) {
		side = sideLength;
		}
		
	public void setColor(String c) {
		color = c;
		}
	public String getColor() {
		return color;
		}
		
	public int getArea() {
		return side * side;
		}
	public int getPerimeter() {
		return getArea() * 2;
		}		
		
	public static void drawTop() {
		System.out.print(" ");
		for (int x = 0; x < side; x++) {
			System.out.print("_");
			}
		System.out.println();	
		}
	public static void drawSides() {
		for (int x = 0; x < side; x++) {
			System.out.print("|");
			for (int y = 0; y < side; y++) {
				System.out.print(" ");
				}
			System.out.print("|");
			System.out.println();	
			}
		}		

	public static void main(String[] args) {
		Square demo = new Square(4);
		demo.drawTop();
		demo.drawSides();
		demo.drawTop();
		}		
	}
