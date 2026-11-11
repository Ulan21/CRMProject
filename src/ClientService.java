import java.util.HashMap;
import java.util.Map;

public class ClientService {
    private Map<String,Client> clients = new HashMap<>();
    private int countClients = 1;


    public Client addClient(Client client) {
        String phone = client.getPhoneNumber();
        if (phoneExists(phone)) {
            System.out.println("Client with this number already exists");
            return clients.get(phone);
        }else{
            client.setClientId(countClients);
            countClients++;
            clients.put(phone,client);
        }
        return client;
    }

    public boolean phoneExists(String phone){
        return clients.containsKey(phone);
    }
}

