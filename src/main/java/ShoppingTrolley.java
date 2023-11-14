import java.util.ArrayList;
import java.util.List;

public class ShoppingTrolley {

//    Shopping trolley properties
    private List<String> shoppingItems;

//    Shopping trolley constructor
    public ShoppingTrolley(){
        this.shoppingItems = new ArrayList<>();
    }

//    Add item to trolley
    public void addItem(String item){
        this.shoppingItems.add(item);
    }

//    Get number of items in trolley
    public int getItems(){
        return this.shoppingItems.size();
    }

//    Check if an item is in the trolley
    public Boolean checkTrolley(String item){
        return this.shoppingItems.contains(item);
    }
}
