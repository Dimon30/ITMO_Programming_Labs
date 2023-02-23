package Subject;

import Colors.Color;
import Exceptions.WeightException;

public class Rocket extends Subject
{
	private double accumalator = 1.0;

	public Rocket(String name, Color color) {
        super(name, 100000, color);
    }
	
	private boolean check_accum() {
		if (accumalator < 1.0)
			return false;
		return true;
		}
	
	public void charging() {
		accumalator = Math.random() - 0.0000001;
		System.out.println("Ракета не могла отправиться в полет до тех пор, пока не закончится зарядка аккумуляторов, \r\n"
				+ "от которых зависела исправная работа всех осветительных и отопительных приборов, а также двигателей.\r\n"
				+ "");	
	}
	public void check_system() {
		if (check_lightning() && check_heating() && check_engine())
			System.out.println("Ракета полетит.");
		else
			System.out.println("Ракета не полетит.");
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
	
	public double getWeight(){
        return this.weight;
    }

    public void setWeight(int weight) throws WeightException {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new WeightException("Not exist objects with negative or null mass");
        }
    }

	@Override
	public String touchable(String specification) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
