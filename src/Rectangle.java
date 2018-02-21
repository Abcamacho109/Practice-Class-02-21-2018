
public class Rectangle {
int length;
int width;
	public Rectangle(int length1, int width1) {
		// TODO Auto-generated constructor stub
		length = length1;
		width = width1;
		
	}
public int getArea(){
	int area = length * width;
	return area;
}
public int getPerimeter(){
 int per= 2*(length+width);
	return per;
}
}
