import java.math.BigDecimal;
//  In summary, don’t use float or 
//  double for any calculations that 
//  require an exact answer.
public class FloatAndDoubleProblems{
  public static void working(){
    int itemsBought = 0;

    int funds = 100;

    for (int price = 10; funds >= price; price += 10) {

        funds -= price;

        itemsBought++;

    }

    System.out.println(itemsBought + " items bought.");

    System.out.println("Cash left over: " + funds + " cents");

  }
} 