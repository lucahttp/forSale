package domain;

public class Casa extends inmueble {
    protected int precioParticular;

    Casa(int cantidadAmbientes, int metrosCuadrados, int precioParticular, Zona miZona,Operacion laOperacion) {
        super(cantidadAmbientes, metrosCuadrados,laOperacion,miZona);
        this.precioParticular = precioParticular;;
    }

    @Override
    public int getPrecio(){
        return this.precioParticular + this.miZona.precio;
    }
}
