package Hero;

public class Neznayka extends Hero{

	public String hand, leg;
	public Neznayka(String name) {
		super(name, "good");
	}

	@Override
	public String getName() {
		System.out.println(this.name);
		return this.name;
	}

	public void check_EVM() {
		System.out.println(this.name + " проверяет работу ЭВМ.");
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void touch(Object object) {
		// TODO Auto-generated method stub
		
	}

	

}
