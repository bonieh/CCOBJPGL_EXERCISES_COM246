import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

  DataScientist dataScientist1 = new DataScientist("John", null, null);
  System.out.println("My name is " + dataScientist1.name);
  System.out.println("His work is " + dataScientist1.getWork());
  System.out.println("He earns " + dataScientist1.getSalary());

  Researcher researcher1 = new Researcher("Jane", null, null);
  System.out.println("\nMy name is " + researcher1.name);
  System.out.println("Her work is " + researcher1.getWork());
  System.out.println("She earns " + researcher1.getSalary());

//  }
//  }

//      DataScientist dataScientist1 = new DataScientist("John", null, null);
//         System.out.println(dataScientist1.name + " works as a " + dataScientist1.getWork() + " and he earns " + dataScientist1.getSalary());

//      Researcher researcher1 = new Researcher("Jane", null, null);
//         System.out.println(researcher1.name + " works as a " + researcher1.getWork() + " and she earns " + researcher1.getSalary());

//     }
// }
Car mycar = new Car(6, "10kwh");

System.out.println("\nmy car has " + mycar.cylinder + " cylinders and " + mycar.battery + " battery");
}
}