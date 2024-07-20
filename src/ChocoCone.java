public class ChocoCone implements IceCream{
    private IceCream iceCream;

    public ChocoCone() {
    }

    public ChocoCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream != null) {
            return 10 + iceCream.getCost();
        } else {
            return 10;
        }

    }

    @Override
    public String getDescription() {
        if(iceCream != null) {
            return iceCream.getDescription() + ", Choco Cone";
        } else {
            return "Choco Cone";
        }
    }
}
