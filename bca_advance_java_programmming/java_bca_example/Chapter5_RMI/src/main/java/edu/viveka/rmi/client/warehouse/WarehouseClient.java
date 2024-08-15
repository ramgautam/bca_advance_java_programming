package edu.viveka.rmi.client.warehouse;

import edu.viveka.rmi.server.Hello;
import edu.viveka.rmi.server.warehouse.Warehouse;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class WarehouseClient {

    public static void main(String[] args) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1091);

            // Look up the remote object
            Warehouse stub = (Warehouse) registry.lookup("Warehouse");


            // Call the remote method
            String description= "Blackwell Tracker";
            double price = stub.getPrice(description);
            System.out.println("Price from remote method: " + price);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
