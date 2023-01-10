package SpaceObjects;

public class Firmament extends SpaceObject{
    public Firmament(String name, int id){
        super(name, SpaceObjectType.FIRMAMENT, id);
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
