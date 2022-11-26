package My_Moves.Rockruff;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Sand_Attack extends StatusMove{
	public Sand_Attack(double pow, double acc) {
		super(Type.GROUND, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		Effect raise_attack = new Effect().stat(Stat.DEFENSE, -1);
		
		pokemon.addEffect(raise_attack);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}
}
