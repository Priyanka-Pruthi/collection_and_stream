import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
    4 type of method reference
     a. static Method reference
     b. Instance method reference of a particular instance
     c. Instance method reference of an arbitrary object of a particular type
     d. Constructor reference
 */
public class MethodReferenceEx {
    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7);
//        //data.forEach(num -> System.out.println(num));
//        data.forEach(System.out::println);

//        User user = new User("Anuja","Admin");
//        User user1 = new User("Madhuri","Member");
//        User user2 = new User("Mounika","Admin");
//        User user3 = new User("Priyanka","Member");
//        List<User> userList = Arrays.asList(user,user1,user2,user3);
//        //a static method reference
//        Collections.sort(userList,MethodReferenceEx::compareByName);
//
//        userList.forEach(System.out::println);
//        // b instance method reference of particular type
//        ComparatorEx comparatorEx = new ComparatorEx();
//        Collections.sort(userList,comparatorEx::compareByRole);


        List<String> participants = Arrays.asList("Anuja","Priyanka","Sai","Madhuri","Shekhar");
        Collections.sort(participants,String::compareToIgnoreCase);

        List<Integer> marks = Arrays.asList(10,3,5,2,8,6);
        Collections.sort(marks,Integer::compareTo);

        User []userData = participants.stream()
                                        .map(User::new) // it will constructor
                .toArray(User[]::new);

        List<User> userList1 = participants.stream()
                .map(User::new)
                .collect(Collectors.toList());

       /* User []userData = new User[participants.size()];
          int i =0;
          for(String name : participants)
          {
               userData[i] = new User(name)
               i++;
          }

        */
        Arrays.stream(userData).forEach(System.out::println);

    }

    public static int compareByName(User user1,User user2)
    {
         return user2.getUserName().compareTo(user1.getUserName());
    }
}
