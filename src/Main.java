import java.time.LocalDate;


public class Main{

    public static void main(String[] args) {
            Client client1 = new Client("Ulan","+7 777 7777","Atyrau","Tashenov 27");
            Client client2 = new Client("Qyran","+7 777 7766","Almaty","Satpayev 133/7");
            Client client3 = new Client("Ulan","+7 777 7755","Shymkent","Bigeldinov 10");
            Client client4 = new Client("Ulan","+7 777 7777","Aktau","25dist");
            Client client5 = new Client("Sabit","+7 666 7777","Oral","Jalpaktal");
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


//            orderService.printallOrders();
//            orderService.orderByDate();




             ClientService clientService = new ClientService();
                clientService.addClient(client1);
                clientService.addClient(client2);
                clientService.addClient(client3);
                clientService.addClient(client4);
                clientService.addClient(client5);


            System.out.println(client1);
            System.out.println(client2);
            System.out.println(client3);
            System.out.println(client4);
            System.out.println(client5);
        }
    }

