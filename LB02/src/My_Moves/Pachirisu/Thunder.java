package My_Moves.Pachirisu;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove{
	public Thunder(double pow, double acc) {
		super(Type.ELECTRIC, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		if (0.3 >= Math.random())
			Effect.paralyze(pokemon);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}


}
