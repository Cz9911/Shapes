class Main {
  public static void main(String[] args) {
    //Circle stuff
		Circle circle1 = new Circle(50, "Red");
    System.out.println(circle1);
    double c = circle1.getCircumference();
    System.out.printf("circumference = %.2f\n", c);
    double a = circle1.getArea();
    System.out.printf("Area = %.2f\n", a);
    //Triangle stuff
    Triangle traingle1 = new Triangle(27, "Blue");
    System.out.println(traingle1);
    double a2 = traingle1.getArea();
    System.out.printf("Area = %.2f\n", a2);
    int p = traingle1.getPerimeter();
    System.out.printf("Perimeter = %d\n", p);
	//Square stuff
	Square square1 = new Square(15, "Yellow");
	System.out.println(square1);
	int a3 = square1.getArea();
	System.out.printf("Area = %d\n", a3);
	int p2 = square1.getPerimeter();
	System.out.printf("Perimeter = %d\n", p2);
    //Hexagons
	RegularPolygon hexagon = new RegularPolygon(11, 6, "Red");
    System.out.println(hexagon);
    double a4 = hexagon.getArea(); 
	System.out.printf("Area = %.2f\n", a4);
	int p3 = hexagon.getPerimeter();
	System.out.printf("Perimeter = %d\n", p3);
	//Pentagons
	
  }
}