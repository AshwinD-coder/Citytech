package json;
import java.util.ArrayList;
import java.util.HashMap;

public class Item {

    public String id;
    public String type;
    public String name;
    public double pricePerUnit;
    public HashMap<String, ArrayList<HashMap<String,String>>> batters = new HashMap<>();
    public ArrayList<HashMap<String,String>> topping = new ArrayList<>();

    public Item(String id, String type, String name, double pricePerUnit) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public void setBatter(HashMap<String, ArrayList<HashMap<String, String>>> batters) {
        this.batters = batters;
    }

    public void setTopping(ArrayList<HashMap<String,String>> topping) {
        this.topping = topping;
    }
}
