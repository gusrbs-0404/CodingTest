package excepion.ex1;

public class NentworkServiceV1_2 {

    public void sendMessage(String data){
        String address = "http://localhost:8080/nentwork/message";
        NetworkClienV1 client = new NetworkClienV1(address);

        // 에러 추가
        client.initError(data);

        String connectResult = client.connect();
        // 결과가 성공이 아니다 -> 오류다
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생] " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
