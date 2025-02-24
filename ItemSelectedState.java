public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please insert a coin first");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}
