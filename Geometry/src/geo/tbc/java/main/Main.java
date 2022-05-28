package geo.tbc.java.main;
import geo.tbc.java.secondary.Rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle();
		obj1.setDimensions(6, 3);
		Rectangle obj2 = new Rectangle();
		obj2.setDimensions(8, 2);
		System.out.println(obj1.compareObjs(obj2));
		
		geo.tbc.java.tertiary.Rectangle obj3 = new geo.tbc.java.tertiary.Rectangle();
		geo.tbc.java.tertiary.Rectangle obj4 = new geo.tbc.java.tertiary.Rectangle();
		geo.tbc.java.tertiary.Rectangle obj5 = new geo.tbc.java.tertiary.Rectangle();
		obj3.setDimensions(12, 6);
		obj4.setDimensions(16, 4);
		System.out.println(obj5.compareObjs(obj3, obj4));
	}

}
