package edu.viveka.rmi.server.warehouse;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Warehouse extends Remote {
    double getPrice(String description ) throws RemoteException;
}
