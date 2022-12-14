package Hero;

import Subject.Subject;

public abstract class Hero implements Interface_Hero{
	protected String name;
	protected String condition;
	public double power = 1.0;
	
	public Hero(String name, String condition) {
		this.name = name;
		this.condition = condition;
	}
	public void do_smth() {
		System.out.println("Я " + name + " и я что-то делаю...");
	}
	
	public void free(Subject spaceSuit) {
		System.out.println(this.name + " освободился от " + spaceSuit.getName());
	}
	public void feel(String feeling) {
		this.condition = feeling;
		System.out.println(this.name + " почувствовал " + feeling);
	}
	
	@Override
	// Здесь должно быть сравнение
	public int hashCode() {
		return 239;
	}
	
	public abstract void touch(Object object);
}
