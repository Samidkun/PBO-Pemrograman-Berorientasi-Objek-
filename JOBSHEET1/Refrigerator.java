public class Refrigerator {
    public static void main(String[] args) {
     
        String Brand1, Brand2, Brand3, Brand4, Brand5, Brand6, Brand7, Brand8, Brand9, Brand10;
        int Capacity1, Capacity2, Capacity3, Capacity4, Capacity5, Capacity6, Capacity7, Capacity8, Capacity9, Capacity10;
        int PowerConsumption1, PowerConsumption2, PowerConsumption3, PowerConsumption4, PowerConsumption5, PowerConsumption6, PowerConsumption7, PowerConsumption8, PowerConsumption9, PowerConsumption10;

        
        Brand1 = "LG";
        Capacity1 = 260;
        PowerConsumption1 = 100;

        Brand2 = "Samsung";
        Capacity2 = 192;
        PowerConsumption2 = 90;

        Brand3 = "Panasonic";
        Capacity3 = 268;
        PowerConsumption3 = 100;

        Brand4 = "Sharp";
        Capacity4 = 180;
        PowerConsumption4 = 110;

        Brand5 = "Toshiba";
        Capacity5 = 252;
        PowerConsumption5 = 100;

        Brand6 = "Hitachi";
        Capacity6 = 180;
        PowerConsumption6 = 120;

        Brand7 = "Polytron";
        Capacity7 = 170;
        PowerConsumption7 = 80;

        Brand8 = "Aqua";
        Capacity8 = 220;
        PowerConsumption8 = 90;

        Brand9 = "Electrolux";
        Capacity9 = 210;
        PowerConsumption9 = 100;

        Brand10 = "Midea";
        Capacity10 = 120;
        PowerConsumption10 = 70;

        
        displayInfo(Brand1, Capacity1, PowerConsumption1);
        displayInfo(Brand2, Capacity2, PowerConsumption2);
        displayInfo(Brand3, Capacity3, PowerConsumption3);
        displayInfo(Brand4, Capacity4, PowerConsumption4);
        displayInfo(Brand5, Capacity5, PowerConsumption5);
        displayInfo(Brand6, Capacity6, PowerConsumption6);
        displayInfo(Brand7, Capacity7, PowerConsumption7);
        displayInfo(Brand8, Capacity8, PowerConsumption8);
        displayInfo(Brand9, Capacity9, PowerConsumption9);
        displayInfo(Brand10, Capacity10, PowerConsumption10);

        freezeItems();
        coolFood();
    }

   
    public static void freezeItems() {
        System.out.println("Freezing items in the refrigerator.");
    }

    
    public static void coolFood() {
        System.out.println("Cooling food in the refrigerator.");
    }

    public static void displayInfo(String brand, int capacity, int powerConsumption) {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Power Consumption: " + powerConsumption + " W");
        System.out.println();
    }
}
