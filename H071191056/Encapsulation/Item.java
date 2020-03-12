/**
 * Item
 */
public class Item {

    private String name;
    private int price;
    private String info;

    public Item(String name, int price, String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void itemDetail(){
        System.out.println("Item Name\t\t: " + getName());
        System.out.println("Item price\t\t: " + getPrice());
        System.out.println("Item info\t\t: " + info);
    }

    public void use(){
        
    }

    public void sell(){

    }

    public void destroy(){
        
    }
}