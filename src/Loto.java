package lab3_poo;
import java.util.Random;


public class Loto 
{
	private int[] numereCastigatoare = new int[6];
	private int [] extragere() 
	{ 
		Random rd = new Random() ;
		
		for (int i=0;i<6 ; i++)
			numereCastigatoare[i] = rd.nextInt(50);
		
		return numereCastigatoare; 
	}
	
	public static void main (String [] args)
	{
		Loto infinity = new Loto();
		int[] numereCastigatoare = infinity.extragere();
		Bilet bilet = new Bilet();
		bilet.citireNumere();
		int[] numereAlese = bilet.getNumere();
		
		
		int count =0 ;
		//for (int i=0;i<6;i++)
			//System.out.printf("%d ",numereCastigatoare[i]) ;
		for (int i=0;i<6;i++)
		{
			for (int j=0;j<6;j++)
				if (numereAlese[i] == numereCastigatoare[j])
					count++;
		}
		if (count == 6)
			System.out.printf("Esti milionar!") ;
		else 
			System.out.printf("Esti nemilionar!") ;
		
	}
}
