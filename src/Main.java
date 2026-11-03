import java.time.LocalDate;


public class Main{

    public static void main(String[] args) {
            Client client1 = new Client("Ulan","+7 777 7777","Atyrau","Tashenov 27");
            Client client3 = new Client("Ulan","+7 777 7755","Shymkent","Bigeldinov 10");
            Client client2 = new Client("Qyran","+7 777 7766","Almaty","Satpayev 133                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            /7");
            LocalDate order1Date = LocalDate.of(2026,10,28);
            LocalDate order2Date = LocalDate.of(2026,11,13);
            LocalDate order3Date = LocalDate.of(2026,8,10);
            Order order1 = new Order("Potter",350000,order1Date,client1);
            Order order2 = new Order("Akril",18000,order2Date,client2);
            Order order3 = new Order("PVC",44000,order2Date,client1);
            Order order4 = new Order("PVC",44000,order3Date,client3);

            OrderService orderService = new OrderService();
            orderService.addOrder(order1);
            orderService.addOrder(order2);
            orderService.addOrder(order3);
            orderService.addOrder(order4);

            orderService.printallOrders();

//            System.out.println("--Заказы");
//            orderService.clientByNumber("+7 777 7777");
//            orderService.clientByNumber("+7 777 7766");

        }
    }

