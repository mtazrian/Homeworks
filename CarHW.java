/**
 * Created by Mo Tazrian on 1/12/18.
 */
public class CarHW {

    public static void main(String[] args) {

//        Creating new objects.
        TeslaSedan modelS = new TeslaSedan();
        ManualTransmission mitsubishiLancer = new ManualTransmission();

//        Calling inherited and overridden methods.
        modelS.handSteering();
        modelS.gas();
        modelS.changeGears();

        mitsubishiLancer.changeGears();
        mitsubishiLancer.accelerate();


    }
}



class Vehicle {

    //    Method to accelerate vehicle.
    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }

    //    Method allowing vehicle to be hand steered.
    public void handSteering() {
        System.out.println("Vehicle must be hand steered at all times");
    }

    //    Method for all auto transmission vehicles.
    public void changeGears() {
        System.out.println("Vehicle switches gears automatically");
    }

    //    Method for most cars and their size.
    public void doors() {
        System.out.println("Vehicle has 4 doors");
    }

    //    Method to refuel vehicle.
    public void gas() {
        System.out.println("Vehicle must be refueled with oil");
    }
}



class TeslaSedan extends Vehicle {

    //    Overridden method because Tesla vehicles are equipped with self-driving feature.
    @Override
    public void handSteering() {
        System.out.println("Tesla does not require hand steering at all times");
    }

    //    Overridden method because Tesla vehicles run on battery charge.
    @Override
    public void gas() {
        System.out.println("Tesla must be electrically recharged");
    }
}




class Coupe extends Vehicle{

    //    Overridden method because a coupe vehicle has 2 doors.
    @Override
    public void doors() {
        System.out.println("Coupe has 2 doors");
    }
}



class ManualTransmission extends Vehicle {

    //    Overridden method, manual transmission requires manual gear shifting.
    @Override
    public void changeGears() {
        System.out.println("This manual transmission vehicle does not change gears automatically");
    }

}

