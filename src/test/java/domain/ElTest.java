package domain;

import domain.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class ElTest {
    private Depto departamento_delparque;
    private Zona villa_del_deportista;
    private Operacion operacion;

    @Before
        public void init(){
        this.operacion = new Venta();
        this.villa_del_deportista = new Zona("Villa del deportista",5000);
        this.departamento_delparque = new Depto(3,5,villa_del_deportista,operacion);
    }

    @Test
    public void simulacionDeCompraTest(){
        operacion.getComision();
        System.out.println();
        //Assert.assertEquals(2, this.gary.cantidadDeVisitas());
    }
}