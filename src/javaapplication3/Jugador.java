
package javaapplication3;


public class Jugador extends Persona{
    private String equipoOrigen;
    private String equipoActual;
    private String posicion;

    public Jugador() {
    }

    public Jugador(String equipoOrigen, String equipoActual, String posicion, String rut, String nombre, String paterno, String materno, int edad, String tipo) {
        super(rut, nombre, paterno, materno, edad, tipo);
        this.equipoOrigen = equipoOrigen;
        this.equipoActual = equipoActual;
        this.posicion = posicion;
    }

   

    @Override
    public void jugar() {
        System.out.println("El Jugador Debuta Hoy");
    }

    public String getEquipoOrigen() {
        return equipoOrigen;
    }

    public void setEquipoOrigen(String equipoOrigen) {
        this.equipoOrigen = equipoOrigen;
    }

    public String getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(String equipoActual) {
        this.equipoActual = equipoActual;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void entrevistar(){
        System.out.println("El jugador dio una entrevista");
    }
    
}
