public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Item already selected. Please insert coins or cancel.");
    }

    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Inserted coin: " + amount);
        machine.setState(machine.getDispensingState()); // transition
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(machine.getOutOfOrderState()); // transition
    }
}