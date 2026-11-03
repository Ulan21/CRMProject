public class Client {
    private int clientId;
    private String name;
    private String phoneNumber;
    private String clientCity;
    private String clientaddress;

    public Client(String name, String phoneNumber, String clientCity, String clientaddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.clientCity = clientCity;
        this.clientaddress = clientaddress;
    }


    public int getClientId(){
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getClientCity() {
        return clientCity;
    }

    public String getClientaddress() {
        return clientaddress;
    }


    @Override
    public String toString(){
        return clientId + " " + name + " " + phoneNumber + " " + clientCity+
                " " + clientaddress;
    }

}