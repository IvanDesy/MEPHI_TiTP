package Storage_package;

import java.util.ArrayList;
import people_package.chair_package.Chair;

public class StorageChair {
    public ArrayList<Chair> chairs = new ArrayList<Chair>();
    public void addChair(Chair chair){
        chairs.add(chair);
    }
}
