package edu.viveka.rmi.client;

import edu.viveka.rmi.server.Hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {

    public static void main(String[] args) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1091);

            // Look up the remote object
            Hello stub = (Hello) registry.lookup("Hello");

            // Call the remote method
            String response = stub.sayHello();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
