public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(5);
        machine.insertCoin(5.0);
        machine.dispenseItem();
        machine.selectItem("Coca-Cola");
        System.out.println();

        machine.selectItem("Fanta");
        machine.dispenseItem();
        machine.insertCoin(10.0);
        System.out.println();

        machine.selectItem("Pepsi");
        machine.insertCoin(4.0);
        machine.setOutOfOrder();
        machine.dispenseItem();
        System.out.println();

        machine.insertCoin(6.0);
        machine.dispenseItem();
        machine.selectItem("RC");
        machine.setOutOfOrder();
        System.out.println();

        machine.selectItem("Mountain Dew");
        machine.insertCoin(14.0);
        machine.dispenseItem();
        machine.setOutOfOrder();
    }
}
