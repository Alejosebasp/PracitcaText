/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatext;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Universidad {
    
    public String nombre;
    public String nit;
    public ArrayList <Programa> programas;
    public ArrayList <Estudiante> estudiantes;

    public Universidad(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.programas = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    
    public void añadirEstudiante(int edad, String nombre, char genero, Date fechaDeNacimiento, int codigo){
        Estudiante estudiante = new Estudiante(edad, nombre, genero, fechaDeNacimiento, codigo);
        estudiantes.add(estudiante);
    }
    
    public void añadirPrograma(String nombre, String departamento){
        Programa programa = new Programa(nombre, departamento);
        programas.add(programa);
    }
}
