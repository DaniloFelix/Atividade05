package atividade2;


public class MyCircle {
	
	private MyPoint center;
	private int radius = 1;
	
	public MyCircle(int x, int y, int radius) {
		
		center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	public MyPoint getCenter() {
		return this.center;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getCenterX() {
		return this.center.getX();
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setXY(x, y);
	}
	
	public String toString() {
		 String str = String
		.format("Circle @ (%s, %s) radius=%s; area=%s",
		this.center.getX(), this.center.getY(), this.radius, 3.14*(this.radius*this.radius) ); 
		 return str;
	}
	
	public double getArea() {
		return 3.14*(this.radius*this.radius);
	}

}
