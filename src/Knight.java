
public class Knight {
	private int x ; 
	private int y; 
	
	public Knight(int x, int y)
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
	
	boolean validMoveKnight(int x , int y)
	{
		if (x > 8 || x < 1)
			return false ; 
		
		if (y > 8 || y < 1)
			return false ;
		
		int dX = Math.abs(this.x-x) ; 
		int dY = Math.abs(this.y-y);
		if ((dX == 2 && dY == 1)||(dY == 2 && dX == 1) && (dY!=0) &&(dX!=0))
			return true ; 
		else return false ; 
	}
}
