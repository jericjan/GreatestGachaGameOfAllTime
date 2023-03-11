import java.util.Random;
import java.util.ArrayList;

public class Player {
    int money = 0;    
    ArrayList<Item> inventory = new ArrayList<Item>();

    public void grind(){
        int gained = randomNum(10,50);
        money += gained;
        System.out.printf("You gained %s money!%n", gained);
    }

    public void addToInventory(String name, int amount){
        System.out.printf("You got %sx %s%n",amount,name);
        boolean found = false;
        for (Item item : inventory) {                
            if (item.name.equals(name)){
                found = true;
                item.add(amount);
                break;
            }             
          }
        if (found == false) {
            Item newItem = new Item(name, amount);
            inventory.add(newItem);
        }
    }

    public void gacha(){

        if (money >= 150){
            money -= 150;
            int result = new Random().nextInt(66); // 1 / 66 = 1.5% chance
            if (result == 0){            
                addToInventory("big tiddy anime girl", 1);
            } else {
                addToInventory("shit", 10);
            }
        } else {
            System.out.println("You do not have enough money bruh");
        }

    }
    
    public void viewInventory(){
        for (Item item : inventory) {                
            System.out.printf("%s - %sx%n", item.name, item.amount);
        
        }
    }
    
    static int randomNum(int min, int max){
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }
}
