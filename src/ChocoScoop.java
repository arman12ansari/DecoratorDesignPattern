public class ChocoScoop implements IceCream {
    private IceCream iceCream;

    public ChocoScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 80 + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Choco Scoop";
    }
}
