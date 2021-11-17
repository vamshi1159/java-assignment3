package Assignment7.CycleFactory;

public class Main {
    public static void main(String[] args) {
        CycleFactory cycleFactory=new BicycleFactory();
        Cycle cycle= cycleFactory.getCycle();
        System.out.println("no Of Wheels= "+cycle.noOfWheels());
        CycleFactory cycleFactory1=new TriCycleFactory();
        Cycle cycle1=cycleFactory1.getCycle();
        System.out.println("no Of Wheels= "+cycle1.noOfWheels());
    }
}
