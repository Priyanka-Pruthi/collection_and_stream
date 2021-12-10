import java.util.Arrays;

/*
      static class is class declared inside another class and mark static
      outer class will be treated as package
      nested classes can be private , public or default
      avg = sum of all elements/total elements
 */
public class Utils {
    public static class Result
    {
         private final int count;
         private final double sum;
         public Result(int count,double sum)
         {
              this.count = count;
              this.sum =sum;
         }

         public double getAverage()
         {
             if(count == 0) {
                 System.out.println("count can not be 0");
                 return 0;
             }

             return sum/count;
         }
    }
    public static Result findSumAndAverage(double []data)
    {
        Result result = new Result(data.length, Arrays.stream(data).sum());
        return result;
    }

    public static void main(String[] args) {
        double array[] = new double[]{2.5,6.8,8.0,7.0};
        double average = findSumAndAverage(array).getAverage();
        System.out.println(average);
    }
}
