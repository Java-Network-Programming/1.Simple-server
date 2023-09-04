import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) {
        try{

           System.out.println("Before creating server");
           ServerSocket server =new ServerSocket(50001);
           System.out.println("After creating server socket");

           System.out.println("Before client accept");
           Socket client = server.accept();
           System.out.println("After client accept");

           System.out.println("Before writing data to client");
           DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
           dataOutputStream.writeBytes("Hellow");
           System.out.println("After writing data to client");

           System.out.println("Before closing to client");

           client.close();
           System.out.println("after closing to client");
       }

   catch (IOException e){
         e.printStackTrace();
   }


 }
}
