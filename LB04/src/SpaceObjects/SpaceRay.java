package SpaceObjects;

import java.lang.String;

import Interfaces.Affect;

public class SpaceRay extends SpaceObject implements Affect {
    public SpaceRay(String name, int id){
        super(name, SpaceObjectType.SPACERAY, id);
    }

    @Override
    public String reflect(int otherLight){
        return this.getName() + " отражает свет с силой " + otherLight;
    }

    @Override
    public String light(int light){
        return this.getName() + " светит с силой " + light;
    }

   
    public String GiveAbility(int affect, SpaceObject surface)
    {
    	Affect Affect = new Affect() 
    	{
    		@Override
    		public String affect(int affect, SpaceObject surface){
    		if (surface instanceof Moon && affect > 0) {
    		    return "Поверхность " + surface.getName() + " обладает способностью светиться с силой " + affect;
    		}
    		return "Космические лучи действуют на всех людей на " + surface.getName() + " с силой " + affect;
    		}
    	};
    	return Affect.affect(affect, surface);
    }

	@Override
	public String affect(int affect, SpaceObject surface) {
		// TODO Auto-generated method stub
		return null;
	}

}
