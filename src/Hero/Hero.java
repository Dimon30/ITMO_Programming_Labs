package Hero;

import Interfaces.Imagine;
import Interfaces.Viewable;
import Ore.Ore;
import PlanetObjects.PlanetObject;
import SpaceObjects.*;
import Subject.Rocket;
import Subject.Subject;

public abstract class Hero implements Interface_Hero
{
	private int id = (int)(Math.random()*1000);
	protected String condition;
	private double power = 1.0, weight;
	protected String name;
    private SpaceObject spaceLocation;
    private PlanetObject planetLocation;
    private Rocket rocketLocation;
    private boolean escapeFlag = false;
    private boolean flagLunit = false;
    private boolean flagAntiLunit = false;

	
	public Hero(String name, String condition, double weight) {
		this.name = name;
		this.condition = condition;
		this.weight = weight;
	}
    public Hero(String name, SpaceObject spaceLocation, PlanetObject planetLocation) {
        this.name = name;
        this.spaceLocation = spaceLocation;
        this.planetLocation = planetLocation;
    }

    public String getName() {
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
	
    public String getCosmicLocation() {
        return this.spaceLocation.getName();
    }
    public String getPlanetLocation(){ return this.planetLocation.getName();}
    public void setSpaceLocation(SpaceObject spaceLocation) {
        System.out.println(this.getName() + " переместился c " + this.spaceLocation + " на " + spaceLocation);
        this.spaceLocation = spaceLocation;
    }
    public void setPlanetLocation(PlanetObject planetLocation) {
        System.out.println(this.getName() + " переместился c " + this.planetLocation.getName() + " на " + planetLocation.getName());
        this.planetLocation = planetLocation;
        if (!escapeFlag) {
            System.out.println("Получено достижение 'Идеальный побег'");
            escapeFlag = true;
        }
    }
    public void setPlanetLocation(Rocket rocketLocation) {
        System.out.println(this.getName() + " переместился c " + this.planetLocation.getName() + " на " + planetLocation.getName());
        this.rocketLocation = rocketLocation;
        if (!escapeFlag) {
            System.out.println("Получено достижение 'Идеальный побег'");
            escapeFlag = true;
        }
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
    public void see(Viewable target, SpaceObject viewPoint) {
        System.out.println(this.name + " увидел " + target.getView(viewPoint));
    }
    public void read(String text) {
        System.out.println(this.name + " прочитал " + text);
    }
    public void write(String text) {
        System.out.println(this.name + " написал " + text);
    }
    public void draw(String figure) {
        System.out.println(this.name + " нарисовал " + figure);
    }
    public String feelBad() {
        return this.getName() + " плохо себя чувствует";
    }
    public String feelGood() {
        return this.getName() + " хорошо себя чувствует";
    }
    public String say(String speech) {
        return this.getName() + " сказал: " + speech;
    }
    public String takeOff(String objectName) {
        return this.getName() + " снял с себя " + objectName;
    }
    public String putOn(String objectName) {
        return this.getName() + " надел на себя " + objectName;
    }
    public String stay(PlanetObject place) {
        return this.getName() + " остался в " + place.getName();
    }
    public String goOutside(PlanetObject place) {
        return this.getName() + " вышел из " + place.getName();
    }
    public String go(String place) {
        return this.getName() + " отправился в " + place;
    }

    public String everyone() {
        return "Все";
    }
    public static void someone() {
        Imagine someone = new Imagine() {
            @ Override
            public void imagine() {
                System.out.println("Кто-то воображает");
            }
        };
        someone.imagine();
    }
    public String sendTo(Hero hero, PlanetObject destination) {
        return hero.getName() + " отправляет в " + destination.getName();
    }
    public String sendTo(Hero hero, Rocket destination) {
        return hero.getName() + " отправляет в " + destination.getName();
    }
    public void mine(String per, Ore someOre) {
        System.out.println(per + " принялся за добычу " + someOre.getType());
        if (!flagLunit && someOre.getType() == "лунит") {
            flagLunit = true;
            System.out.println("Получено достижение 'АЛМАЗЫ!'");
        }
        if (!flagAntiLunit && someOre.getType() == "антилунит") {
            flagAntiLunit = true;
            System.out.println("Получено достижение 'Две стихии'");
        }
    }


    
    @Override
    public int hashCode() {
        return 1000 * this.name.hashCode() - 7;
    }
    @Override
    public String toString() {
        return "Human: {"
                + "ASStronaut name = '" + this.getName() + '\''
                + " id = " + this.hashCode()
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Hero)) {
            return false;
        }
        Hero chel = (Hero) obj;
        return (id == chel.id);
    }
	@Override
	// Здесь должно быть сравнение
	public int hashCode(Hero hero) {
		int result = id + (int)weight + (int)power;
		return result;
	}
	
	public abstract void touch(Subject object);
}
