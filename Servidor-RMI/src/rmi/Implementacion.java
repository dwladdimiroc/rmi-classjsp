package rmi;

import eda.Tweet;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi_interface.Interface;

/**
 *
 * @author Daniel Wladdimiro Cottet
 * @title Taller de sistemas distribuidos - Clase 1
 */

public class Implementacion extends UnicastRemoteObject implements Interface {
    
    static ArrayList<String> usuarios;
    
    static Logger logger;

    public Implementacion() throws RemoteException {
        logger = Logger.getLogger(getClass().getName());
        logger.log(Level.INFO, "Se ha instanciado la clase de Implementacion del Servidor");
        usuarios = new ArrayList<>();
    }

    /*
     * Debo escribir todos los métodos que se encuentran en la interface
     */
    // Por cada metodo se escribe Override que se utiliza para que utilize este metodo en vez del metodo del padre
    @Override
    public ArrayList<Tweet> verTweets() throws RemoteException {
        logger.log(Level.INFO, "Se desea ver los usuarios del servidor1");
        //Inicializamos el arreglo de tweets para retornarnos al cliente
        ArrayList<Tweet> tweets = new ArrayList<>();
        
        //Agregamos un tweet a la lista
        Tweet tweet = new Tweet(1, "@dwladdimiroc", "Terremoto en Chile");
        tweets.add(tweet);
        
        //Agregamos un segundo tweet a la lista
        tweet = new Tweet(2, "@24hrs", "Grado 8.2");
        tweets.add(tweet);
        
        //Agregamos un tercer tweet a la lista
        tweet = new Tweet(3, "@biobio", "Estaremos reportando");
        tweets.add(tweet);
        
        logger.log(Level.INFO, "Retorno de tweets");
        //Retornarnos todos los tweets
        return tweets;
    }

}
