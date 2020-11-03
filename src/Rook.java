
public class Rook {
	
	private int x ; 
	private int y; 
	
	public Rook(int x, int y)
	{	 // coordonates
		this.x = x ; 
		this.y = y ;
	}
	
	public int getX()
	{
		return x ; 
	}
	
	public int getY()
	{
		return y ; 
	}
	
	public void SetX(int x) {
		this.x = x ; 
	}
	
	public void SetY(int y) {
		this.y = y ; 
	}
	
	boolean validMoveRook(int x , int y)
	{
		if (x > 8 || x < 1)
			return false ; 
		
		if (y > 8 || y < 1)
			return false ;
		
		if (this.x == x || this.y == y )
			return true ;
		else return false ; 
	}
}
