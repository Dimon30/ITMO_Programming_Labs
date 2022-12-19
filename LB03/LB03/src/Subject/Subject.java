package Subject;

public abstract class Subject implements Interface_Subject{
	private String name;
	private double weight = 1.0; //kg
	public String specification = "Warm";
	
	public Subject(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return this.specification;
	}

	public void setSpecification(String specificaion) {
		this.specification = specificaion;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	// Здесь должно быть сравнение
	public int hashCode() {
		return 239;
	}

}
