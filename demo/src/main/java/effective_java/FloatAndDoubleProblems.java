package src.main.java.effective_java;

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