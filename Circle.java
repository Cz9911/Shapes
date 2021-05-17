class Circle {
  //Fields
  private int radius;
  private String color;
  //Constructors
  public Circle(int radius, String color){
    this.color = color;
    this.radius = radius;
  }
  //To String
  public String toString(){
    return color + " " + radius;
  }
  //Circumference calcs
  public double getCircumference(){
    return 2 * Math.PI * radius;
  }
  
  public double getArea(){
    return Math.PI * Math.pow(radius, 2);
  }
}