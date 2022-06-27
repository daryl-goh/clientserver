package clientserver.project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class HttpClient implements Runnable {
    
    Socket s;
    DataOutputStream dos;
    DataInputStream dis;
    BufferedReader br;
    Thread th;
    String usr;

    HttpClient() throws Exception {
        try{
            s = new Socket("127.0.0.1", 3000);
            System.out.println("Client has connected to Server!");
            dos = new DataOutputStream(s.getOutputStream());
            dis = new DataInputStream(s.getInputStream());
            br = new BufferedReader(new InputStreamReader(System.in));
            th = new Thread(this);
            th.start();
            
            while (true) {
                System.out.println("[Server]: " + dis.readUTF());

        }
    
        }

        catch (IOException ex) {}}


    public void run() 
    {
        while (true) {
            try
            {
                usr = br.readLine();
                dos.writeUTF(usr);
            }
            catch (Exception e) {}

            
        }

    }
    public static void main(String[] args) {
        try {new HttpClient();}

            catch (Exception e) {}
    }
   
   
}



  

 
