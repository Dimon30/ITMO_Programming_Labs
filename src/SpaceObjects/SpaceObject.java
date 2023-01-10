package SpaceObjects;

import Interfaces.Lightable;
import Interfaces.Reflectable;

public abstract class SpaceObject implements Lightable, Reflectable {
    private int brightness;
    private String name;
    private double radius;
    private double mass;
    private int id;
    private SpaceObjectType type;
    private String time;

    public SpaceObject(String name, SpaceObjectType type, int id){
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public SpaceObject(String name, double radius, double mass, SpaceObjectType type, int id, int brightness, String time) {
        this.brightness = brightness;
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.type = type;
        this.id = id;
        this.time = time;
    }

    public String getTime(){
        return this.time;
    }

    public String setTime(String time){
        return this.time = time;
    }

    public String getName(){
        return this.name;
    }

    public void getRadius(){
        System.out.println(this.radius);
    }

    public void getMass(){
        System.out.println(this.mass);
    }

    public void getId(){
        System.out.println(this.id);
    }

    public void getType(){
        System.out.println(this.type);
    }

    public String getBrightness(){
        if (this.brightness < 2) {
            return "темно";
        } else {
            return "светло";
        }
    }
    
    @Override
    public String light(int light){return " ";}

    @Override
    public String reflect(int reflect){return " ";}
    
    @Override
    public int hashCode() {
        return 303030 * this.name.hashCode() - 239;
    }

    @Override
    public String toString() {
        return "Space: {"
                + "SpaceObject name = '" + this.getName() + '\''
                + " I di = " + this.hashCode()
                + '}';
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SpaceObject)) {
            return false;
        }
        SpaceObject spcobj = (SpaceObject) obj;
        return (id == spcobj.id);
    }
}
