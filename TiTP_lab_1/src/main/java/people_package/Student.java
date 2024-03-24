package people_package;

public class Student extends AbstractPeople{
    private final String group;
    public Student(String name, String patronymic, String lastname, String group) {
        super(name, patronymic, lastname);
        this.group = group;        
    }
    public String getGroup(){
        return group;
    }
    
}
