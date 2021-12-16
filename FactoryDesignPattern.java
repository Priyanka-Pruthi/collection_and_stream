

import java.util.Objects;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Person person = PersonFactory.createPersonObject("person");
        Employee employee = (Employee) PersonFactory.createPersonObject("employee");
        Student student = (Student) PersonFactory.createPersonObject("student");
    }


}

class PersonFactory
{
    // fcatory to get the specific object;
    public static Person createPersonObject(String objectType)
    {
         if(Objects.isNull(objectType) ||objectType.isEmpty())
             return null;

         if(objectType.equalsIgnoreCase("person"))
            return  new Person("Priyanka");
         else  if(objectType.equalsIgnoreCase("employee"))
                    return  new Employee("Anuja",1);
        else  if(objectType.equalsIgnoreCase("student"))
                            return  new Student("Priyanka",1);


        return null;

    }
}

class Person
{
      String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person
{
     int empId;

    public Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }
}

class Student extends Person
{
    int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
}

