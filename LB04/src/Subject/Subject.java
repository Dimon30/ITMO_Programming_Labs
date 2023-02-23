package Subject;

import Colors.Color;
import PlanetObjects.PlanetObject;

public abstract class Subject implements Interface_Subject{
	private int id = (int)Math.random() * 239;
	private String name;
	protected double weight = 1.0; //kg
	public String specification = "Warm";
	private Color color;
	
	public Subject(String name, double weight, Color color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
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
	
	
    public int getId(){return this.id;}

    public String getView() {
        return this.getName() + " виднеется вдали";
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return 1337 * this.name.hashCode() + 94;
    }

    @Override
    public String toString() {
        return "Object: {"
                + "Местонахождение = '" + this.getName() + '\''
                + " Координаты = " + this.hashCode()
                + '}';
    }
	
	
	@Override
	// Здесь должно быть сравнение
	public boolean equals(Object o) {
		Subject sub = (Subject) o;
		return sub.weight == weight;
	}

}
