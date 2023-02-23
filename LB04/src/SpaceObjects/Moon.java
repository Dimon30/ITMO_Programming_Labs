package SpaceObjects;

import Exceptions.SoundException;
import Interfaces.Sound;

public class Moon extends SpaceObject implements Sound{
    public Moon(String name, int id, int brightness, double radius, double mass, String time){
        super(name, radius, mass, SpaceObjectType.SATELLITE, id, brightness, time);
    }

    @Override
    public String reflect(int otherLight){
        return this.getName() + " отражает свет с силой " + otherLight;
    }

    @Override
    public String light(int light){
        return this.getName() + " светит с силой " + light;
    }

    //TODO
    // Think about sound logic, you idiot, maybe create something more creative, for god's sake!

    @Override
    public void sound() throws SoundException{
        throw new SoundException("Oops... Not exists sound in open space...");
    }

}
