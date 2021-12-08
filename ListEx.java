
/*
   Data Structure
     a. building block in computer
     b. how to store data virtually
     c.way to organising a data in a computer/storing it

     Data
       same type (homogeneous)
       different type (heterogeneous)

      1. Linear Data Structure (Array , ArrayList, LinkedList)
      2. Non Linear data structure (HashSet, TreeSet, HashMap , TreeMap)
 */
/*
   List
      a. it store the elements in same order we add
      b. duplicate is allowed
      c. ArrayList and LinkedList are the implementations
 */

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
//    List name= new ArrayList();
//    name.add("Anuja");
//    name.add(20);
//    name.add(true);
//        System.out.println(name);
//
//    List nameList = Arrays.asList("Anuja","Durga","Madhuri");
//        System.out.println(nameList);

//    ArrayList<String> nameList = new ArrayList();
//    nameList.addAll(Arrays.asList("Anuja","Durga","Madhuri"));
//
//    if(nameList.isEmpty())
//    {
//        System.out.println("List is empty");
//    }else
//    {
//        System.out.println("List Contains "+nameList.size()+"  records");
//    }
//
//        System.out.println("Is List contains Keerthi : "+nameList.contains("Keerthi"));
//
//        System.out.println("Is List Contains Anuja and Durga : "+
//                nameList.containsAll(Arrays.asList("Anuja","Durga")));
//
//        System.out.println("Data Store at 2nd position"+nameList.get(2));
/*
         this will raise an Index out of bound exception as in arraylist there is 3 elements only.
         internally ArrayList maintains array only to store the data
        System.out.println("Data Store at 7th position"+nameList.get(7));

 */
//
//        nameList.removeIf(ele->ele.equalsIgnoreCase("Anuj"));
//        System.out.println(nameList);
//
//        nameList.remove(2);
//        System.out.println(nameList);

        List marks = new LinkedList(); // declaring collection(list)
        marks.addAll(Arrays.asList(1,2,3,4,5,6,7)); // adding data
        marks =Collections.unmodifiableList(marks); //

        List markList = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(marks);
        marks.add(77);
        System.out.println(marks);
        marks.clear();
        System.out.println(marks);
        marks.addAll(Arrays.asList(1,2,3,4,5,6,7));



    }
}
