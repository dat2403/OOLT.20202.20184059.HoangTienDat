import java.util.ArrayList;
import java.util.Random;

public class Order {
    private static final int MAX_NUMBERS_ORDERED = 10;
    private final ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);

    public void addDigitalVideoDisc(DigitalVideoDisc  disc){
        if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
        } else {
            System.out.println("max limit reached");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc  disc){
        for (DigitalVideoDisc item : itemsOrdered) {
            if(item.getTitle().equals(disc.getTitle())) {
                itemsOrdered.remove(disc);
                return;
            }
        }
    }

    public float totalCost(){
        float total = 0;
        for (DigitalVideoDisc item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }

    public DigitalVideoDisc getALuckyItem(){
        if(itemsOrdered.isEmpty()) {
            return null;
        } else {
            int index = new Random().nextInt(itemsOrdered.size()); // [0 -> size - 1]
            DigitalVideoDisc disc = itemsOrdered.get(index);
            removeDigitalVideoDisc(disc);
            return disc;
        }
    }
}
