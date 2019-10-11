package domain;

public class Vendido extends estado_operacion{
    Vendido(estado_operacion estado_operacion) {
        super();
    }
    @Override
    public boolean estasCerrada(){
        return true;
    }
}
