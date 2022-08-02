
public class Run {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.width = 10.5;
		r.length = 20.0;
		AreaCalculator a = new AreaCalculator();
		System.out.println(a.calculateShapeArea(r));
		Circle c = new Circle();
		c.radius=1.0;
		System.out.println(a.calculateShapeArea(c));
		
	}

}
