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
	return numSides * sidels;
}
//Area stuff
public double getArea(){
	return 0.5 * this.getApothem() * this.getPerimeter();
}
//apothem stuff
public double getApothem(){
	return 1.0 * sidels / (2 * Math.tan(Math.toRadians(180.0 / numSides)));
}

}