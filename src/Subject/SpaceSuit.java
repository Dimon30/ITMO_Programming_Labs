package Subject;

import Colors.Color;
import Exceptions.WeightException;

public class SpaceSuit extends Subject{
	Color color;
	

	public SpaceSuit(String name, double weight, Color color) {
		super(name, weight, color);
	}

	public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws WeightException {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new WeightException("Not exist objects with negative or null mass");
        }
    }
	
	@Override
	public String touchable(String specifiation) {
		// TODO Auto-generated method stub
		return this.specification;
	}

}
