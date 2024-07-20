public class OrangeCone implements IceCream {
    private IceCream iceCream;

    public OrangeCone() {
    }

    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream != null) {
            return 15 + iceCream.getCost();
        } else {
            return 15;
        }
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return iceCream.getDescription() + ", Orange Cone";
        } else {
            return "Orange Cone";
        }
    }
}
