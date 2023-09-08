package json;

import java.util.HashMap;
import java.util.ArrayList;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        Item item1 = new Item("0001","donut","Cake",0.55);
        Item item2 = new Item("0002","donut","Raised",0.55);
        Item item3 = new Item("0003","donut","Old Fashioned",0.55);

        ArrayList<Item> ItemList = new ArrayList<>();

        // Item 1 Batters and Topping values
        ArrayList<HashMap<String,String>> item1_batter = new ArrayList<>();
        item1_batter.add(new HashMap<String,String>(){{
            put("id","1001");
            put("type","Regular");
        }});

        item1_batter.add(new HashMap<String,String>(){{
            put("id","1002");
            put("type","Chocolate");
        }});

        item1_batter.add(new HashMap<String,String>(){{
            put("id","1003");
            put("type","Blueberry");
        }});
        item1_batter.add(new HashMap<String,String>(){{
            put("id","1004");
            put("type","Devil's Food");
        }});
        HashMap<String,ArrayList<HashMap<String,String>>> item1_batters = new HashMap<>();
        item1_batters.put("batter",item1_batter);

        ArrayList<HashMap<String, String>> item1_toppings = new ArrayList<>();
        item1_toppings.add(new HashMap<String, String>() {{
            put("id", "5001");
            put("type", "None");
        }});

        item1_toppings.add(new HashMap<String, String>() {{
            put("id", "5002");
            put("type", "Glazed");
        }});

        item1_toppings.add(new HashMap<String, String>() {{
            put("id", "5005");
            put("type", "Sugar");
        }});

        item1_toppings.add(new HashMap<String, String>() {{
            put("id", "5007");
            put("type", "Powdered Sugar");
        }});
        item1_toppings.add(new HashMap<String, String>() {{
            put("id", "5006");
            put("type", "Chocolate with Sprinkles");
        }});
        item1_toppings.add(new HashMap<String, String>() {{
            put("id", "5003");
            put("type", "Chocolate");
        }});
        item1_toppings.add(new HashMap<String, String>() {{
            put("id", "5004");
            put("type", "Maple");
        }});

        // ITEM 2 Batters and Topping
        ArrayList<HashMap<String,String>> item2_batter = new ArrayList<>();
        item2_batter.add(new HashMap<String,String>(){{
            put("id","1001");
            put("type","Regular");
        }});
        HashMap<String,ArrayList<HashMap<String,String>>> item2_batters = new HashMap<>();
        item2_batters.put("batter",item2_batter);

        ArrayList<HashMap<String, String>> item2_toppings = new ArrayList<>();
        item2_toppings.add(new HashMap<String, String>() {{
            put("id", "5001");
            put("type", "None");
        }});

        item2_toppings.add(new HashMap<String, String>() {{
            put("id", "5002");
            put("type", "Glazed");
        }});

        item2_toppings.add(new HashMap<String, String>() {{
            put("id", "5005");
            put("type", "Sugar");
        }});

        item2_toppings.add(new HashMap<String, String>() {{
            put("id", "5003");
            put("type", "Chocolate");
        }});
        item2_toppings.add(new HashMap<String, String>() {{
            put("id", "5004");
            put("type", "Maple");
        }});

        // ITEM 3 Batters and Topping
        ArrayList<HashMap<String,String>> item3_batter = new ArrayList<>();
        item3_batter.add(new HashMap<String,String>(){{
            put("id","1001");
            put("type","Regular");
        }});
        item3_batter.add(new HashMap<String,String>(){{
            put("id","1002");
            put("type","Chocolate");
        }});
        HashMap<String,ArrayList<HashMap<String,String>>> item3_batters = new HashMap<>();
        item3_batters.put("batter",item3_batter);

        ArrayList<HashMap<String, String>> item3_toppings = new ArrayList<>();
        item3_toppings.add(new HashMap<String, String>() {{
            put("id", "5001");
            put("type", "None");
        }});

        item3_toppings.add(new HashMap<String, String>() {{
            put("id", "5002");
            put("type", "Glazed");
        }});

        item3_toppings.add(new HashMap<String, String>() {{
            put("id", "5003");
            put("type", "Chocolate");
        }});

        item3_toppings.add(new HashMap<String, String>() {{
            put("id", "5004");
            put("type", "Maple");
        }});

        item1.setTopping(item1_toppings);
        item1.setBatter(item1_batters);
        item2.setTopping(item2_toppings);
        item2.setBatter(item2_batters);
        item3.setTopping(item3_toppings);
        item3.setBatter(item3_batters);

        ItemList.add(item1);
        ItemList.add(item2);
        ItemList.add(item3);

        // Converting into JSON
        Gson gson = new Gson();
        String JsonFormat = gson.toJson(ItemList);

        System.out.println(JsonFormat);


    }
}
