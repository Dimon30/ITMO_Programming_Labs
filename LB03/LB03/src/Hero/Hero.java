package Hero;

import Subject.Subject;

public abstract class Hero implements Interface_Hero{
	protected String name;
	protected String condition;
	private double power = 1.0, weight;
	
	public Hero(String name, String condition, double weight) {
		this.name = name;
		this.condition = condition;
		this.weight = weight;
	}

	public void do_smth() {
		System.out.println("Я " + name + " и я что-то делаю...");
	}
	
	public void free(Subject spaceSuit) {
		if (this.power * this.weight / spaceSuit.getWeight() >= 0.25)
			System.out.println(this.name + " освободился от " + "тяжелого " + spaceSuit.getName() + "a");
		else
			System.out.println(this.name + " освободился от " + "легкого " + spaceSuit.getName() + "a");
	}
	public void feel(String feeling) {
		this.condition = feeling;
		System.out.println(this.name + " почувствовал " + feeling);
	}
	public String getName() {
		System.out.println(this.name);
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCondition() {
		System.out.println(this.condition);
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public double getPower() {
		return this.power;
	}
	
	public void changePower(double dif)
	{
		this.power += dif;
		if (dif < 0)
			System.out.println("Силы покинули " + this.name);
	}
	
	
	@Override
	// Здесь должно быть сравнение
	public int hashCode() {
		return 239;
	}
	
	public abstract void touch(Subject object);
}
