public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.insertCoin();
        machine.dispenseItem();
        machine.selectItem();
        System.out.println();

        machine.selectItem();
        machine.dispenseItem();
        machine.insertCoin();
        System.out.println();

        machine.selectItem();
        machine.insertCoin();
        machine.setOutOfOrder();
        machine.dispenseItem();
        System.out.println();

        machine.insertCoin();
        machine.dispenseItem();
        machine.selectItem();
        machine.setOutOfOrder();
        System.out.println();

        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();
        machine.setOutOfOrder();
    }
}
