public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Inserting a coin is not allowed while dispensing. Please wait.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item... Done!");
        machine.setState(machine.getIdleState()); // auto-transition back to idle
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(machine.getOutOfOrderState());
    }
}