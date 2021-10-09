public class FloatAndDoubleProblems{
  public static void working(){
    System.out.println(1.03 - 0.42);
    System.out.println(103 - 042);
    System.out.println(1.00 - 9 * 0.10);
    
    double funds = 1.00;
    int itemsBought = 0;

    for (double price = 0.10; funds >= price; price += 0.10) {
        funds -= price;
        itemsBought++;
    }
    System.out.println(itemsBought + " items bought.");

    System.out.println("Change: $" + funds);
  }
} 