package domain;

public abstract class inmueble {

    protected int metrosCuadrados;
    protected int cantidadAmbientes;
    protected Zona miZona;
    protected  Operacion operacion;
    protected

    inmueble(int cantidadAmbientes, int metrosCuadrados, Operacion laOperacion, Zona miZona){
        this.cantidadAmbientes = cantidadAmbientes;
        this.metrosCuadrados = metrosCuadrados;
        this.miZona = miZona;
        this.operacion = laOperacion;
    }



    public int plus(){
        return this.miZona.getPlus();
    }
    public void cambiarOperacion(Operacion operacion){
        System.out.println(operacion);
    }
    public int getPrecio(){
        return 1;
    }

}
