/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author anticuchito
 */
public class Producto {
   String nombreProducto;
   String DescProducto;
   int PrecioProducto;
   float PrecioIva;

    public Producto() {
    }

    public Producto(String nombreProducto, String DescProducto, int PrecioProducto, float PrecioIva) {
        this.nombreProducto = nombreProducto;
        this.DescProducto = DescProducto;
        this.PrecioProducto = PrecioProducto;
        this.PrecioIva = PrecioIva;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescProducto() {
        return DescProducto;
    }

    public void setDescProducto(String DescProducto) {
        this.DescProducto = DescProducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public float getPrecioIva() {
        return PrecioIva;
    }

    public void setPrecioIva(float PrecioIva) {
        this.PrecioIva = PrecioIva;
    }
 
}
