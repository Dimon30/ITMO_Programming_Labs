/* FILE NAME   : Lycanroc.java
 * PROGRAMMER  : DS6
 * LAST UPDATE : 17.11.2022
 * PURPOSE     : Properties 'Lycanroc'
 */

package My_Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import My_Moves.Lycanroc.*;

public class Lycanroc extends Pokemon 
{
	public Lycanroc(String name, int level) {
		super(name, level);
		super.setType(Type.ROCK);
		super.setStats(75.0, 115.0, 65.0, 55.0, 65.0, 112.0);
		
		Accelerock accelerock = new Accelerock(40, 100);
		Swagger swagger = new Swagger(0, 85);
		Sand_Attack sand_attack = new Sand_Attack(0, 100);
		Howl howl = new Howl(0, 0);
		
		super.setMove(accelerock, swagger, sand_attack, howl);
	}
}
