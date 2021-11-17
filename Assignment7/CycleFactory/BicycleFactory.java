package Assignment7.CycleFactory;

public class BicycleFactory extends CycleFactory{
    Cycle getCycle()
    {
       return new BiCycle();
    }
}
