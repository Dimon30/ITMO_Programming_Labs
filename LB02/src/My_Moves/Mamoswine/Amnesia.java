package My_Moves.Mamoswine;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Amnesia extends StatusMove{
	public Amnesia(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		pokemon.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, 2));
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}


}
