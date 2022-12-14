import Hero.*;
import Subject.*;

public class LB03 {

	public static void main(String[] args) {
		
		System.out.println("Освободившись от тяжелого скафандра, Незнайка почувствовал некоторое облегчение и даже порывался встать с койки, \nно постепенно силы снова покинули его. Слабость наступила такая, что ему трудно было пошевелить рукой или ногой. \nЗнайка ушел, и они вместе со Звездочкиным занялись проверкой работы электронной вычислительной машины. Через несколько \nчасов все механизмы были проверены, но ракета не могла отправиться в полет до тех пор, пока не закончится зарядка аккумуляторов, \nот которых зависела исправная работа всех осветительных и отопительных приборов, а также двигателей.");
		Neznayka Neznayka = new Neznayka("Незнайка");
		Znayka Znayka = new Znayka("Знайка");
		Zvezdochkin Zvezdochkin = new Zvezdochkin("Звездочкин");
		Subject SpaceSuit = new Subject("Скафандр");
		Rocket Rocket = new Rocket("Ракета");
		
		Neznayka.do_smth();
		
		Neznayka.free(SpaceSuit);
		Neznayka.feel("облегчение");
		Neznayka.power -= 1.0;
		Neznayka.hand = "Not movable";
		Neznayka.leg = "Not movable";
		
		Znayka.leave();
		Neznayka.check_EVM();
		Zvezdochkin.check_EVM();
		Rocket.charging();
		Rocket.check_system();
	}

}
