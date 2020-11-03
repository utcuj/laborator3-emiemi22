
public class Pawn 
{
	private int x ; 
	private int y; 
	
	public Pawn(int x, int y)
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
	
	boolean validMovePawn(int x , int y)
	{
		if (x > 8 || x < 1)
			return false ; 
		
		if (y > 8 || y < 1)
			return false ;
		
		if (this.x == 1 )
		{
			if ((this.y - y) == 0 && ((this.x-x)==-1 || (this.x-x) == -2 ))
			{
				return true ; 
			}
			else return false ; 
		}
		
		if(this.x==7)
		{
			if ((this.y - y) == 0 && ((this.x-x)==1 || (this.x-x) == 2 ))
			{
				return true ; 
			}
			else return false ;
		}
		
		
		if ((this.y - y) == 0 && (Math.abs(this.x-x)==1))
				{
					return true ; 
				}
		else return false ; 
	}
}
