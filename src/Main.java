//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IceCream iceCream = new ChocoChip(
                new ChocoScoop(
                        new OrangeCone(
                                new ChocoSyrup(
                                        new ChocoCone()
                                )
                        )
                )
        );

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}