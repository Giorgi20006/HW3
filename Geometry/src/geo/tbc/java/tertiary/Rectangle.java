package geo.tbc.java.tertiary;

public class Rectangle {
	int length;
	int width;
	
	public void setDimensions(int length, int width) {
		this.length = length;
		this.width = width;
	}
	protected int getPerimeter() {
		return (length + width)*2;
	}
	
	public int compareObjs(Rectangle rect1Obj,Rectangle rect2Obj) {
		int x = 0;
		int per1 = rect1Obj.getPerimeter();
		int per2 = rect2Obj.getPerimeter();
		
		if(per1>per2)
		{
			x += 1;
		}
		else if (per1<per2)
		{
			x += 1;
		}
		return x;
	}
	
	
}
