package My_Moves.Mamoswine;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Rock_Slide extends PhysicalMove{
	public Rock_Slide(double pow, double acc) {
		super(Type.ROCK, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		if (0.3 >= Math.random())
			Effect.flinch(pokemon);;
		
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}


}
