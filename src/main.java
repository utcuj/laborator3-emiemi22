public class main 
{
	public static void main(String[] args)
	{
		Table chessTable = new Table();
		chessTable.printTable();
		
		chessTable.initRook();
		chessTable.initKnight();
		chessTable.initBishop();
		chessTable.initPawns();
		
		chessTable.movePawn(4, 1, 3, 4);
		chessTable.printTable();
		
		chessTable.movePawn(4, 1, 4, 4);
		chessTable.printTable();
		
		chessTable.movePawn(4,0,5,4);
		chessTable.printTable();
		
		chessTable.moveBishop(0, 1, 3, 5);
		chessTable.printTable();
		
		chessTable.moveBishop(0, 0, 5, 6);
		chessTable.printTable();
		
		chessTable.moveQueen(0, 1, 3, 4);
		chessTable.printTable();
		
		chessTable.moveQueen(0, 0, 6, 4);
		chessTable.printTable();
		
		chessTable.moveKing(0, 1, 1, 4);
		chessTable.printTable();
		
		chessTable.moveKing(0, 0, 8, 4);
		chessTable.printTable();
		
		
		
	}
}