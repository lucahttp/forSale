package domain;

public class Venta extends Operacion {
    private static double procentajeComision = 0.1;


    @Override
    public double getComision(){
        return this.inmueble.getPrecio() * procentajeComision;
    }

}
