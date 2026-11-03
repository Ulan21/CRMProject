import java.time.LocalDate;
import java.util.Locale;

public class Order {
    private int orderNumber;
    private String tovarName;
    private double orderPrice;
    private LocalDate orderDate;
    private Client client;
    private static int countOrder = 1;

    public Order(String tovarName, double orderPrice, LocalDate orderDate, Client client) {
        this.orderNumber = countOrder;
        countOrder++;
        this.tovarName = tovarName;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.client = client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getTovarName() {
        return tovarName;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString(){
        return orderNumber + " " + tovarName + " " + orderPrice +
                " " + orderDate + " " + client;
    }
}
