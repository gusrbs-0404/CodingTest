package excepion.ex1;

public class NentworkServiceV1_1 {

    public void sendMessage(String data){
        String address = "http://localhost:8080/nentwork/message";
        NetworkClienV1 client = new NetworkClienV1(address);

        // 에러 추가
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
