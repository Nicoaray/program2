/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerclaseprogram2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
public class acciones {

    empleado n1 = new empleado();

    public void CalcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nacimiento = LocalDate.parse(n1.getFechaNacimiento(),formatter);
        LocalDate fechaActual = LocalDate.now();

     

        int edad = fechaActual.getYear()-nacimiento.getYear();
        System.out.println("la edad de la persona es: "+edad);
    }

   
    

    public void MostrarDatos() {
        System.out.println(n1.getApellido());
        System.out.println(n1.getNombre());
        System.out.println(n1.getDomicilio());
        System.out.println(n1.getSueldo());
        System.out.println(n1.getDni());
        System.out.println(n1.getFechaNacimiento());
    }

}
