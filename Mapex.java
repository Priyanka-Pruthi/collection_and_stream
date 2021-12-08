import model.Employee;

import java.util.*;

public class Mapex {

    public static void main(String[] args) {
        HashMap<Integer,Employee> employees = new HashMap();
        employees.put(1,new Employee(1,"Anuja","BEDEV"));
        employees.put(2,new Employee(2,"Priyanka","L&D"));
        employees.put(3,new Employee(3,"Madhuri","BEDEV"));
        System.out.println(employees);
         // to fetch employee whose empid is 3
//        System.out.println(employees.get(3));
//        employees.put(3,new Employee(3,"Sonali","BEDEV"));
//        System.out.println(employees.get(3));

        employees.forEach((k,v)-> System.out.println(k+"  "+v));

        if(employees.containsKey(3)) {
            Employee emp = employees.get(3);
            System.out.printf(emp.getEmpName());
        }else
        {
            System.out.println("No Employee Found");
        }

        System.out.println("keys Avaialble : "+employees.keySet());
        System.out.println("Values : "+employees.values());
        System.out.println("Key and Value : "+employees.entrySet());

        HashMap<String,Integer> marks = new HashMap();
        marks.put("Math",23);
        marks.put("English",25);
        marks.put("Science",23);
        marks.put("Hindi",26);

        List<String> subjects = Arrays.asList("Math","English","Science","Hindi","History");

         int sum =0;
        for(String subject : subjects)
        {
             sum+= marks.getOrDefault(subject,0);
        }
        System.out.println("Sum : "+sum);

        TreeMap<Integer,Employee> employeeTreeMap= new TreeMap();
        employeeTreeMap.put(1,new Employee(1,"Anuja","BEDEV"));



    }


}

/*
   equals and Hashcode method
   contract between equals and hashcode
   Queue and Priority Queue
   Exception Handling
 */

/*
   1. Write a program to iterate the Hashmap.
   2. Write a program to sort ArrayList with Comparable
      and Comparator in descending order
   3. write a program to store employee object in treemap on the basis
   of employee name and key(empname) should be case insensitive

  4. ArrayList vs LinkedList
      Benefits of using Collection
      Collection Heirarchy in java
      what is Iterator and how we are using in collection
      how to convert ArrayList and Set into Array
      How HashSet and TreeSet store data internally
      difference between Collection and collections
 */
