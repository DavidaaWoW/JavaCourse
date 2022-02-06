package Fifth;

public class Item {
    int size;
    int price;
    double coefficient;
    public Item(int size, int price){
        this.price = price;
        this.size = size;
        this.coefficient = (double) price/size;
    }

    @Override
    public String toString() {
        return "Item{" +
                "size=" + size +
                ", price=" + price +
                ", coefficient=" + coefficient +
                '}';
    }
}
