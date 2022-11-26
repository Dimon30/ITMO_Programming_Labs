package My_Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends PhysicalMove{
	public SampleMove(double pow, double acc) 
	{
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}
}
