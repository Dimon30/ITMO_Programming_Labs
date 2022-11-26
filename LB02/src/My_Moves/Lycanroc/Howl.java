package My_Moves.Lycanroc;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Howl extends StatusMove{
	public Howl(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		Effect raise_attack = new Effect().stat(Stat.ATTACK, 1);
		
		pokemon.addEffect(raise_attack);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}
}
