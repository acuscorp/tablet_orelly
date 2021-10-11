<<<<<<< HEAD:FloatAndDoubleProblems.java
import java.math.BigDecimal;
//  In summary, dont use float or 
//  double for any calculations that 
//  require an exact answer.
=======
package src.main.java.effective_java;
>>>>>>> 3e00800cd98e83201919c647ee892b6ce13c0583:demo/src/main/java/effective_java/FloatAndDoubleProblems.java
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