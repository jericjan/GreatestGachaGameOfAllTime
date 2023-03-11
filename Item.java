public class Item {
    String name;
    int amount;

    public Item(String x, int y){
        name = x;
        amount = y;
    }

    public void add(int x){
        amount += x;        
    }
}
