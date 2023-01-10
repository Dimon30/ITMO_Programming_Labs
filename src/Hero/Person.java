package Hero;

import PlanetObjects.PlanetObject;
import SpaceObjects.SpaceObject;
import Subject.Subject;

public class Person extends Hero{

	public Person(String name, SpaceObject spaceLocation, PlanetObject planetLocation) {
		super(name, spaceLocation, planetLocation);
		// TODO Auto-generated constructor stub
	}

	public class Fuksy extends Hero {
        public Fuksy(String name, SpaceObject spaceLocation, PlanetObject planetLocation) {
            super(name, spaceLocation, planetLocation);
            System.out.println(name + " появился на свет");
        }

		@Override
		public void leave() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void touch(Subject object) {
			// TODO Auto-generated method stub
			
		}
    }
    public class Seledochka extends Hero {
        public Seledochka(String name, SpaceObject spaceLocation, PlanetObject planetLocation) {
            super(name, spaceLocation, planetLocation);
            System.out.println(name + " появился на свет");
        }

		@Override
		public void leave() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void touch(Subject object) {
			// TODO Auto-generated method stub
			
		}
    }
    public class DoctorPilulkin extends Hero {
        public DoctorPilulkin(String name, SpaceObject cosmicLocation, PlanetObject planetLocation) {
            super(name, cosmicLocation, planetLocation);
            System.out.println(name + " появился на свет");
        }

		@Override
		public void leave() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void touch(Subject object) {
			// TODO Auto-generated method stub
			
		}
    }
    
	
	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void touch(Subject object) {
		// TODO Auto-generated method stub
		
	}

}
