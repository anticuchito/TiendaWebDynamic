/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author anticuchito
 */
public class Pedido {

    private String NombreCliente;
    private String ApellidoCliente;
    private String DireccionPedido;
    private int cantidadPedido;
    private int pesoPedido;
    private ArrayList<Producto> listaProductos;
    private Usuario usuario;

    public Pedido() {
    }

    public Pedido(String NombreCliente, String ApellidoCliente, String DireccionPedido, int cantidadPedido, int pesoPedido, ArrayList<Producto> listaProductos, Usuario usuario) {
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.DireccionPedido = DireccionPedido;
        this.cantidadPedido = cantidadPedido;
        this.pesoPedido = pesoPedido;
        this.listaProductos = listaProductos;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getDireccionPedido() {
        return DireccionPedido;
    }

    public void setDireccionPedido(String DireccionPedido) {
        this.DireccionPedido = DireccionPedido;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public int getPesoPedido() {
        return pesoPedido;
    }

    public void setPesoPedido(int pesoPedido) {
        this.pesoPedido = pesoPedido;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

}
