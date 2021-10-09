
public class FunctionalInterface {
  
  //@FunctionalInterface
  interface Square<T>{
    T calculate(T x);
}

//  @FunctionalInterface
  interface BinaryOperation<T>{   
    T calculate(T x, T y);
  }

  public static void workingWithFunctionalInterface(){
    Integer a = 5;

        Square<Integer> square = (x)->x*x;

        int ans = square.calculate(a);     
        System.out.println(ans);              
        
        BinaryOperation<Double> mult = (first,second)-> first*second;
        
        double dRes = mult.calculate(3.6,4.7);
        
        System.out.println(dRes);
  }
}