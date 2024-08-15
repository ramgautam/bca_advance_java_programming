package edu.viveka.rmi.server.warehouse;

import edu.viveka.rmi.server.HelloImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class WarehouseMain {
    public  static void main(String args[]) throws RemoteException{
        try {
            // Create the remote object
           WarehouseImpl centralWarehouse= new WarehouseImpl();

            // Bind the remote object in the registry
            Registry registry = LocateRegistry.createRegistry(1091);
            registry.rebind("Warehouse", centralWarehouse);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }

    }

}
