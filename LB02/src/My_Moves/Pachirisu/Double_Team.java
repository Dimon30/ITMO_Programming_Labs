package My_Moves.Pachirisu;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Double_Team extends StatusMove{
	public Double_Team(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		Effect raise_evasiveness = new Effect().stat(Stat.EVASION, 1);
		pokemon.addEffect(raise_evasiveness);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}

}
