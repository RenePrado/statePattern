public class VendingMachine {
    private VendingMachineState state;
    private int itemInventory;
    private double balance;

    public VendingMachine(int initialInventory) {
        this.state = new IdleState();
        this.itemInventory = initialInventory;
        this.balance = 0.0;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public int getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(int itemInventory) {
        this.itemInventory = itemInventory;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void selectItem(String item) {
        state.selectItem(this, item);
    }

    public void insertCoin(double amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }
}
