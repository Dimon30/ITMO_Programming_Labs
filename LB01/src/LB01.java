/* FILE NAME   : main.java
 * PROGRAMMER  : DS6
 * LAST UPDATE : 14.09.2022
 * PURPOSE     : Main file
 */
public class LB01 
{

	public static void main( String[] args ) 
	{
		short[] c = new short[15];
		float[] x = new float[17];
		double[][] C = new double[8][17];
		
		/* Fill first array */
		for (short i = 19, j = 0; i > 4; --i, ++j)
			c[j] = i;
		
		/* Fill second array */
		for (int i = 0; i < 17; ++i)
			x[i] = (float)(Math.random() * 15.0 - 2);
		
		/* Fill main two dimensional array */
		for (int i = 0; i < 8; ++i)
			for (int j = 0; j < 17; ++j)
			{
				if (c[i] == 19)
					C[i][j] = (Math.pow(Math.pow(Math.E, x[j]), 0.5 * Math.atan((x[j] + 5.5) / 15))) / (0.25 + Math.asin(1 / Math.pow(Math.E, Math.abs(x[j]))));
				else if (c[i] == 5 || c[i] == 9 || c[i] == 15 || c[i] == 17)
					C[i][j] = Math.log(Math.pow(Math.sin(Math.asin(Math.pow(Math.E, -Math.abs(x[j])))), 2));
				else
					C[i][j] = Math.atan(Math.pow(Math.E, Math.cbrt(-1.0 * Math.pow(Math.sin(Math.atan(Math.sin(x[j]))), 2))));
			}
		
		/* Output main array */
		for (int i = 0; i < 8; ++i)
		{
			for (int j = 0; j < 17; ++j)
				System.out.printf("%.2f ", C[i][j]);
			System.out.printf("\n");
		}
		System.out.println("ITMO forever!!!");

	}

}
