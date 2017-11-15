public class ColoredPoint extends Point {
	@Override
	public boolean equals(Point p) {
		super.equals(p) && p.color.equals(this.color())
	}
}