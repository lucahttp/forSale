package domain;

public class Ph extends inmueble {
    protected int precioBase = 500000;
    protected int precioPorMetroCuadrado =  14000;

    Ph(int cantidadAmbientes, int metrosCuadrados, Zona miZona,Operacion laOperacion) {
        super(cantidadAmbientes, metrosCuadrados,laOperacion,miZona);
    }

    @Override
    public int getPrecio(){
        return this.precioBase + this.miZona.precio + (this.precioPorMetroCuadrado * this.metrosCuadrados);
    }
}
