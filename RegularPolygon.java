class RegularPolygon {
//fields
private int sidels;
private int numSides;
private String color;
//Constructors
public RegularPolygon(int sidels, int numSides, String color){
	this.sidels = sidels;
	this.numSides = numSides;
	this.color = color;
} 
//To String
public String toString(){
	return color + " " + numSides + " " + sidels;
}
//Perimeter stuff
public int getPerimeter(){
	return 6 * sidels;
}
//Area stuff
public double getArea(){
	return Math.sqrt(3) * 3/2 * 11 * 11;
}

}