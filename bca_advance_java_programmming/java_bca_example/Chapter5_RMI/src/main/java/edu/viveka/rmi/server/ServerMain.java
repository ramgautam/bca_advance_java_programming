package edu.viveka.rmi.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {
    public static void main(String[] args) {
        try {
            // Create the remote object
            HelloImpl obj = new HelloImpl();

            // Bind the remote object in the registry
            Registry registry = LocateRegistry.createRegistry(1091);
            registry.rebind("Hello", obj);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
