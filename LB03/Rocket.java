package Subject;

public class Rocket extends Subject
{
	private double accumalator = 1.0;
	public Rocket(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	private boolean check_accum() {
		if (accumalator < 1.0)
			return false;
		return true;
		}
	
	public void charging() {
		accumalator = Math.random() - 0.0000001;
		System.out.println("Идет зарядка аккумулятора");
	}
	public void check_system() {
		if (check_lightning() && check_heating() && check_engine())
			System.out.println("Ракета полетит.");
		else
			System.out.println("Ракета не полетит, аккумулятор разряжен.");
	}
	private boolean check_lightning() {
		return check_accum();
	}
	private boolean check_heating() {
		return check_accum();
	}
	private boolean check_engine() {
		return check_accum();
	}
	
}
