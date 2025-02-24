public interface VendingMachineState {
    public void selectItem(VendingMachine machine);
    public void insertCoin(VendingMachine machine);
    public void dispenseItem(VendingMachine machine);
    public void setOutOfOrder(VendingMachine machine);
}
