package My_Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import My_Moves.Pachirisu.*;

public class Pachirisu extends Pokemon{
	public Pachirisu(String name, int level) {
		super(name, level);
		super.setType(Type.ELECTRIC);
		super.setStats(60.0, 45.0, 70.0, 45.0, 90.0, 95.0);
		
		Defense_Curl defence_curl = new Defense_Curl(0, 0);
		Thunder thunder = new Thunder(110, 70);
		Thunderbolt thubderbolt = new Thunderbolt(90, 100);
		Double_Team double_team = new Double_Team(0, 0);
		
		super.setMove(defence_curl, thunder, thubderbolt, double_team);
	}
}
