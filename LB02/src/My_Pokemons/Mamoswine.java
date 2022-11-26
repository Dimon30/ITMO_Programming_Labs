package My_Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import My_Moves.Mamoswine.*;

public class Mamoswine extends Pokemon{
	public Mamoswine(String name, int level) {
		super(name, level);
		super.setType(Type.ICE, Type.GROUND);
		super.setStats(110.0, 130.0, 80.0, 70.0, 60.0, 80.0);
		
		Rock_Tomb rock_tomb = new Rock_Tomb(60, 95);
		Rock_Slide rock_slide = new Rock_Slide(75, 90);
		Amnesia amnesia = new Amnesia(0, 0);
		Stone_Edge stone_edge = new Stone_Edge(100, 80);
		
		super.setMove(rock_tomb, rock_slide, amnesia, stone_edge);
	}
}
