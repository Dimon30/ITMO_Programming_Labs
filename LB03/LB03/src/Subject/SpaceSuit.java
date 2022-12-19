package Subject;

public class SpaceSuit extends Subject{

	public SpaceSuit(String name, double weight) {
		super(name, weight);
	}
	

	@Override
	public String touchable(String specifiation) {
		// TODO Auto-generated method stub
		return this.specification;
	}

}
