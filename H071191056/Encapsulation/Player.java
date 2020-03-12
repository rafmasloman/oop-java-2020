import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Player
 */
public class Player {

    
	private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private ArrayList<Item> items; 

    public Player(int level, double hp, double energy, int money){

        this.level = level;
        this.hp = hp;
        this.energy = energy;
        this.money = money;

        items = new ArrayList<>();

    }
    
    public void setDamage(double damage){
        this.damage = damage;
    }


    public double getDamage() {
        return damage;
        
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    public void sellItem(Player player){

    }

    public void equipItem(String item){
        
        if(cekItem(item) || healing(item)){
            if(item.equals("Black Power")){
                damage += 80.0;
            }
            else if(item.equals("Megamorph")){
                energy += 10.0;
            }
            else if(item.equals("Healing Magic")){
                hp += 100.0;
            }

        }
    }
    public boolean cekItem(String cek){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getName().equals(cek)){
                return true;
            }
        }
        return false;
    }

    public boolean buy(Item item){
        if(money >= item.getPrice()){
            money -= item.getPrice();
            items.add(item);
            System.out.println();
            System.out.println("x---- Item Added ----x");
            System.out.println("\"" + item.getName() + "\"" + " Has Purchased ");
            return true;
        }
        else{
            System.out.println("Cannot Buy this Item");
            return false;
        }
        
    }

 
    public boolean Attack(Player player) {
        if(energy > 0){
            player.hp -= damage;
            System.out.println("x---------x BATTLE PHASE x---------x");
            System.out.println(name + " attacking " + player.name);
            level++;
            energy-=20;
            money += 200;
            if(player.hp <= 0){
                player.hp = 0;
                System.out.println(player.name + " Lose");
                player.showStatus();
                System.out.println("----- GAME END -----");
                System.exit(0);
            }
            return true;
        }
        else{
            System.out.println("Energy Habis");
            return false;
        }
   }

   public boolean healing(String cekHp){
        for (int i = 0; i < items.size(); i++) {
           if (items.get(i).getName().equals(cekHp)) {
               return true;
           }
       }
       return false;
        
   }

    public void showItems() {
        for(int i = 0; i < items.size(); i++){
            items.get(i).itemDetail();
        }
    }


    public void showStatus(){

        System.out.println("Name\t\t: " + getName());
        System.out.printf("Attack\t\t: %.0f \n",damage);
        System.out.println("Role\t\t: " + getRole());
        System.out.println("Level\t\t: " + level);
        System.out.printf("Hp\t\t: %.0f \n",hp);
        System.out.printf("Energy\t\t: %.0f \n",energy);
        System.out.println("Money\t\t: Rp." + money);
        
    }

}