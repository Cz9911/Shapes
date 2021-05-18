class Main {
  public static void main(String[] args) {
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
    double p = traingle1.getPerimeter();
    System.out.printf("Perimeter = %.2f\n", p)
    
  }
}