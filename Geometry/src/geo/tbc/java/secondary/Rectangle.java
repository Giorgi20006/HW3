package geo.tbc.java.secondary;


public class Rectangle {
	int length;
	int width;
	
	public void setDimensions(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	protected int getPerimeter() {
		int perimeter = (length+width)*2;
		return perimeter;
	}
	
	protected int getArea() {
		int area = length*width;
		return area;
	}
	public int compareObjs(Rectangle rectObj1) {
		int area1 = rectObj1.getArea();
		int area2 = this.getArea();
		int x = 0;
		
		if(area1 > area2){
			x += 1;
		}
		else if(area1<area2) {
			x -=1;
		}
		return x;
	}
}

