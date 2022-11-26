/* FILE NAME   : LB02.java
 * PROGRAMMER  : DS6
 * LAST UPDATE : 17.11.2022
 * PURPOSE     : Main file
 */

import My_Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
	
public class LB02 
{
	public static void main(String[] args)/* throws UnsupportedEncodingException */ 
	{
		Battle battle = new Battle();
		Mamoswine mamoswine = new Mamoswine("Mamoswine", 1);
		Lycanroc lycanroc = new Lycanroc("Lycanroc", 1);
		Pachirisu pachirisu = new Pachirisu("Pachirisu", 1);
		Piloswine piloswine = new Piloswine("Piloswine", 1);
		Rockruff rockruff = new Rockruff("Rockruff", 1);
		Swinub swinub = new Swinub("Swinub", 1);
		battle.addAlly(mamoswine);
		battle.addAlly(pachirisu);
		battle.addAlly(rockruff);
		
		battle.addFoe(lycanroc);
		battle.addFoe(piloswine);
		battle.addFoe(swinub);
		
		battle.go();
		System.out.println("Ауф");
	}
	
}
