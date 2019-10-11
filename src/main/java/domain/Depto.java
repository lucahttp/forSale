package domain;

public class Depto extends Inmueble {
    protected int precioPorAmbiente = 350000;

    public Depto(int cantidadAmbientes, int metrosCuadrados, Zona miZona, Operacion laOperacion) {
        super(cantidadAmbientes, metrosCuadrados,laOperacion,miZona);
    }

    @Override
    public int getPrecio(){
        return this.precioPorAmbiente * this.cantidadAmbientes + this.miZona.precio ;
    }

}
