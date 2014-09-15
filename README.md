RMI - Clase JSP
==========

Ejemplo simple creado con Netbeans 8.0, en el cual está tanto el cliente como servidor de forma independiente. Para su ejecución se debe compilar el Cliente-RMI como JSP, debido que utiliza tanto Java Application Web como Java-RMI. El Servidor por otra parte, utiliza solo Java, y se compila de forma normal.

Dentro del proyecto Cliente-RMI está la conexión realizada con el Servidor-RMI, de tal manera que ambos deben poseer la misma IP y puertos para su funcionamiento. Por lo tanto, se deberá ejecutar primero la aplicación del servidor y posterior la del cliente.

El ejemplo se basa en una página web simple de tal manera de poder realizar una consula al servidor y la información que me entrega mostrarla por la interfaz. Se utiliza tanto JSP con RMI, el cual realizará la conexión entre el Cliente y el Servidor. Dentro de las cosas extras que están en este proyecto es la integración de Bootstrap, el cual es una framework para la base de HTML y CSS.

A continuación, dejamos un ejemplo de cómo debería resultar la ejecución del programa.

![Alt text](https://raw.githubusercontent.com/dwladdimiroc/rmi-classjsp/master/Misc/Example.png "Resultado de la conexión")
