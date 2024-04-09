package people_package;

import people_package.chair_package.Chair;

public class PeopleFactory {
    
    public static Teacher createPeople(String name, String patronymic, String lastname, Chair chair){
            return new Teacher(name, patronymic, lastname, chair, "Teacher");
    } 
    public static Student createPeople(String name, String patronymic, String lastname, String group){
            return new Student(name, patronymic, lastname, group, "Student");
    }
}

