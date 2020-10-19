package lab3_poo;

import java.util.Scanner;

public class Bilet 
{
	private int[] numereBilet = new int [6];
	
	public void citireNumere ()
	{
		Scanner scanner = new Scanner (System.in);
		for (int i=0 ; i<6 ; i++)
		{
			System.out.println("Introduceti numarul "+(i+1));
			numereBilet[i] = scanner.nextInt();
		}
	}
	
	
	public int[] getNumere() {
		return numereBilet ; 
	}
	
}
