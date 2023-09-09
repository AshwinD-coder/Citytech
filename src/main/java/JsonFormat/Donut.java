package JsonFormat;

import java.util.ArrayList;
import java.util.HashMap;

public class Donut {

    private String id;
    private String type;
    private String name;
    private double pricePerUnit;
    private HashMap<String, ArrayList<Batter>> batters = new HashMap<>();
    private ArrayList<Topping> toppings = new ArrayList<>();

    public Donut(String id, String type, String name, double pricePerUnit) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public HashMap<String, ArrayList<Batter>> getBatters() {
        return batters;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setBatters(HashMap<String, ArrayList<Batter>> batters) {
        this.batters = batters;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }


}
