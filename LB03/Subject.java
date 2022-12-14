package Subject;

public class Subject implements Interface_Subject{
	private String name;
	private double weight = 1.0; //kg
	public String specification;
	
	public Subject(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getSpecification() {
		return this.specification;
	}

	@Override
	public void setSpecification(String specificaion) {
		this.specification = specificaion;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	// Здесь должно быть сравнение
	public int hashCode() {
		return 239;
	}

}
