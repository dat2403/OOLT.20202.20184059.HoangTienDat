public class DiskTest {
    public static void main(String[] args) {
        Order order = new Order();

        DigitalVideoDisc disc = new DigitalVideoDisc("Harry Potter", "", "", 0, 1);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Harry Potter 2", "", "", 0, 2);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Harry Potter 3", "", "", 0, 3);

        order.addDigitalVideoDisc(disc);
        order.addDigitalVideoDisc(disc2);
        order.addDigitalVideoDisc(disc3);

        System.out.println(order.totalCost());

        DigitalVideoDisc luckyItem = order.getALuckyItem();
        System.out.println(luckyItem.getTitle());

        System.out.println(order.totalCost());



    }
}
