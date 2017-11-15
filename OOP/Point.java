public class Point{
	private int x;
	private int y; 

	public Point( int newx, int newy){
		x=newx;
		y=newy;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void setX(int newx){
		x=newx;
	}

	public void setY(int newy){
		y=newy;
	}

	public double distanceTo(Point p){
		double a = p.getX() - this.getX();
		double b = p.getY() - this.getY();

		double c = a*a+b*b;
		return Math.sqrt(c);
	}

	public boolean equals(Point p) {
		return p.getX() == this.getX() && p.getY() == this.getY();
	}
}