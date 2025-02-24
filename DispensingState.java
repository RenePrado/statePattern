public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing. Cannot select an item");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Currently dispensing. Cannot insert coins");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing complete");
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Item still dispensing");
    }
}
