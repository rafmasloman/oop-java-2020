import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1, 4000, 100, 1000);
        Player player2 = new Player(1, 4000, 100, 1000);

        Item item1 = new Item("Black Power", 250, "+80 Attack");
        Item item2 = new Item("Megamorph", 200, "+10 energy");
        Item item3 = new Item("Healing Magic", 150 , "+100 hp");
        
        //MENU
        
        Scanner raf = new Scanner(System.in);

        
        //Set Nama dan Role Player1
        player1.setName("Black Magician");
        player1.setRole("SpellCaster");
        player1.setDamage(1200);
        

        //Menge-Set Nama dan Role Player2
        player2.setName("Blue Eyes White Dragon");
        player2.setRole("Dragon");
        player2.setDamage(1500);

        System.out.println();
        String save;
        boolean cek = true;

        while(cek){
            System.out.println("\n---- Player 1 Turn ----");
            System.out.println("---- MENU ----");
            System.out.println("1. Buy Item");
            System.out.println("2. Attack Enemy");
            System.out.println("3. Show Player Status");
            System.out.println("4. Show Enemy Status");
            System.out.print(">>>");
            int pilih = raf.nextInt();
            int pilihItem;
            if(pilih == 1){
                item1.itemDetail();
                System.out.println();
                item2.itemDetail(); 
                System.out.println();
                item3.itemDetail();
                System.out.print(">>>");
                pilihItem = raf.nextInt();
                if(pilihItem == 1){
                    player1.buy(item1);  System.out.println();
                    player1.equipItem(item1.getName()); System.out.println();
                    
                }

                else if(pilihItem == 2){
                    player1.buy(item2);
                    System.out.println();
                    player1.equipItem(item2.getName());
                    System.out.println();
                    
                }

                else  if(pilihItem == 3){
                    player1.buy(item3);
                    System.out.println();
                    player1.equipItem(item3.getName());
                    System.out.println();
                }

            }
            
            else if(pilih == 2){
                player1.Attack(player2);
            }
            else if(pilih == 3){
                player1.showStatus();
            }
            else if(pilih == 4){
                player2.showStatus();
            }

            System.out.println("\nEND TURN ?");
            save = raf.next();
            if(save.equalsIgnoreCase("Yes")){
                cek = false;
            }

        }

        System.out.println();

        boolean cek2 = true;
        while (cek2) {
            System.out.println("\n---- Player 2 Turn ----");
            System.out.println("---- MENU ----");
            System.out.println("1. Buy Item");
            System.out.println("2. Attack Enemy");
            System.out.println("3. Show Player Status");
            System.out.println("4. Show Enemy Status");
            System.out.print(">>>");
            int pilih = raf.nextInt();
            int pilihItem;
            if (pilih == 1) {
                item1.itemDetail();
                System.out.println();
                item2.itemDetail();
                System.out.println();
                item3.itemDetail();
                System.out.print(">>>");
                pilihItem = raf.nextInt();
                if (pilihItem == 1) {
                    player2.buy(item1);
                    System.out.println();
                    player2.equipItem(item1.getName());
                    System.out.println();
                    
                }

                else if (pilihItem == 2) {
                    player2.buy(item2);
                    System.out.println();
                    player2.equipItem(item2.getName());
                    System.out.println();
                    
                }

                else if(pilihItem == 3){
                    player2.buy(item3);
                    System.out.println();
                    player2.equipItem(item3.getName());
                    System.out.println();
                }

            }  else if (pilih == 2) {
                player2.Attack(player1);
            } else if (pilih == 3) {
                player2.showStatus();
            } else if (pilih == 4){
                player1.showStatus();
            }
            System.out.println("\nEND TURN ?");
            save = raf.next();
            if (save.equalsIgnoreCase("Yes")) {
                cek2 = false;
            }

        }

        
        
    }
}