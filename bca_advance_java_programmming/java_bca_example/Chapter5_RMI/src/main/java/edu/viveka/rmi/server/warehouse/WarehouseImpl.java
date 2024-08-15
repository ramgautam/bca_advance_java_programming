package edu.viveka.rmi.server.warehouse;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class WarehouseImpl extends UnicastRemoteObject implements Warehouse {
    private Map<String , Double> prices;
    public WarehouseImpl() throws RemoteException {
        super();
        prices= new HashMap<>();
        prices.put("Blackwell Tracker",24.5);
        prices.put("ZackXpress", 49.95);

    }

    @Override
    public double getPrice(String description) throws RemoteException {
        Double price=prices.get(description);
        return  price==null ?0:price;
    }
}
