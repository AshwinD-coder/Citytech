package JsonFormat;

import java.util.HashMap;
import java.util.ArrayList;

import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        Donut donutCake = new Donut("0001", "donut", "Cake", 0.55);
        Donut donutRaised = new Donut("0002", "donut", "Raised", 0.55);
        Donut donutOldFashioned = new Donut("0003", "donut", "Old Fashioned", 0.55);
        ArrayList<Donut> donuts = new ArrayList<>();

        // Donut Cake Batters and Topping values
        ArrayList<Batter> battersDonutCake = new ArrayList<>();
        battersDonutCake.add(new Batter("1001", "Regular"));
        battersDonutCake.add(new Batter("1002", "Chocolate"));
        battersDonutCake.add(new Batter("1003", "Blueberry"));
        battersDonutCake.add(new Batter("1004", "Devil's Food"));

        HashMap<String, ArrayList<Batter>> battersMapDonutCake = new HashMap<>();
        battersMapDonutCake.put("batter", battersDonutCake);

        ArrayList<Topping> toppingsDonutCake = new ArrayList<>();
        toppingsDonutCake.add(new Topping("5001", "None"));
        toppingsDonutCake.add(new Topping("5002", "Glazed"));
        toppingsDonutCake.add(new Topping("5005", "Sugar"));
        toppingsDonutCake.add(new Topping("5007", "Powdered Sugar"));
        toppingsDonutCake.add(new Topping("5006", "Chocolate with Sprinkles"));
        toppingsDonutCake.add(new Topping("5003", "Chocolate"));
        toppingsDonutCake.add(new Topping("5004", "Maple"));


        // Donut Raised Batters and Topping values
        ArrayList<Batter> battersDonutRaised = new ArrayList<>();
        battersDonutRaised.add(new Batter("1001", "Regular"));

        HashMap<String, ArrayList<Batter>> battersmapDonutRaised = new HashMap<>();
        battersmapDonutRaised.put("batter", battersDonutRaised);

        ArrayList<Topping> toppingsDonutRaised = new ArrayList<>();
        toppingsDonutRaised.add(new Topping("5001", "None"));
        toppingsDonutRaised.add(new Topping("5002", "Glazed"));
        toppingsDonutRaised.add(new Topping("5005", "Sugar"));
        toppingsDonutRaised.add(new Topping("5003", "Chocolate"));
        toppingsDonutRaised.add(new Topping("5004", "Maple"));

        // Donut Old Fashioned Batters and Topping values
        ArrayList<Batter> battersDonutOldFashioned = new ArrayList<>();
        battersDonutOldFashioned.add(new Batter("1001", "Regular"));
        battersDonutOldFashioned.add(new Batter("1002", "Chocolate"));

        HashMap<String, ArrayList<Batter>> battersmapDonutOldFashioned = new HashMap<>();
        battersmapDonutOldFashioned.put("batter", battersDonutOldFashioned);

        ArrayList<Topping> toppingsDonutOldFashioned = new ArrayList<>();
        toppingsDonutOldFashioned.add(new Topping("5001", "None"));
        toppingsDonutOldFashioned.add(new Topping("5002", "Glazed"));
        toppingsDonutOldFashioned.add(new Topping("5003", "Chocolate"));
        toppingsDonutOldFashioned.add(new Topping("5004", "Maple"));

        //Setters
        donutCake.setBatters(battersMapDonutCake);
        donutCake.setToppings(toppingsDonutCake);
        donutRaised.setBatters(battersmapDonutRaised);
        donutRaised.setToppings(toppingsDonutRaised);
        donutOldFashioned.setBatters(battersmapDonutOldFashioned);
        donutOldFashioned.setToppings(toppingsDonutOldFashioned);

        donuts.add(donutCake);
        donuts.add(donutRaised);
        donuts.add(donutOldFashioned);

        // Converting into JSON
        Gson gson = new Gson();
        String donutsJsonFormat = gson.toJson(donuts);

        System.out.println(donutsJsonFormat);


    }
}
