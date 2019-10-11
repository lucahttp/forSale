package domain;

import java.util.List;

public abstract class Operacion {


    protected estado_operacion estadoActual;
    protected Inmueble inmueble;

    public Operacion() {
        this.estadoActual = new NoReservado();
    }

    //le hago un override en venta y alquiler para que se ajuste
    public double getComision(){
        return 1;
    }

    public boolean estaCerrada(){
        return this.estadoActual.estasCerrada();
    }
    public boolean estaReservada(){
        return this.estadoActual.estasReservada();
    }


    public Zona zonaDelInmueble(){
        return this.inmueble.miZona;
    }
}
