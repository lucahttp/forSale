package domain;

public abstract class estado_operacion extends Operacion{

    estado_operacion(Inmueble Inmueble, estado_operacion estado_operacion) {
        super();
    }

    public estado_operacion() {
        super();
    }



    public boolean estasCerrada(){
        return false;
    }
    public boolean estasReservada(){
        return false;
    }
    public void Reservar(Cliente elCliente,Empleado elEmpleado,Inmueble elInmueble){

    }
}
