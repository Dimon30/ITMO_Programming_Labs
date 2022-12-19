package Hero;

import Subject.Subject;

public class Zvezdochkin extends Hero{

	public Zvezdochkin(String name) {
		super(name, "good", 70);
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
