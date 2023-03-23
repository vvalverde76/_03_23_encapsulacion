package com.adecco.modelo;

public class Producto {
    //el orden de las lineas no importa, lo unico que importa es que existan
    //Atributos
    //acceso mas restrictivo
    private int numProducto;
    private String nombreProducto;
    private double precioProducto;
    private int stockProducto;

    //Setters= metodo publico para asignar valor al atributo
    public void setNumProducto(int numProducto){
        this.numProducto=numProducto;
    }
    //Getters= metodo publico para devolver un valor
    public int getNumProducto(){
        return numProducto;
    }
    public void setnombreProducto(String nombreProducto){
        this.nombreProducto=nombreProducto;
    }
    public String getnombreProducto(){
        return nombreProducto;
    }
    public void setPrecioProducto(double precioProducto){
        this.precioProducto=precioProducto;
    }
    public double getPrecioProducto(){
        return precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }
    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

}
