import java.util.*; 

public class PrimitiveTypes {
  public static void comparing (){
    Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);
  
   int isOK = naturalOrder
      .compare(
        new Integer(3),
        new Integer(3)
      );
      
    System.out.println(isOK);
    assert isOK == 0: "This should be equals to 0";
  }
}