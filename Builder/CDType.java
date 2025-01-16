package Builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {
    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packs){
        items.add(packs);
    }

    public void printPrice(){
        for(Packing current_item:items){
            System.out.println(current_item.price());
        }
    }

    public void showItems(){
        for(Packing current_item: items){
            System.out.println("Company name: " + current_item.pack());
            System.out.println("Price: "+current_item.price());
        }
    }
}
