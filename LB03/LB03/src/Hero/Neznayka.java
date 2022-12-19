package Hero;

import Subject.Subject;

public class Neznayka extends Hero{

	public String hand, leg;
	public Neznayka(String name) {
		super(name, "good", 60);
	}
	
	public void check_EVM() {
		System.out.println(this.name + " проверяет работу ЭВМ.");
	}

	public void want(Subject sub)
	{
		System.out.println(this.name + " порывался встать с " + sub.getName());
	}
	
	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void touch(Subject object) {
		// TODO Auto-generated method stub
		
	}

	public void checkCondition() {
		System.out.println("Слабость наступила такая, что трудно пошевелить рукой или ногой");
		
	}

	

}
