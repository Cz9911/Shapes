class Triangle{
  //Fields
  private int sideLs;
  private String color;
  //Constructors
  public Triangle(int sideLs, String color){
    this.color = color;
    this.sideLs = sideLs;
  } 
  //toString
  public String toString(){
    return color + " " + sideLs;
  }
  public double getArea(){
    return Math.sqrt(3) / 4 * Math.pow(sideLs, 2);
  }
  public double getPerimeter(){
    return sideLs * 3;
  }
}