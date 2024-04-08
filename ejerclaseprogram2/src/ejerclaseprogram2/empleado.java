/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerclaseprogram2;

/**
 *
 * Actividad. Defina la clase Empleado, esta clase debe almacenar la siguiente
 * información dni, nombre, apellido, domicilio, fecha nacimiento y sueldo
 * bruto. Todos estos datos son de tipo String excepto el sueldo bruto que es
 * double. Todos los atributos son de acceso privado. * Defina el método
 * constructor de la clase * Instancie 3 objetos * Realice método
 * calcular_edad() * Realice método mostrar_datos()
 *
 * Realice el diagrama de clases de la clase empleado * Subir código y diagrama
 * en un archivo word.
 */
public class empleado {

    private String dni="418882475";
    private String nombre="nicolas";
    private String apellido="araya";
    private String domicilio="Mathus hoyos 741";
    private String fechaNacimiento="28/04/1999";
    private Double sueldo=230000.52;

    public empleado() {
    }

    public empleado(String dni, String nombre, String apellido, String domicilio, String fechaNacimiento, Double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
    }

    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
}
