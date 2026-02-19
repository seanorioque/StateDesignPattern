public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;
    private VendingMachineState currentState;

    public VendingMachine() {
        idleState = new IdleState();
        itemSelectedState = new ItemSelectedState();
        dispensingState = new DispensingState();
        outOfOrderState = new OutOfOrderState();

        currentState = idleState; // machine starts in idle
    }

    public void selectItem(String item) {
        currentState.selectItem(this, item);
    }

    public void insertCoin(double amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    // State getters
    public VendingMachineState getIdleState()        { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState()  { return dispensingState; }
    public VendingMachineState getOutOfOrderState()  { return outOfOrderState; }

    // Allows states to change the current state
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getState() {
        return currentState;
    }
}