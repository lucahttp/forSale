package domain;

public class Zona {
    protected int precio;
    protected String nombre;

    Zona(String nombre,int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPlus(){
        return this.precio;
    }
}
