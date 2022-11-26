package My_Moves.Piloswine;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Rock_Tomb extends PhysicalMove{
	public Rock_Tomb(double pow, double acc) {
		super(Type.ROCK, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		pokemon.addEffect(new Effect().stat(Stat.SPEED, -1));
		
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}


}
