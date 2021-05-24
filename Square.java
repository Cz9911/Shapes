class Square {
//Fields
private int sidels;
private String color;
//Constructors
public Square (int sidels, String color){
	this.sidels = sidels;
	this.color = color;
}
//To String
public String toString(){
	return color + " " + sidels;
}
//Area calcs
public int getArea(){
	return sidels * sidels;
}
//Perimeter calcs
public int getPerimeter(){
	return sidels * 4;
}
}