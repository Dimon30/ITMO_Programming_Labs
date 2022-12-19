package Hero;

import Subject.Subject;

public class Znayka extends Hero
{	
	enum Sex {Male, Female}
	Sex sex = Sex.Male;
	
	public Znayka(String name) {
		super(name, "good", 50);
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
