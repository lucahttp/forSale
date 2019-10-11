package domain;

public class Reservado extends estado_operacion{


    Reservado(Inmueble Inmueble, estado_operacion estado_operacion) {
        super(Inmueble, estado_operacion);
    }
    @Override
    public boolean estasReservada(){
        return true;
    }
}
