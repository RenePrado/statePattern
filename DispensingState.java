public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Currently dispensing. Cannot select an item");
    }

    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Currently dispensing. Cannot insert coins");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing complete");
        machine.setItemInventory(machine.getItemInventory() - 1);
        machine.setBalance(machine.getBalance() - 1);
        machine.setState(new IdleState());
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Item still dispensing.");
    }
}
