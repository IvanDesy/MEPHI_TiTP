package people_package;

public class Student extends AbstractPeople{
    private final String group;
    private final String role = "Student";
    
    public Student(String name, String patronymic, String lastname, String group, String role) {
        super(name, patronymic, lastname, role);
        this.group = group;
        
    }
    public String getGroup(){
        return group;
    }
    public String getRole(){
        return role;
    }
    
}
