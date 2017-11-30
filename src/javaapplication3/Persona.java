
package javaapplication3;



public abstract class Persona implements Seleccionable{
    //Declaracion de variables
    protected String rut;
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected int edad;
    protected String tipo;

    //Constructor sin parametros
    public Persona() {
    }
    //Constructor con parametros
    public Persona(String rut, String nombre, String paterno, String materno, int edad, String tipo) {
        this.rut = rut;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String mostrar() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", edad=" + edad + ", tipo=" + tipo + '}';
    }

    

}
