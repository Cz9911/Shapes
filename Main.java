class Main {
  public static void main(String[] args) {
    Circle circle1 = new Circle(50, "Red");
    System.out.println(circle1);
    double c = circle1.getCircumference();
    System.out.printf("circumference = %.2f\n", c);
    double a = circle1.getArea();
    System.out.printf("Area = %.2f", a);
  }
}