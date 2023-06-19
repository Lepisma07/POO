/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Socio to edit this template
 */
package Socio;
/**
 *
 * @author Ismael
 */

/**
 * La clase Socio representa a un socio en un sistema.
 */
public class Socio {
    private String email;
    private String direccion;

    /**
     * Constructor de la clase Socio.
     * @param email     El correo electrónico del socio.
     * @param direccion La dirección del socio.
     */
    public Socio(String email, String direccion) {
        this.email = email;
        this.direccion = direccion;
    }

    /**
     * Método para visualizar un pedido.
     * @param pedido El pedido que se desea visualizar.
     */
    public void visualizar(Pedido pedido) {
        // Lógica para visualizar el pedido
    }

    /**
     * Método para cancelar un pedido antes de ser cumplimentado por el almacén.
     * @param pedido El pedido que se desea cancelar.
     */
    public void cancelar(Pedido pedido) {
        // Lógica para cancelar el pedido antes de ser cumplimentado por el almacén
    }

    /**
     * Método para modificar los datos personales del socio.
     */
    public void modificarDatosPersonales() {
        // Lógica para modificar los datos personales del socio
    }
}
