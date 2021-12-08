import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
  Stream - introduced in java 8
  used to process collection elements
  A stream is sequence of objects that supports multiple methods,
  which can be pipelined or produced output
  Stream is not data structure
  Stream does not change actual/original data,they only provide the result.
 */
public class FindAllAdmin {
    public static void main(String[] args) {
        User user = new User("Anuja","Admin");
        User user1 = new User("Madhuri","Member");
        User user2 = new User("Mounika","Admin");
        User user3 = new User("Priyanka","Member");
        List<User> userList = Arrays.asList(user,user1,user2,user3);
        // for loop is working as iterator to fetch object/element store in list
//        for(User userObj : userList)
//        {
//             if(userObj.getRole().equals("Admin"))
//             {
//                 adminUsers.add(userObj);
//             }
//        }
//        for(User userObj:adminUsers)
//        {
//            System.out.println(userObj);
//        }
//
        Predicate<User> adminUserCondition = input-> input.getRole()
                                            .equalsIgnoreCase("admin");
        Consumer<User> printUsers = userObj -> System.out.println(userObj);
      List<User> adminUsers= userList.stream() // converting list object to sequence of elements
                .filter(adminUserCondition) // with filter method we are selecting element as per the given predicate
                .collect(Collectors.toList());// used to return the result of the intermediate operation





//        System.out.println("Admin Members");
//       adminUsers.forEach(printUsers);
//
//        System.out.println("Member Users ");
//        userList.stream()
//                .filter((input)->input.getRole().equalsIgnoreCase("member"))
//                .forEach(printUsers);

        //Print Userlist sorted as per user name

        userList.stream()
                .sorted()
                .forEach(userObj-> System.out.println(userObj) );

    }
}
