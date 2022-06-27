package clientserver.project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer implements Runnable {
    
    ServerSocket server;
    Socket s;
    DataOutputStream dos;
    DataInputStream dis;
    BufferedReader br;
    Thread th;
    String usr;

    HttpServer() throws Exception {
        try{
            server = new ServerSocket(3000);
            s = server.accept();
            System.out.println("Server has connected to Client!");
            dos = new DataOutputStream(s.getOutputStream());
            dis = new DataInputStream(s.getInputStream());
            br = new BufferedReader(new InputStreamReader(System.in));
            th = new Thread(this);
            th.start();
            
            while (true) {
                System.out.println("[Client]: " + dis.readUTF());

        }
    
        }

        catch (IOException ex) {}}


    public void run() 
    {
        while (true) {
            try
            {   
                //whenever user writes an input, usr will read input
                usr = br.readLine();
                //user input in usr will be written to client using writeUTF
                dos.writeUTF(usr);
            }catch (Exception e) {}
            

            
        }

    }
    public static void main(String[] args) {
            
        try {new HttpServer();}

            catch (Exception e) {}
    }
   
   
}



  

 
