class RegularPolygon {
//fields
private int apothem;
private int numSides;
private String color;
//Constructors
public RegularPolygon(int apothem, int numSides, String color){
	this.apothem = apothem;
	this.numSides = numSides;
	this.color = color;
} 
//To String
public String toString(){
	return color + " " + numSides + " " + apothem;
}
//Perimeter stuff
public int getPerimeter(){
	return numSides * apothem;
}
//Area stuff
public double getArea(){
	return Math.sqrt(3) * 3/2 * apothem * apothem;
}

}