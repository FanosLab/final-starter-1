public class Point{
private int x;
private int y;
// constructor
	public Point(int a, int b ){
		set ( a, b );
	}
//mutator method	
	public void set (int a , int b) {
		this.x = a; 
		this.y = b;
	}
//accessor methods

	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
}