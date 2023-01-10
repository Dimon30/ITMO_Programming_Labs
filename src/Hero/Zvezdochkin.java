package Hero;

import PlanetObjects.PlanetObject;
import SpaceObjects.SpaceObject;
import Subject.Subject;

public class Zvezdochkin extends Hero{

	public Zvezdochkin(String name, SpaceObject spcobj, PlanetObject planet) {
		//super(name, "good", 70);
		super(name, spcobj, planet);
	}
	
	public void check_EVM() {
		System.out.println(this.name + " проверяет работу ЭВМ.");
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void touch(Subject object) {
		// TODO Auto-generated method stub
		
	}

}
