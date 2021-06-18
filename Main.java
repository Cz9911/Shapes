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
	RegularPolygon pentagon = new RegularPolygon(5, 13, "Red");
    System.out.println(pentagon);
    double a5 = pentagon.getArea(); 
	System.out.printf("Area = %.2f\n", a5);
	int p4 = pentagon.getPerimeter();
	System.out.printf("Perimeter = %d\n", p4);
	//decagon
	RegularPolygon decagon = new RegularPolygon(10, 68, "Red");
    System.out.println(decagon);
    double a6 = decagon.getArea(); 
	System.out.printf("Area = %.2f\n", a6);
	int p5 = decagon.getPerimeter();
	System.out.printf("Perimeter = %d\n", p5);
	//octagon
	RegularPolygon octagon = new RegularPolygon(8, 873, "Red");
    System.out.println(octagon);
    double a7 = octagon.getArea(); 
	System.out.printf("Area = %.2f\n", a7);
	int p6 = octagon.getPerimeter();
	System.out.printf("Perimeter = %d\n", p6);
	//Heptagon (7 sides.)
	RegularPolygon heptagon = new RegularPolygon(7, 73, "Purple");
    System.out.println(heptagon);
    double a8 = heptagon.getArea(); 
	System.out.printf("Area = %.2f\n", a8);
	int p7 = heptagon.getPerimeter();
	System.out.printf("Perimeter = %d\n", p7);
	//Nonagon (9 sides)
	RegularPolygon nonagon = new RegularPolygon(9, 16, "Purple");
    System.out.println(nonagon);
    double a9 = nonagon.getArea(); 
	System.out.printf("Area = %.2f\n", a9);
	int p8 = nonagon.getPerimeter();
	System.out.printf("Perimeter = %d\n", p8);
  }
}