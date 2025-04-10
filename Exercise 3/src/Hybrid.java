public class Hybrid implements Electric, InternalCombustion{

    @Override
    public void chargeBattery() {
        System.out.println("Charging its Battery");
    }

    @Override
    public void fillGas() {
        System.out.println("Refueling its Gas");
        
    }
}