public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Item already selected");
    }

    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Inserted coin: $" + amount);
        machine.setBalance(machine.getBalance() + amount);
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please insert coins first");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}
