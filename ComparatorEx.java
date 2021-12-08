import java.util.Comparator;

public class ComparatorEx
{
    public int compareByRole(User user1,User user2)
    {
        return user2.getRole().compareTo(user1.getRole());
    }
}