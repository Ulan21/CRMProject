import java.time.LocalDate;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Client client1 = new Client("Ulan", "+7 777 7777", "Atyrau", "Tashenov 27");
        Client client2 = new Client("Qyran", "+7 777 7766", "Almaty", "Satpayev 133/7");
        Client client3 = new Client("Salamat", "+7 777 7755", "Shymkent", "Bigeldinov 10");
        Client client4 = new Client("Ulan", "+7 777 7788", "Aktau", "District 25");
        Client client5 = new Client("Gani", "+7 666 7788", "Oral", "Jalpaktal");

        ClientService clientService = new ClientService();
        clientService.addClient(client1);
        clientService.addClient(client2);
        clientService.addClient(client3);
        Client result = clientService.addClient(client4);
        clientService.addClient(client5);


        LocalDate order1Date = LocalDate.of(2026, 10, 28);
        LocalDate order2Date = LocalDate.of(2026, 11, 13);
        LocalDate order3Date = LocalDate.of(2026, 8, 10);
        Order order1 = new Order("Potter", 350000, order1Date, client1);
        Order order2 = new Order("Akril", 18000, order2Date, client2);
        Order order3 = new Order("PVC", 44000, order2Date, client4);
        Order order4 = new Order("PVC", 44000, order3Date, client3);
        Order order5 = new Order("Akril", 456677, order3Date, result);


        OrderService orderService = new OrderService();
        orderService.addOrder(order1);
        orderService.addOrder(order2);
        orderService.addOrder(order3);
        orderService.addOrder(order4);
        orderService.addOrder(order5);


        int choice = 1;
        while (choice != 0) {
            try {
                System.out.println("Menu:  1 - All orders  2 - Order by Date  3 - Add a client  4 - Add a new order  0 - Exit  ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> orderService.printallOrders();
                    case 2 -> orderService.orderByDate();
                    case 0 -> System.out.println("0 - Exit");
                    case 3 -> {
                        scanner.nextLine();
                        System.out.println("Type a phone: ");
                        String phone = scanner.nextLine();
                        if (clientService.phoneExists(phone)) {
                            System.out.println("Phone already exists");
                        } else {
                            System.out.println("Type a name: ");
                            String name = scanner.nextLine();
                            System.out.println("Type a client City: ");
                            String clientCity = scanner.nextLine();
                            System.out.println("Type a client address: ");
                            String clientAddress = scanner.nextLine();
                            Client client6 = new Client(name, phone, clientCity, clientAddress);
                            Client resultt = clientService.addClient(client6);
                            System.out.println(resultt);
                        }
                    }
                    case 4 -> {
                            scanner.nextLine();
                        System.out.println("Type a phone: ");
                        String phone = scanner.nextLine();
                        Client hasClient = clientService.searchByNumber(phone);
                        if (hasClient == null) {
                                System.out.println("We dont have client with this number");
                            }
                        else{
                            System.out.println("Type a order name");
                            String orderName = scanner.nextLine();
                            System.out.println("Type a order price");
                            int orderPrice = scanner.nextInt();
                            System.out.println("Type a order date");
                            scanner.nextLine();
                            String date = scanner.nextLine();
                            LocalDate orderDate = LocalDate.parse(date);
                            Order newOrder = new Order(orderName,orderPrice,orderDate,hasClient);
                            orderService.addOrder(newOrder);
                            System.out.println(newOrder);
                        }
                    }
                    default -> System.out.println("Wrong input");
                }
            } catch (Exception e) {
                System.out.println("Type only numbers");
                scanner.nextLine();
                System.out.println();
            }


        }

    }
}

