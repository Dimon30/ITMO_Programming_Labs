package My_Moves.Pachirisu;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Defense_Curl extends StatusMove{
	public Defense_Curl(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		Effect raise_defence = new Effect().stat(Stat.DEFENSE, 1);
		pokemon.addEffect(raise_defence);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}

}
