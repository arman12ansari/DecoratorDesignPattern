public class ChocoChip implements IceCream{
    private IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 30 + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Choco Chip";
    }
}
