/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Socio;

/**
 *
 * @author Ismael
 */
/**
 * La clase Pedido representa un pedido en un sistema.
 */
public class Pedido {
    private int id;
    private String descripcion;
    private boolean cumplimentado;

    /**
     * Constructor de la clase Pedido.
     * @param id          El identificador único del pedido.
     * @param descripcion La descripción del pedido.
     */
    public Pedido(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.cumplimentado = false;
    }

    /**
     * Método para cumplimentar un pedido.
     */
    public void cumplimentar() {
        this.cumplimentado = true;
        // Lógica adicional para cumplimentar el pedido
    }

    /**
     * Método para verificar si un pedido ha sido cumplimentado.
     * @return true si el pedido ha sido cumplimentado, false en caso contrario.
     */
    public boolean estaCumplimentado() {
        return cumplimentado;
    }
}