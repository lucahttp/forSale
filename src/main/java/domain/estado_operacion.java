package domain;

public abstract class estado_operacion {
    enum EstadoActual{
        RESERVADO,
        NO_RESERVADO,
        VENDIDO
    }
    public abstract void Reservado();
    public abstract void NoReservado();
    public abstract void Vendido();
}
