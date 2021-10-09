import java.math.BigDecimal;

public class FloatAndDoubleProblems{
  public static void working(){
    final BigDecimal TEN_CENTS = new BigDecimal(".10");

    int itemsBought = 0;

    BigDecimal funds = new BigDecimal("1.00");
    
    for (BigDecimal price = TEN_CENTS;

            funds.compareTo(price) >= 0;

            price = price.add(TEN_CENTS)) {

        funds = funds.subtract(price);

        itemsBought++;
    }
    
    System.out.println(itemsBought + " items bought.");

    System.out.println("Money left over: $" + funds);

  }
} 