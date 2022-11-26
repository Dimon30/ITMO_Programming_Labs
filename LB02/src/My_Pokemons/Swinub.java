package My_Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import My_Moves.Swinub.*;

public class Swinub extends Pokemon{
	public Swinub(String name, int level) {
		super(name, level);
		super.setType(Type.ICE, Type.GROUND);
		super.setStats(50.0, 50.0, 40.0, 30.0, 30.0, 50.0);
		
		Rock_Tomb rock_tomb = new Rock_Tomb(60, 95);
		Rock_Slide rock_slide = new Rock_Slide(75, 90);
		
		super.setMove(rock_tomb, rock_slide);
	}
}
