package people_package;

public abstract class AbstractPeople {
    private final String name;
    private final String patronymic;
    private final String lastname;
    private final String role;
    
    AbstractPeople(String name, String patronymic, String lastname, String role){
        this.name = name;
        this.patronymic = patronymic;
        this.lastname = lastname;
        this.role = role;
    }
    
    public String getFullName(){
        return lastname + " " + name + " " + patronymic;
    }
    public String getRole(){
        return role;
    }
}
