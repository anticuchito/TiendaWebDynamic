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
   private String nombreProducto;
   private  String DescProducto;
   private  String imgProducto;
   private  int PrecioProducto;
   private  float PrecioIva;
   private  int Largo; 
   private  int Ancho;
   private  int Alto ;
   private  float Peso ;

    public Producto() {
    }

    public Producto(String nombreProducto, String DescProducto, String imgProducto, int PrecioProducto, float PrecioIva, int Largo, int Ancho, int Alto, float Peso) {
        this.nombreProducto = nombreProducto;
        this.DescProducto = DescProducto;
        this.imgProducto = imgProducto;
        this.PrecioProducto = PrecioProducto;
        this.PrecioIva = PrecioIva;
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Peso = Peso;
    }

    public String getImgProducto() {
        return imgProducto;
    }

    public void setImgProducto(String imgProducto) {
        this.imgProducto = imgProducto;
    }


    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int Alto) {
        this.Alto = Alto;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
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
