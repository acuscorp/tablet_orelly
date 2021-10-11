package src.main.java.design_patterns.iterator_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;
    double price;
    boolean isVegetarian;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int index){
        return menuComponents.get(index);
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
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-----------------------------------------");

        Iterator<MenuComponent> menuComponentsIterator = menuComponents.iterator();
        while (menuComponentsIterator.hasNext()) {
            MenuComponent menuComponent = menuComponentsIterator.next();
            menuComponent.print();
        }
    }



}
