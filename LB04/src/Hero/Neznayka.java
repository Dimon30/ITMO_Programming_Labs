package Hero;

import PlanetObjects.PlanetObject;
import SpaceObjects.SpaceObject;
import Subject.Subject;

public class Neznayka extends Hero{

	public String hand, leg;
	public Neznayka(String name, SpaceObject spcobj, PlanetObject planet) {
		//super(name, "good", 60);
		super(name, spcobj, planet);
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
