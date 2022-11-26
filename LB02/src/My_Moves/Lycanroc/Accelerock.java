package My_Moves.Lycanroc;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Accelerock extends PhysicalMove
{
	public Accelerock(double pow, double acc) 
	{
		super(Type.ROCK, pow, acc);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}
}
