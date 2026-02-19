public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin(1.0);
        machine.selectItem("Chips");
        machine.selectItem("Soda");
        machine.insertCoin(1.0);
        machine.insertCoin(1.0);
        machine.dispenseItem();
        machine.selectItem("Water");
    }
}