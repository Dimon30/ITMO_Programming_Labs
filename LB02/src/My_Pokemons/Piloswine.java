package My_Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import My_Moves.Piloswine.*;

public class Piloswine extends Pokemon{
	public Piloswine(String name, int level) {
		super(name, level);
		super.setType(Type.ICE, Type.GROUND);
		super.setStats(100.0, 100.0, 80.0, 60.0, 60.0, 50.0);
		
		Rock_Tomb rock_tomb = new Rock_Tomb(60, 95);
		Rock_Slide rock_slide = new Rock_Slide(75, 90);
		Amnesia amnesia = new Amnesia(0, 0);
		
		super.setMove(rock_tomb, rock_slide, amnesia);
	}
}
