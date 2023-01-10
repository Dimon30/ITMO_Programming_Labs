package Sky;

import Interfaces.Viewable;
import SpaceObjects.*;

public class Sky implements Viewable {
    public Sky() {
        System.out.println("Генерация атмосферы");
    }

    public String getView(SpaceObject viewPoint){
        return viewPoint.getName();
    }

    public String getPicture(String picture) {
        return picture;
    }
}
