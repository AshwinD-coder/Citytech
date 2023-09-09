package json;
import java.util.ArrayList;
import java.util.HashMap;

public class Donut {

    private String id;
    private String type;
    private String name;
    private double pricePerUnit;
    private HashMap<String, ArrayList<Batter>> batters = new HashMap<>();
    private ArrayList<Topping> topping = new ArrayList<>();

    public Donut(String id, String type, String name, double pricePerUnit) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public double getPricePerUnit(){
        return pricePerUnit;
    }
    public void setBatter(HashMap<String, ArrayList<Batter>> batters) {
        this.batters = batters;
    }

    public void setTopping(ArrayList<Topping> topping) {
        this.topping = topping;
    }

    public HashMap<String, ArrayList<Batter>> getBatters() {
        return batters;
    }

    public ArrayList<Topping> getTopping() {
        return topping;
    }

    public void setBatter(String batters, HashMap<String, String> batter) {
    }
}
