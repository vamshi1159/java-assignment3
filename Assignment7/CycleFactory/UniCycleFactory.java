package Assignment7.CycleFactory;

public class UniCycleFactory extends CycleFactory{
    @Override
    Cycle getCycle() {
        return new UniCycle();
    }
}
