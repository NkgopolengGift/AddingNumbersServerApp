package addingnumbersserverapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class AddingNumbersServerApp {

    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket ss = null;
        Socket socket = null;
        BufferedReader br = null;
        PrintWriter out = null;
        String data = null;
        
        try {
            ss = new ServerSocket(2020);
            System.out.println("waiting for client...");
            socket = ss.accept();
            
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            data = br.readLine();
            
            String[] numbers = data.split("#");
            
            Integer num1,  num2, results;
            
            String index0 = numbers[0];
            num1 = Integer.parseInt(index0);
                
            String index1 = numbers[1];
            num2 = Integer.parseInt(index1);
            
            results = num1 + num2;
            
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
            
            out.println("sum of "+num1+" and "+num2 + " is "+results);
            
            System.out.println("sum of "+num1+" and "+num2 + " is "+results);
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        
        
        
    }
    
    }
}
