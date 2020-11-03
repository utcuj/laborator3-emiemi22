public class Table
{
	private char [][] table = new char [9][9];
	
	public Rook[] whiteRook = new Rook[2];
	public Knight[] whiteKnight = new Knight[2];
	public Bishop[] whiteBishop = new Bishop[2];
	public Pawn[] whitePawn = new Pawn[9];
	
	
	public Rook[] darkRook = new Rook[2];
	public Knight[] darkKnight = new Knight[2];
	public Bishop[] darkBishop = new Bishop[2];
	public Pawn[] darkPawn = new Pawn[9];
	
	public Queen darkQueen = new Queen(8,4);
	public King darkKing = new King(8,5) ; 
	
	public Queen whiteQueen = new Queen(1,4);
	public King whiteKing = new King(1,5) ;
	
	public Table()
	{
		table[1][1] ='T';
		table[1][8] ='T';
		
		table[1][2] ='K';
		table[1][7] ='K';
		
		table[1][6] ='B';
		table[1][3] ='B';
		
		table[1][4] ='Q';
		table[1][5] ='R';
		
		table[8][1] ='T';
		table[8][8] ='T';
		
		table[8][2] ='K';
		table[8][7] ='K';
		
		table[8][6] ='B';
		table[8][3] ='B';
		
		table[8][4] ='Q';
		table[8][5] ='R';
		
		for (int i=2 ; i<=7 ;  i++)
			for(int j=1 ; j<=8 ; j++)
			{
				if (i==2 || i == 7)
				{
					table[i][j]='P';
				}
				else 
					table[i][j]='-';
			}
		
	}
	
	public void printTable()
	{
		System.out.println();
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8;j++)
			{
				System.out.print(table[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
	void initRook()
	{
		whiteRook[0] = new Rook(1,1);
		whiteRook[1] = new Rook(1,8);
		
		darkRook[0] = new Rook(8,1);
		darkRook[1] = new Rook(8,8);
	}
	
	void initBishop()
	{
		whiteBishop[0] = new Bishop(1,3);
		whiteBishop[1] = new Bishop(1,6);
		
		darkBishop[0] = new Bishop(8,3);
		darkBishop[1] = new Bishop(8,6);
	}
	
	void initKnight()
	{
		whiteKnight[0] = new Knight(1,2);
		whiteKnight[1] = new Knight(1,7);
		
		darkKnight[0] = new Knight(8,2);
		darkKnight[1] = new Knight(8,7);
	}
	
	void initPawns()
	{
		for(int i=1 ; i<=8 ; i++)
		{
			whitePawn[i] = new Pawn(2,i);
			darkPawn[i] = new Pawn(7,i);
		}
	}
	
	void movePawn (int k ,int color, int x , int y )
	{
		if (color == 1) // white
		{
			if (whitePawn[k].validMovePawn(x, y) )
			{
				
				this.table[whitePawn[k].getX()][whitePawn[k].getY()] = '-';
				
				whitePawn[k].SetX(x);
				whitePawn[k].SetY(y);
				
				this.table[whitePawn[k].getX()][whitePawn[k].getY()] = 'P';
			}
		}
		else  /// black
		{
			if (darkPawn[k].validMovePawn(x, y) && this.table[x][y] == '-')
			{
				
				this.table[darkPawn[k].getX()][darkPawn[k].getY()] = '-';
				
				darkPawn[k].SetX(x);
				darkPawn[k].SetY(y);
				
				this.table[darkPawn[k].getX()][darkPawn[k].getY()] = 'P';
			}
		}
	}
	
	void moveRook(int k , int color , int x , int y)
	{
		if (color == 1)
		{
			if (whiteRook[k].validMoveRook(x, y))
			{
				this.table[whiteRook[k].getX()][whiteRook[k].getY()] = '-' ;
				
				whiteRook[k].SetX(x);
				whiteRook[k].SetY(y);
				
				this.table[whiteRook[k].getX()][whiteRook[k].getY()] = 'T' ;
				
			}
		}
		else 
		{
			if (darkRook[k].validMoveRook(x, y))
			{
				this.table[darkRook[k].getX()][darkRook[k].getY()] = '-' ;
				
				darkRook[k].SetX(x);
				darkRook[k].SetY(y);
				
				this.table[darkRook[k].getX()][darkRook[k].getY()] = 'T' ;
				
			}
		}
	}
	
	void moveBishop(int k , int color , int x , int y)
	{
		if (color == 1)
		{
			if(whiteBishop[k].validMoveBishop(x, y))
			{
				this.table[whiteBishop[k].getX()][whiteBishop[k].getY()] = '-';
				
				whiteBishop[k].SetX(x);
				whiteBishop[k].SetY(y);
				
				this.table[whiteBishop[k].getX()][whiteBishop[k].getY()] = 'B';
				
			}
		}
		else {
			
			if(darkBishop[k].validMoveBishop(x, y))
			{
				this.table[darkBishop[k].getX()][darkBishop[k].getY()] = '-';
				darkBishop[k].SetX(x);
				darkBishop[k].SetY(y);
				
				this.table[darkBishop[k].getX()][darkBishop[k].getY()] = 'B';
				
			}
		}
		
	}
	
	void moveKnight (int k , int color , int x , int y)
	{
		if (color == 1)
		{
			if(whiteKnight[k].validMoveKnight(x, y))
			{
				this.table[whiteKnight[k].getX()][whiteKnight[k].getY()] = '-';
				whiteKnight[k].SetX(x);
				whiteKnight[k].SetY(y);
				this.table[whiteKnight[k].getX()][whiteKnight[k].getY()] = 'K';
			}
		}
		else 
		{
			if(darkKnight[k].validMoveKnight(x, y))
			{
				this.table[darkKnight[k].getX()][darkKnight[k].getY()] = '-';
				darkKnight[k].SetX(x);
				darkKnight[k].SetY(y);
				this.table[darkKnight[k].getX()][darkKnight[k].getY()] = 'K';
			}
		}
	}
	
	
	void moveQueen(int k , int color , int x , int y)
	{
		if (color == 1 )
		{
			if (whiteQueen.validMoveQueen(x, y))
			{
				this.table[whiteQueen.getX()][whiteQueen.getY()] = '-';
				whiteQueen.SetX(x);
				whiteQueen.SetY(y);
				this.table[whiteQueen.getX()][whiteQueen.getY()] = 'Q';
			}
		}
		else 
		{
			if (darkQueen.validMoveQueen(x, y))
			{
				this.table[darkQueen.getX()][darkQueen.getY()] = '-';
				darkQueen.SetX(x);
				darkQueen.SetY(y);
				this.table[darkQueen.getX()][darkQueen.getY()] = 'Q';
			}
			
		}
	}
	
	
	void moveKing(int l , int color , int x , int y)
	{
		if (color == 1 )
		{
			if (whiteKing.validMoveKing(x, y))
			{
				this.table[whiteKing.getX()][whiteKing.getY()] = '-';
				whiteKing.SetX(x);
				whiteKing.SetY(y);
				this.table[whiteKing.getX()][whiteKing.getY()] = 'R';
			}
		}
		else 
		{
			if (darkKing.validMoveKing(x, y))
			{
				this.table[darkKing.getX()][darkKing.getY()] = '-';
				darkKing.SetX(x);
				darkKing.SetY(y);
				this.table[darkKing.getX()][darkKing.getY()] = 'R';
			}
			
		}
	}
	//TODO implement - check collisons - pieces not allowed to jump over others pieces -> condition in movePiece
	
}
