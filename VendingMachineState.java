public interface VendingMachineState {
    public void selectItem(VendingMachine machine, String item);
    public void insertCoin(VendingMachine machine, double amount);
    public void dispenseItem(VendingMachine machine);
    public void setOutOfOrder(VendingMachine machine);
}
