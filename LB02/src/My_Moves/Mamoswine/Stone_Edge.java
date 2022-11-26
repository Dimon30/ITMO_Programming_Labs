package My_Moves.Mamoswine;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Stone_Edge extends PhysicalMove{
	public Stone_Edge(double pow, double acc) {
		super(Type.ROCK, pow, acc);
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		return 1d / 8d;
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}


}
