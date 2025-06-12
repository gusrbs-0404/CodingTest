package excepion.ex0;

public class NentworkServiceV0 {

    public void sendMessage(String msg){
        String address = "http://localhost:8080/nentwork/message";
        NetworkClienV0 client = new NetworkClienV0(address);

        client.connect();
        client.send(msg);
        client.disconnect();
    }
}
