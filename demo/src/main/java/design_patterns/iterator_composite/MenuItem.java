package src.main.java.design_patterns.iterator_composite;
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean isVegetarian;
    double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return isVegetarian;
    }
    public void print(){
        System.out.println("\t" + getName());
        if(isVegetarian()){
            System.out.println("(v)");
        }

        System.out.println(", " + getPrice());
        System.out.println("\t -- " + getDescription());
    }
}
