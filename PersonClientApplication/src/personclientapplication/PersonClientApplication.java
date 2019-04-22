/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclientapplication;

import com.mycompany.personwsapplication.PersonInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Администратор
 */
class structPersonInfo {
    String name;
    String position;
    String age;
    String salary;
}

public class PersonClientApplication {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            System.out.println("Инициализация работы Web-сервиса.....");
            
            String age = rAge("Владимир Смирнов", "Главный специалист");
            if (age != null) System.out.println("Возвраст Сотрудника: " + age);
            
            PersonInfo person = rSalary("", "Главный специалист");
            
            if (person != null){
                structPersonInfo myPerson = new structPersonInfo();
                myPerson.name = person.getName();
                myPerson.position = person.getPosition();
                myPerson.age = person.getAge();
                myPerson.salary = person.getSalary();
                System.out.println("Сотрудник:  " + myPerson.name + ", " + myPerson.position + ", " + myPerson.age + " лет, размер зар. платы " + myPerson.salary);
            }
            
            List<PersonInfo> persons = new ArrayList<PersonInfo>();
            persons = rPerson();
            
            System.out.println("Список Сотрудников.....");
            for(PersonInfo iPerson : persons){
                System.out.println("Сотрудник:  " + iPerson.getName() + ", " + iPerson.getPosition() + ", " + iPerson.getAge() + " лет, размер зар. платы " + iPerson.getSalary());
            }
            
            System.out.println("Работа Web-сервиса успешно завершена!");
                    
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }

    private static String rAge(java.lang.String name, java.lang.String position) {
        com.mycompany.personwsapplication.PersonWebServiceImplService service = new com.mycompany.personwsapplication.PersonWebServiceImplService();
        com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
        return port.rAge(name, position);
    }

    private static PersonInfo rSalary(java.lang.String name, java.lang.String position) {
        com.mycompany.personwsapplication.PersonWebServiceImplService service = new com.mycompany.personwsapplication.PersonWebServiceImplService();
        com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
        return port.rSalary(name, position);
    }

    private static java.util.List<com.mycompany.personwsapplication.PersonInfo> rPerson() {
        com.mycompany.personwsapplication.PersonWebServiceImplService service = new com.mycompany.personwsapplication.PersonWebServiceImplService();
        com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
        return port.rPerson();
    }
    
}
