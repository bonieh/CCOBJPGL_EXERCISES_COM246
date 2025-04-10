import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

    HybridVehicle car1 = new HybridSedan(null);
    car1.carName = "Audi";
    HybridVehicle car2 = new HybridPickup(null);
    car2.carName = "Ford";

    ArrayList<HybridVehicle> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);

    CarWash wash = new CarWash();

    ((HybridSedan) car1).disCharging();
    ((HybridSedan) car1).disfuelling();
    wash.Washing(car1);

    System.out.println();

    ((HybridPickup) car2).disCharging();
    ((HybridPickup) car2).disfuelling();
    wash.Washing(car2);
        
    }
}