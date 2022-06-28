import flyweight.InventorySystem;

public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();
        ims.takeOrder("Motorola", 29);
        ims.takeOrder("Videocon", 83);
        ims.takeOrder("Motorola", 29);
        ims.takeOrder("Suntech", 59);
        ims.takeOrder("Videocon", 84);
        ims.takeOrder("Motorola", 29);
        ims.takeOrder("Motorola", 29);
        ims.takeOrder("Motorola", 29);
        ims.takeOrder("Videocon", 29);
        ims.takeOrder("Suntech", 59);
        ims.takeOrder("Suntech", 59);
        ims.takeOrder("Suntech", 59);

        ims.process();

        System.out.println(ims.report());
    }

}
