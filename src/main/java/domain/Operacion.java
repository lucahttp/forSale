package domain;

public abstract class Operacion extends estado_operacion {
    enum OPERACION {
        VENTA,
        ALQUILER
    }

    protected OPERACION operacion;
    protected estado_operacion estadoActual;




    Operacion(OPERACION tipoOperacion, estado_operacion estado_operacion){
        this.operacion = tipoOperacion;
        this.estadoActual = estado_operacion;
    }

}
