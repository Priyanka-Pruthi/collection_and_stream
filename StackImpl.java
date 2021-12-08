import java.util.LinkedList;

public class StackImpl {
    // instantiate LinkedList object will be treated as stack
    private LinkedList stack = new LinkedList();


    public StackImpl() {
    }
     // adding data into stack
    public void push(int data)
    {
         stack.addFirst(data);
    }

    // retrieve the data but do not want to remove from stack
    public Integer peek()
    {
          if(isEmpty())
          {
              System.out.println("Stack is empty , there is no data to process");
              return null;
          }
          return  (Integer) stack.peek();
    }

    //retrieve the data and remove from stack too

    public  Integer pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty , there is no data to process");
            return null;
        }
        return (Integer) stack.pop();
    }

    public int size()
    {
         return stack.size();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }


    public void printStack()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty , there is no data to process");
            return;
        }

        stack.forEach(data -> System.out.print(data+" -> "));
    }


}
