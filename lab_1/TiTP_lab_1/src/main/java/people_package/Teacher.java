package people_package;

import people_package.chair_package.Chair;

public class Teacher extends AbstractPeople{
    private final Chair chair;

    public Teacher(String name, String patronymic, String lastname, Chair chair, String role) {
        super(name, patronymic, lastname, role);
        this.chair = chair;
    }
    
    public Chair getChair(){
        return chair;
    }
}
