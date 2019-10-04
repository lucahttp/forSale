package domain;

public class Cliente {
    protected String nombre;
    protected String apellido;
    protected int DNI;


    Cliente(String elNombre, String elApellido, int elDNI){
        this.nombre = elNombre;
        this.apellido = elApellido;
        this.DNI = elDNI;
    }

    public void ConsultaPrecio(Cliente elCliente) {
        return ;
    }
}
