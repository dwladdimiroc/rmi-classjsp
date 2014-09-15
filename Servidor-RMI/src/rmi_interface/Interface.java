
package rmi_interface;

import eda.Tweet;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Daniel Wladdimiro Cottet
 * @title Taller de sistemas distribuidos - Clase 1
 */


//Esta inteface indicará los métodos que están a dispoción del cliente y servidor
//para que puedan interactuar remotamente.
//Todos estos métodos deben poseer como mínimo la excepción RemoteException


public interface Interface extends Remote {
    public ArrayList<Tweet> verTweets() throws RemoteException;
}