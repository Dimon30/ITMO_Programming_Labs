import Colors.Color;
import SpaceObjects.*;
import Exceptions.SoundException;
import Hero.*;
import Instruments.GeoHammer;
import Instruments.IceAxe;
import Instruments.Instruments;
import Ore.*;
import PlanetObjects.*;
import Sky.Sky;
import Subject.*;
import SpaceObjects.*;

public class LB04 {

	public static void main(String[] args) {
		
		try {
            Earth Earth = new Earth("Земля", 1, 2, 6371, 5.97 * (10 ^ 6), "day");
            Firmament Firmament = new Firmament("Небесный свод", 2);
            Moon Moon = new Moon("Луна", 4, 1, 1737.4, 7.36 * (10 ^ 4), "day");
            Sun Sun = new Sun("Солнце", 5, 50, 696340, 1.99 * (10 ^ 12), "day");
            Constellations Constellations = new Constellations("Созвездие", 6);
            SpaceRay SpaceRay = new SpaceRay("Космический луч", 3);
            Sky Sky = new Sky();
            Cave Cave = new Cave("Пещера", 71, Color.BLACK);
            Rocket Rocket = new Rocket("Ракета", Color.BRIGHTBLUE);
            SpaceSuit SpaceSuit = new SpaceSuit("Скафандр", 70, Color.GREEN);
            Bed Bed = new Bed("Койка");
            Mountains Mountains = new Mountains("Горы", 74, Color.RED);

            Person Person = new Person("Космонавты", Moon, Cave);
            Person.Fuksy Fuksy = Person.new Fuksy("Фукки", Moon, Cave);
            Neznayka Neznayka = new Neznayka("Незнайка", Moon, Cave);
            Znayka Znayka = new Znayka("Знайка", Moon, Cave);
            Person.Seledochka Seledochka = Person.new Seledochka("Селёдочка", Moon, Cave);
            Zvezdochkin Zvezdochkin = new Zvezdochkin("Профессор Звёздочкин", Moon, Cave);
            Person.DoctorPilulkin Pilulkin = Person.new DoctorPilulkin("Доктор Пилюлькин", Moon, Cave);

            // Generating THE ROCK
            Ore lunit = new Lunit("лунит");
            Ore antiLunit = new AntiLunit("антилунит");

            // Generating tools
            Instruments geoHammer = new GeoHammer("геологический молоток");
            Instruments iceAxe = new IceAxe("ледоруб");



            System.out.println(Pilulkin.say(Neznayka.feelBad() + ", поэтому его надо отправить в ракету и освободиться от скафандра"));
            Person.sendTo(Neznayka, Rocket);
            Neznayka.setPlanetLocation(Rocket);
            System.out.println(Neznayka.takeOff(SpaceSuit.getName()));
            System.out.println(Neznayka.putOn("Сандалии"));
            System.out.println(Neznayka.feelGood());

            // check affect() logic
            System.out.println(Person.stay(Cave));
            System.out.println(SpaceRay.affect(0, Moon));

            // journey
            System.out.println(Znayka.goOutside(Cave));
            System.out.println(Znayka.go("Обратный путь"));
            System.out.println(Fuksy.go("Обратный путь"));
            System.out.println(Seledochka.go("Обратный путь"));
            System.out.println(Zvezdochkin.go("Обратный путь"));

            // world's equilibrium
            Person.someone();
            Moon.setTime("night");
            System.out.println("На " + Moon.getName() + " наступила " + Moon.getTime());
            System.out.println("На " + Moon.getName() + " " + Moon.getBrightness());
            System.out.println();
            System.out.println(Moon.light(10) + " на " + Earth.getName());
            System.out.println(Earth.light(10) + "на " + Moon.getName());
            System.out.println();
            System.out.println(Moon.getName() + " размером:");
            Moon.getRadius();
            System.out.println("Кажется небольшой круглой тарелкой в сравнении с размером " + Earth.getName() + ":");
            Earth.getRadius();
            System.out.println();
            System.out.println(Sun.light(300) + " на " + Earth.getName());
            System.out.println(Earth.reflect(90) + " на " + Moon.getName());
            System.out.println(Moon.light(1) + " на " + Earth.getName());
            System.out.println();

            Person.draw("тригон-триоктаэдр");
            Person.write("пентагон-додекаэдр");
            Seledochka.read("reflection API");
            System.out.println(Seledochka.feelBad());

            // check see logic
            Fuksy.see(new Sky(), Firmament);
            Zvezdochkin.see(new Sky(), Constellations);
            Sky.getPicture("Небо было цвета " + Color.BLACK + " и на нём был " + Earth.diskShine() + " цвета " + Color.BRIGHTWHITE + " и " + Color.BRIGHTBLUE);

            // shining
            System.out.println(Mountains.getView());
            System.out.println("Горы были " + Mountains.getColor().getName() + " цвета: от " + Color.LightCherry + " до " + Color.PURPLE + " или " + Color.DARKPURPLE);
            System.out.println("Всё, что оставалось в тени, где " + SpaceRay.affect(0, Earth) + " светилось " + Color.EMERALDGREEN + " цветом");
            System.out.println("Это из-за того, что " + SpaceRay.affect(17, Moon));

            Color.War war = new Color.War();
            System.out.println(war.action(Color.RED, Color.GREEN));
            System.out.println(Rocket.getView());
            System.out.println("Ракета светилась " + Rocket.getColor().getName() + " цветом");

            // toString
            System.out.println("\n" + Fuksy + "\n" + Neznayka);
            System.out.println("\n" + Rocket + "\n" + Cave);

            // let's mine some ore
            Person.mine(Person.everyone(), lunit);
            Person.mine(Neznayka.getName(), antiLunit);
            Person.mine(Pilulkin.getName(), lunit);
            Person.mine(Seledochka.getName(), lunit);
            Person.mine(Zvezdochkin.getName(), antiLunit);
            System.out.println(iceAxe.bang(Mountains));
            System.out.println(geoHammer.bang(Mountains));
            
    		
    		Neznayka.do_smth();
    		
    		Neznayka.free(SpaceSuit);
    		Neznayka.feel("облегчение");
    		Neznayka.want(Bed);
    		Neznayka.changePower(-0.9);
    		Neznayka.hand = "Not movable";
    		Neznayka.leg = "Not movable";
    		Neznayka.checkCondition();
    		
    		Znayka.leave();
    		Neznayka.check_EVM();
    		Zvezdochkin.check_EVM();
    		Rocket.charging();
    		if (SpaceSuit.equals(Rocket))
    			System.out.println("Ракета не полетит");
    		Rocket.check_system();
    		if (Neznayka.hashCode() == Znayka.hashCode())
    			System.out.println("Незнайка кидает Знайку на прогиб.");
    		
    		System.out.println(Neznayka.hashCode());
    		System.out.println(Znayka.hashCode());
    		
    		// exception!!!
            Moon.sound();

        } catch (SoundException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("\nSound exception works, holy moly what a disaster could've happened\n");
        }
	}
	

}
