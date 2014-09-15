package cliente;

import eda.Tweet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.ConexionCliente;
import rmi_interface.Interface;

/**
 *
 * @author Daniel Wladdimiro Cottet
 * @title Taller de sistemas distribuidos - Clase 1
 */
public class Cliente {

    public int Puerto;                       //Número del puerto que está alojado el servidor
    public String IPServer;                  //Dirección IP del servidor, la cual podría utilizarse por defecto el localhost
    public String nombreReferenciaRemota;    // Nombre del objeto subido
    
    static Logger logger;

    public Cliente() {
        logger = Logger.getLogger(getClass().getName());
        logger.log(Level.INFO, "Se ha instanciado la clase Cliente");
        this.Puerto = 2014;
        this.IPServer = "localhost";
        this.nombreReferenciaRemota = "Tweets";
    }

    public ArrayList<Tweet> inicializar() {
        ArrayList<Tweet> tweets = null; //Retorno de los datos
        Interface objetoRemoto; //Se crea un nuevo objeto llamado objetoRemoto

        //Se instancia el objeto que conecta con el servidor
        ConexionCliente conexion = new ConexionCliente();
       
        logger.log(Level.INFO, "Inicializar conexion");
        
        try {
            //Se conecta con el servidor
            if (conexion.iniciarRegistro(IPServer, Puerto, nombreReferenciaRemota)) {
                //Se obtiene la referencia al objeto remoto
                objetoRemoto = conexion.getServidor();
                tweets = objetoRemoto.verTweets();
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error..." + e);
        }

        return tweets;
    }
}
