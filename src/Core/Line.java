package Core;

public class Line {
	Point start;
	Point end;

	Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	public Point getStart(){
		return this.start;
	}
	public Point getEnd(){
		return this.end;
	}
}
