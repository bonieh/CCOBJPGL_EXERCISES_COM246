public class HybridSedan extends HybridVehicle{

    public HybridSedan(String carName) {
        super(carName);
    }
    public void disCharging(){
        System.out.print("Your " + carName + " is ");
        chargeBattery();
    }

    public void disfuelling(){
        System.out.print("Your " + carName + " is ");
        fillGas();
    }
}