import dosgali.Phone;
import java.io.*;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        do {
        try (Phone phone = new Phone("127.0.0.1", 8000)){

                System.out.println("Connected to server");
                String currentRoom;
                String[] rooms = {"Almaty", "Astana", "Shymkent", "Taraz", "Aktau", "Aktobe", "Taldyk"};
                Random rand = new Random();
                currentRoom = rooms [rand.nextInt( rooms.length)];
                System.out.println("City : " + currentRoom);
                phone.writeLine(currentRoom);
                String response = phone.readLine();
                System.out.println("City temperature: " + response);

        }catch (IOException e){
            e.printStackTrace();
        }
        }while (true);
    }
}
