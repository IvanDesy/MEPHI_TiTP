package Library_package;

import Storage_package.Storage;
import book_package.*;
import people_package.*;
import people_package.chair_package.Chair;
import java.util.ArrayList;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;


public class DataMaster {

    private final Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));

    public DataMaster(){
        generateChairs();
        generateStudents();
        generateTeachers();
        generateBooks();
    }
    
    private ArrayList<String> generateNames() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String firstName = faker.name().firstName();
            names.add(firstName);
        }
        return names;
    }

    private ArrayList<String> generateLastNames() {
        ArrayList<String> lastNames = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String lastName = faker.name().lastName();
            lastNames.add(lastName);
        }
        return lastNames;
    }

    private ArrayList<String> generatemiddleNames() {
        ArrayList<String> middleNames = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String middleName = faker.name().lastName();
            middleNames.add(middleName);
        }
        return middleNames;
    }

    private void generateChairs() {
        String[] chairNames = {"Кафедра теоретической и экспериментальной физики ядерных реакторов",
            "Кафедра радиационной физики и безопасности атомных технологий",
            "Кафедра автоматики",
            "Кафедра экспериментальных методов ядерной физики",
            "Кафедра теплофизики",
            "Кафедра физического воспитания",
            "Кафедра конструирования приборов и установок",
            "Кафедра физических проблем материаловедения",
            "Кафедра стратегического планирования и методологии управления",
            "Кафедра экономики и менеджмента в промышленности",
            "Кафедра управления бизнес-проектами",
            "Кафедра финансового мониторинга",
            "Кафедра иностранных языков",
            "Кафедра русского языка как иностранного",
            "Кафедра высшей математики",
            "Кафедра общей физики"};
        int[] chairNumbers = {5, 1, 2, 11, 13, 15, 18, 9, 82, 71, 72, 75, 50, 49, 30, 6};
        for(int i = 0; i < chairNames.length; i++){
            Storage.chairs.add(new Chair(chairNames[i], chairNumbers[i]));
        }
    }
    
    private void generateTeachers() {
        ArrayList<String> names = generateNames();
        ArrayList<String> lastNames = generateLastNames();
        ArrayList<String> middleNames = generatemiddleNames();
        int randomNum = randomInt(20, 50);
        for(int i = 0; i < randomNum; i++){
            Storage.teachers.add(PeopleFactory.createPeople(names.get(i),
        lastNames.get(i), middleNames.get(i), Storage.chairs.get(i%16)));
        }
    }
    private void generateStudents() {
        ArrayList<String> names = generateNames();
        ArrayList<String> lastNames = generateLastNames();
        ArrayList<String> middleNames = generatemiddleNames();
        String[] groups = {"Б22-902", "Б21-901", "С23-515", "Б23-701", "Б22-515"};
        int randomNum = randomInt(20, 50);
        for(int i = 0; i < randomNum; i++){
            Storage.students.add(PeopleFactory.createPeople(names.get(i),
        lastNames.get(i), middleNames.get(i), groups[i%5]));
        }
    }
    private void generateBooks(){
        int randomNum = randomInt(20, 50);
        for(int i =0; i < randomNum; i++){
            Storage.books.add(BookFactory.createBook("EducationRU", faker.book().title(), faker.book().author(), faker.book().genre()));
        }
        randomNum = randomInt(20, 50);
        for(int i =0; i < randomNum; i++){
            Storage.books.add(BookFactory.createBook("FictionRU", faker.book().title(), faker.book().author()));
        }
        randomNum = randomInt(20, 50);
        int randomLevel;
        for(int i =0; i < randomNum; i++){
            randomLevel = randomInt(1, 5);
            Storage.books.add(BookFactory.createBook("EducationENG", faker.book().title(), faker.book().author(), faker.university().name(), randomLevel));
        }
        randomNum = randomInt(20, 50);
        for(int i =0; i < randomNum; i++){
            Storage.books.add(BookFactory.createBook("FictionENG", faker.book().title(), faker.book().author(), faker.country().name()));
        }
    }
    
    public ArrayList<Ticket> generateTickets(){
        
        ArrayList<Ticket> tickets = new ArrayList<>();
        for (Student student : Storage.students) {
            Ticket ticket = new Ticket(student);
            int randomNumberOfBooks = randomInt(3, 10);
            int randomNumBook;
            for(int i = 0; i < randomNumberOfBooks; i++){
                randomNumBook = randomInt(1, Storage.books.size());
                ticket.addBook(Storage.books.get(randomNumBook - 1));
            }
            tickets.add(ticket);
        }
        for(Teacher teacher : Storage.teachers){
           Ticket ticket = new Ticket(teacher);
            int randomNumberOfBooks = randomInt(3, 10);
            int randomNumBook;
            for(int i = 0; i < randomNumberOfBooks; i++){
                randomNumBook = randomInt(1, Storage.books.size());
                ticket.addBook(Storage.books.get(randomNumBook - 1));
            }
            tickets.add(ticket);
        }
        return tickets;
    }
    
    private int randomInt(int min, int max){
        Random rn = new Random();
        System.out.println(rn.nextInt(max - min + 1 ) + min);
        return rn.nextInt(max - min + 1 ) + min;
    }
}
