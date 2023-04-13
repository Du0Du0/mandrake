package popcorn03;
import java.io*;
import java.net*;

// git SSH, id_rsa 1 번째 커밋 시 기록
// git SSh, id_rsa.pub 2 번째 커밋 시 기록
// git SSH, 1:1 echo Server/Client 3 번째 커밋 시 기록
public class Echo 1Server {
        public static void main(String[]args) throws IOExecption {
            ServerSocket server = null;
            Socket connection = null;
            BufferdReader in = null;

            try {
                server = new ServerSocket(5000);
            } catch (IOExecption e) {
            }

            Systen.out.println("연결 대기 중......");

            try {
                connection = serfverf.accept();
            } catch (IOExecption e) {
            }

            System.out.println("메세지를 기다리는 중.....");

            in = new BufferdReader(new InputStreamReader(connection.getInputStream()));

            String msg;

            System.out.print ("보낼 메세지가 있나요?");
            while ((msg = in.nextLine() ! = null) {
                if (msg.contains("bye"))
                break;
                out.println(msg);
                System.out.print("보낼 메세지가 더 있나요?");
            }

            System.out.println("Client Out")
            out.close();
            in.close();
            client.close();
        }
    }
