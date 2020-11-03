
public class Bishop {

	private int x ; 
	private int y; 
	
	public Bishop(int x, int y)
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
	
	boolean validMoveBishop(int x , int y)
	{
		if (x > 8 || x < 1)
			return false ; 
		
		if (y > 8 || y < 1)
			return false ;
		
		int dX = Math.abs(this.x-x) ; 
		int dY = Math.abs(this.y-y);
		if (dX == dY)
			return true ; 
		else return false ; 
	}
}