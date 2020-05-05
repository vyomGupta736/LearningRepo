package List;

public class Pair<X,Y> {
	
	X x;
	Y y;
	
	Pair(X x, Y y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void description()
	{
		System.out.println(this.x+" "+this.y);
	}

}
