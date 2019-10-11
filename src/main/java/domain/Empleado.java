package domain;


import java.util.List;
import java.util.stream.Collectors;

public class Empleado{
        private String nombre;
        Empleado(String elNombre){
            this.nombre = elNombre;

        }

        private List<Operacion> operaciones;


        private List<Operacion> operacionesCerradas(){
                return this.operaciones
                .stream()
                .filter(o -> o.estaCerrada())
                .collect(Collectors.toList());
                }

        private List<Operacion> operacionesReservadas(){
            return this.operaciones
                    .stream()
                    .filter(o -> o.estaReservada())
                    .collect(Collectors.toList());
                }

        private List<Zona> zonasOperacionesCerradas() {
            return operacionesCerradas()
                    .stream()
                    .map(o -> o.zonaDelInmueble())
                    .collect(Collectors.toList());
                }


        public boolean podesTenerProblemasCon(Empleado otroEmpleado){
                return cerrasteOperacionEnLaMismaZoneQue(otroEmpleado)
                && concretasteOperacionReservadaPor(otroEmpleado);
                }

        private boolean cerrasteOperacionEnLaMismaZoneQue(Empleado otroEmpleado){
                List<Zona> misZonas = zonasOperacionesCerradas();
                List<Zona> zonasDelOtro = otroEmpleado.zonasOperacionesCerradas();

                return misZonas.stream().anyMatch(z -> zonasDelOtro.contains(z));
                }
        private boolean concretasteOperacionReservadaPor(Empleado otroEmpleado){
                List<Operacion> operacionesReservadasPorElOtro = otroEmpleado.operacionesReservadas();
                return this.operacionesCerradas()
                .stream()
                .anyMatch(o -> operacionesReservadasPorElOtro.contains(o));
                }

}