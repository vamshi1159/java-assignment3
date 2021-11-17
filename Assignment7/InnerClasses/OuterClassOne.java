package Assignment7.InnerClasses;

public class OuterClassOne {

    class InnerClassOne
    {
        int id;
        InnerClassOne(int id)
        {
            this.id=id;
        }

        public int getId() {
            return id;
        }
    }
}
