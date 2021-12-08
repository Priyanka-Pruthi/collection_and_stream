import model.Book;
import model.Employee;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {

//        HashSet marks = new HashSet();
//        marks.add(new Book());
//       marks.add(5);
//       marks.add(2);
//       marks.add(3);
//        marks.add("Anuja");
//
//        System.out.println("Set Size : "+marks.size());
//        System.out.println(marks);
//
//        Set data = new TreeSet();
//        data.addAll(Arrays.asList(1,2,3,2));
//        data.add("Anuja");
//        System.out.println(data);

        /*
         * In TreeSet if class doesn't implement Comparable and we ddo not
         * provide Comparator , while fetching elements it will throw Class Cast Execption
         */
//         TreeSet<Employee> employees = new TreeSet(((o1, o2) -> ((Employee)o1).getEmpName().compareTo(((Employee)o2).getEmpName())));
//         employees.add(new Employee(1,"Anuja","BEDEV"));
//         employees.add(new Employee(2,"Priyanka","L&D"));
//         employees.add(new Employee(3,"Madhuri","BEDEV"));
//
//        System.out.println(employees);
//
//        System.out.println(employees.ceiling(new Employee(2,"Priyanka","L&D")));

        TreeSet<Float> marks = new TreeSet(Arrays.asList(1.25f,1.0f,2.25f,3.0f,5.0f,2.99f));
        System.out.println(marks.ceiling(2.5f));
        System.out.println(marks.floor(2.5f));
        System.out.println(marks.higher(3.3F));
        System.out.println(marks.headSet(3.0f)); // headset it excludes the given key
        System.out.println(marks.tailSet(3.0f)); // tailSet if the given key present in set it includes it in result

    }
}

/*
     Hashset
        implements Set interface
        internally it use hash table for implementation
        allows a null value
        hashset use equals method to compare two objects
        hashset doesn't allow heterogenous elements

     TreeSet
        extends AbstractSet Class and implements NavigableSet (java 6 onwards)
        internally it implements using tree structure
        treeset doesn't allow null value
        treeset use compare method to compare 2 objects


   LinkedHashSet - hybrid of hashset and treeset
     it provides same time complexity as hashset  and maintains Object Orders as treeset
*/


