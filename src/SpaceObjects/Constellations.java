package SpaceObjects;

public class Constellations extends SpaceObject{
    public Constellations(String name, int id){
        super(name, SpaceObjectType.CONSTELLATION, id);
    }

    @Override
    public String light(int light) {
        return null;
    }

    @Override
    public String reflect(int otherLight) {
        return null;
    }
}
