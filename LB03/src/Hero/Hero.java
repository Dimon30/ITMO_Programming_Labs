package Hero;

public abstract class Hero 
{
	private String name;
	
	public Hero(String name) {
		this.name = name;
		System.out.println(name);
	}
	public void do_smth() {
		System.out.println("Я " + name + " и я что-то делаю...");
	}
}
