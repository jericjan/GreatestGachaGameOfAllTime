import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        print("Welcome to The Greatest Gacha Game of All Time!");

        Player player = new Player();

        boolean running = true;
        while(running == true){
            print("Your money: " + player.money);
            print("""
                1.) Grind
                2.) Gacha (Cost 150, 1.5% chance to get big tiddy anime girl)
                3.) Inventory
                4.) Exit
                """);           
            int choice = scanner.nextInt();
            scanner.nextLine(); //fix skiping
            switch (choice) {
                case 1:                   
                    print("Grinding...\n");
                    player.grind();
                    print("");   
                    break;
                case 2:                  
                    print("Pulling...\n");  
                    player.gacha();
                    print("");   
                    break;            
                case 3:                   
                    print("Your inventory:\n");   
                    player.viewInventory();
                    print("");   
                    break;                        
                case 4:                    
                    print("Goodbye!"); 
                    running = false;  
                    break;                        
                default:
                    print("Invalid option.\n");                    
                    break;
                    
            }
        }
        scanner.close();
    }

    static void print(String text){
        System.out.println(text);
    }

}