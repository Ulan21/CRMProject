import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        orders.add(order);
    }

    public void printallOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

        public void clientByNumber(String clientNumber){
            for (Order zakaznumber: orders){
                if(zakaznumber.getClient().getPhoneNumber().equals(clientNumber)){
                    System.out.println(zakaznumber);
                }
            }
        }





    }

