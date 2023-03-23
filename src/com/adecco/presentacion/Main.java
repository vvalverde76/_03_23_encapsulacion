package com.adecco.presentacion;

import com.adecco.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        //instaciar un producto
        Producto p1 = new Producto();
        p1.setNumProducto(1);
        System.out.println("Numero de producto " + p1.getNumProducto());
        p1.setnombreProducto("raton inalambrico");
        System.out.println("Nombre de producto " + p1.getnombreProducto());
        p1.setPrecioProducto(6.75);
        System.out.println("Precio producto es " + p1.getPrecioProducto()+"€");
        p1.setStockProducto(100);
        System.out.println("Cantidad en esxistencia "+ p1.getStockProducto());
    }

}