package domain;

public class Alquiler extends Operacion {
    private double cantidadMeses;
    Alquiler(Inmueble inmueble, estado_operacion estado_operacion, double cantidadMeses) {
        super();
        this.cantidadMeses = cantidadMeses;
    }
    @Override
    public double getComision(){
        return (this.inmueble.getPrecio() * this.cantidadMeses) / 50000;
    }
}
