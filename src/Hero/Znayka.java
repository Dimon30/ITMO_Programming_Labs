package Hero;

import PlanetObjects.PlanetObject;
import SpaceObjects.SpaceObject;
import Subject.Subject;

public class Znayka extends Hero
{	
	enum Sex {Male, Female}
	Sex sex = Sex.Male;
	
	public Znayka(String name, SpaceObject spcobj, PlanetObject planet) {
		//super(name, "good", 50);
		super(name, spcobj, planet);
	}


	@Override
	public void leave() {
		System.out.println(this.name + " ушел");
	}

	@Override
	public void touch(Subject object) {
		// TODO Auto-generated method stub
		
	}

}
