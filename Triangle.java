class Triangle extends RegularPolygon{
  //Fields
  //Constructors
  public Triangle(int sideLs, String color){
    super(sideLs, 3, color);
   
  } 
  //toString 
  @Override
  public String toString(){
    return this.getColor() + " Triangle " + this.getSideLs();
  }
  
}
