public class ChocoSyrup implements IceCream {
    private IceCream iceCream;

    public ChocoSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 50 + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Choco Syrup";
    }
}
