package My_Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import My_Moves.Rockruff.*;

public class Rockruff extends Pokemon{
	public Rockruff(String name, int level) {
		super(name, level);
		super.setType(Type.ROCK);
		super.setStats(45.0, 65.0, 40.0, 30.0, 40.0, 60.0);
		
		Swagger swagger = new Swagger(0, 85);
		Sand_Attack sand_attack = new Sand_Attack(0, 100);
		Howl howl = new Howl(0, 0);
		
		super.setMove(swagger, sand_attack, howl);
	}
}
