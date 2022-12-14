package Hero;

public class Znayka extends Hero
{	
	enum Sex {Male, Female}
	Sex sex = Sex.Male;
	
	public Znayka(String name) {
		super(name, "good");
	}

	@Override
	public String getName() {
		System.out.println(this.name);
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCondition() {
		System.out.println(this.condition);
		return this.condition;
	}

	@Override
	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public void leave() {
		System.out.println(this.name + " ушел");
	}

	@Override
	public void touch(Object object) {
		// TODO Auto-generated method stub
		
	}

}
