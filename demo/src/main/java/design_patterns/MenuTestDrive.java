package src.main.java.design_patterns;

// proot javac src/main/java/design_patterns/MenuTestDrive.java && proot java src/main/java/design_patterns/MenuTestDrive
public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner menu", "lunch");
        MenuComponent cafeMenu = new Menu("Cafe menu","Dinner");
        MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert of course");

        MenuComponent allMenus = new Menu("All menues", "All menues combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // add menud items here

        dinerMenu.add(new MenuItem("Pasta","Spaguetti with MarinaraSauce, and a slice of sourdough bread",
        true, 
        3.89));

        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("Apple pie","Apple pie with ................",
        true, 
        1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();


        

        


    }
    
}
